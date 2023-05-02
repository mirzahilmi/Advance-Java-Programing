package tid.geometry.ui;

import java.util.Scanner;
import tid.geometry.specialshapes.one.Circle;

public class GeometryDemo_v3_0_1 {

  public static void main(String[] args) {
    final String PROGRAM_NAME = "Geometry Demo v3.0";
    final String PROGRAM_AUTHOR = "by Mirza Hilmi Shodiq";
    final String PROGRAM_OPTION = "Ada berapa lingkaran yang akan dibuat? ";
    System.out.printf(
      "%s\n%s\n%s\n\n%s",
      PROGRAM_NAME,
      PROGRAM_AUTHOR,
      "=======================",
      PROGRAM_OPTION
    );

    Scanner sc = new Scanner(System.in);

    Circle[] lingkaran = new Circle[sc.nextInt()];

    for (int i = 0, j = 1; i < lingkaran.length; i++, j++) {
      System.out.printf("Masukkan ID lingkaran %d: ", j);
      int id = sc.nextInt();
      System.out.printf("Masukkan radius lingkaran %d (m): ", j);
      double rad = sc.nextDouble();
      lingkaran[i] = new Circle(rad, id);
    }

    System.out.println();

    for (int i = 0; i < lingkaran.length; i++) {
      System.out.printf(
        "Lingkaran ke-%d:\nID:\t\tL%d\nRadius:\t\t%.2f m\nLuas:\t\t%.2f m2\nKeliling:\t%.2f m\n\n",
        lingkaran[i].getID(),
        lingkaran[i].getID(),
        lingkaran[i].getRad(),
        lingkaran[i].getArea(),
        lingkaran[i].getCircumference()
      );
    }

    sc.close();
  }
}
