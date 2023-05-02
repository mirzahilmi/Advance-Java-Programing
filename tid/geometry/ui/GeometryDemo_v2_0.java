package tid.geometry.ui;

import java.util.Scanner;
import tid.geometry.generalshapes.*;

// Miza Hilmi Shodiq
// 225150707111067

public class GeometryDemo_v2_0 {

  public static void main(String[] args) {
    final String PROGRAM_NAME = "Geometry Demo v2.0";
    final String PROGRAM_AUTHOR = "by Mirza Hilmi Shodiq";
    final String PROGRAM_MENU =
      "Pilih salah satu bangun geometri berikut:\n1. Lingkaran\n2. Persegi panjang\nPilihan: ";
    System.out.printf("%s\n%s", PROGRAM_NAME, PROGRAM_AUTHOR);

    Scanner sc = new Scanner(System.in);

    System.out.print("\n" + PROGRAM_MENU);
    String choose = sc.nextLine();
    System.out.println();

    switch (choose) {
      case "1":
        System.out.println("Dimensi lingkaran\n=====================");

        System.out.print("Masukkan radius (m): ");
        Circle lingkaran = new Circle(sc.nextDouble());

        System.out.printf(
          "Radius: %.2f m\nLuas: %.2f m2\nKelliling: %.2f m\n",
          lingkaran.getRad(),
          lingkaran.getArea(),
          lingkaran.getCircumference()
        );
        break;
      case "2":
        System.out.println("Dimensi persegi panjang\n=====================");

        System.out.print("Masukkan panjang (m): ");
        int p = sc.nextInt();
        System.out.print("Masukkan lebar (m): ");
        int l = sc.nextInt();

        Rectangle persegi = new Rectangle(p, l);

        System.out.printf(
          "Panjang: %d m\nLebar: %d m\nLuas: %d m2\nKelliling: %d m\n",
          persegi.getLength(),
          persegi.getWidth(),
          persegi.getArea(),
          persegi.getCircumference()
        );
        break;
      default:
        System.out.println("Please choose 1 or 2");
    }
    sc.nextLine();

    sc.close();
  }
}
