package uts.geometry.ui;

import java.util.Scanner;
import uts.geometry.specialshapes.*;

// Mirza Hilmi Shodiq
// 225150707111067

public class GrowingCircleDemo {

   public static void main(String[] args) {
      final String PROGRAM = "Growing Circles v1.0";
      final String IDENTITY = "by [Mirza Hilmi Shodiq]";
      final String LINE = "============================";

      Scanner input = new Scanner(System.in);
      int numberOfCircles, xO, yO;
      GrowingCircle[] allCircles;
      String id;
      double radius;

      System.out.printf("\n%s\n%s\n%s\n", PROGRAM, IDENTITY, LINE);

      System.out.print("Ada berapa lingkaran tumbuh yang akan dibuat? ");
      numberOfCircles = input.nextInt();
      allCircles = new GrowingCircle[numberOfCircles];
      input.nextLine();

      System.out.print("Masukkan radius lingkaran pertama (m): ");
      radius = input.nextDouble();

      System.out.print("Masukkan koordinat x titik asalnya: ");
      xO = input.nextInt();

      System.out.print("Masukkan koordinat y titik asalnya: ");
      yO = input.nextInt();

      input.nextLine();

      allCircles[0] = new GrowingCircle(radius, xO, yO);

      for (int i = 1; i < allCircles.length; i++) {
         allCircles[i] = new GrowingCircle();
      }

      System.out.println();
      for (int i = 0; i < allCircles.length; i++) {
         System.out.println("Lingkaran ke-" + (i + 1) + ":\n"
               + "  ID: " + allCircles[i].getId() + "\n"
               + "  Radius:  " + allCircles[i].getRadius() + " m\n"
               + "  Titik asal: (" + allCircles[i].getXO()
               + "," + allCircles[i].getYO() + ")\n"
               + "  Luas: " + allCircles[i].computeArea() + " m2\n"
               + "  Keliling: " + allCircles[i].computePerimeter() + " m\n");

      }
   }

}
