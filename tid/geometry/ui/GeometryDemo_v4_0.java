package tid.geometry.ui;

import tid.geometry.specialshapes.three.Circle;
import java.util.Scanner;

public class GeometryDemo_v4_0 {
    public static void main(String[] args) {
        final String PROGRAM_NAME = "Geometry Demo v3.0.2 Revision";
        final String PROGRAM_AUTHOR = "by Mirza Hilmi Shodiq";
        final String PROGRAM_OPTION = "Ada berapa lingkaran yang akan dibuat? ";
        System.out.printf("%s\n%s\n%s\n\n%s",
        PROGRAM_NAME, PROGRAM_AUTHOR, "=======================", PROGRAM_OPTION);

        Scanner sc = new Scanner(System.in);

        Circle[] lingkarans = new Circle[sc.nextInt()];

        for (int i = 0, j = 1; i < lingkarans.length; i++, j++) {
            System.out.printf("Masukkan radius lingkaran %d (m): ", j);
            lingkarans[i] = new Circle(sc.nextDouble());
        }

        System.out.println();

        for (Circle lingkaran : lingkarans) {
            System.out.printf("Lingkaran ke-%s:\nID\t\t: %s\nRadius\t\t: %.2f m\nLuas\t\t: %.2f m2\nKeliling\t: %.2f m\n\n",
            lingkaran.getID(), lingkaran.getID(), lingkaran.getRad(), lingkaran.getArea(), lingkaran.getCircumference());
        }

        sc.close();
    }
}
