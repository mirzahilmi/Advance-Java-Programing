package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import projects.project3.Pekerja;

public class Main {

  public static void main(String[] args) {
    Dog dog = new Dog("Halo", "Ayam", false);

    System.out.println(dog.toString());
  }
}
