package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
      // FileWriter fw = new FileWriter("processed.txt");

      String line;
      while ((line = br.readLine()) != null) {
        System.out.println(line.length());
      }
    } catch (IOException err) {
      System.out.println(err.getMessage());
    }
  }
}
