import java.util.Scanner;

import shape.Circle;

public class GeoDemo {
    public static void main(String[] args) {
        Point P = new Point();
        Circle C = new Circle();

        Scanner sc = new Scanner(System.in);

        System.out.printf("Masukkan koordinat titik p:\n\tKoordinat x: ");
        P.setX(sc.nextInt());
        System.out.printf("\tKoordinat y: ");
        P.setY(sc.nextInt());
        System.out.println();
        sc.nextLine();

        System.out.printf("Koordinat titik p adalah (%d, %d)\n\n", P.getX(), P.getY());

        System.out.printf("Masukkan radius lingkaran C: ");
        C.setRad(sc.nextDouble());
        sc.nextLine();

        System.out.printf("\nData lingkaran C:\n\tRadius: %.2f\n\tLuas: %.2f\n\tKeliling: %.2f\n", C.getRad(),
                C.getArea(), C.getCircumference());
        sc.close();
    }
}
