package projects.project1;

import java.util.Scanner;

// Scanner but with steroids.
// Made by github.com/MirzaHilmi for fun.

public class ScannerExtra {

  private Scanner sc = new Scanner(System.in);

  String nextLine(String log) {
    System.out.print(log);
    return sc.nextLine();
  }

  int nextInt(String log) {
    System.out.print(log);
    return sc.nextInt();
  }

  float nextFloat(String log) {
    System.out.print(log);
    return sc.nextFloat();
  }

  double nextDouble(String log) {
    System.out.print(log);
    return sc.nextDouble();
  }

  String nextLine() {
    return sc.nextLine();
  }
}
