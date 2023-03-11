package tid.geometry.ui;

import tid.geometry.generalshapes.*;
import java.util.Scanner;

// Miza Hilmi Shodiq
// 225150707111067

public class GeometryDemo_v1_0 {
    public static void main(String[] args) {
        final String PROGRAM_NAME = "Geometry Demo v1.0";
        final String PROGRAM_AUTHOR = "by Mirza Hilmi Shodiq";
        final String PROGRAM_MENU = "Pilih salah satu bangun geometri berikut:\n1. Lingkaran\n2. Persegi panjang\nPilihan: ";
        System.out.printf("%s\n%s", PROGRAM_NAME, PROGRAM_AUTHOR);

        Scanner sc = new Scanner(System.in);

        Circle lingkaran = new Circle();
        Rectangle persegi = new Rectangle();

        boolean isValid = true;

        while (isValid) {
            System.out.print("\n" + PROGRAM_MENU);
            String choose = sc.nextLine();
            System.out.println();

            switch (choose) {
                case "1":
                    System.out.println("Dimensi lingkaran\n=====================");

                    System.out.print("Masukkan radius (m): ");
                    lingkaran.setRad(sc.nextDouble());

                    System.out.printf("Radius: %.2f m\nLuas: %.2f m2\nKelliling: %.2f m\n",
                            lingkaran.getRad(), lingkaran.getArea(), lingkaran.getCircumference());
                    break;
                case "2":
                    System.out.println("Dimensi persegi panjang\n=====================");

                    System.out.print("Masukkan panjang (m): ");
                    persegi.setLength(sc.nextInt());
                    System.out.print("Masukkan lebar (m): ");
                    persegi.setWidth(sc.nextInt());

                    System.out.printf("Panjang: %d m\nLebar: %d m\nLuas: %d m2\nKelliling: %d m\n",
                            persegi.getLength(), persegi.getWidth(), persegi.getArea(), persegi.getCircumference());
                    break;
                default:
                    isValid = false;
            }
            sc.nextLine();
        }
        sc.close();
    }
}
