package assignments.assignment1;

import java.util.Scanner;

public class Assignment1 {

  // Mirza Hilmi Shodiq
  // 225150707111067
  // TI-D
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Human person = new Human();
    System.out.println("Masukkan identitas manusia: ");

    System.out.printf("\tNama : ");
    person.setName(sc.nextLine());

    System.out.printf("\tTahun Lahir : ");
    person.setYearOfBirth(sc.nextInt());
    sc.nextLine();

    System.out.printf(
      "\nDeskripsi manusia:\n\tNama: %s\n\tTahun lahir: %d\n",
      person.getName(),
      person.getYearOfBirth()
    );
    person.breath();

    sc.close();
  }
}

class Human {

  private String name;
  private int yearOfBirth;

  void breath() {
    System.out.printf("\tBernafas...");
  }

  void setName(String name) {
    this.name = name;
  }

  void setYearOfBirth(int year) {
    this.yearOfBirth = year;
  }

  String getName() {
    return this.name;
  }

  int getYearOfBirth() {
    return this.yearOfBirth;
  }
}
