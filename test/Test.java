package test;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test {

  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader("sample.txt"));

      String line;
      while ((line = br.readLine()) != null) System.out.println(line.length());
      System.out.println("Im skipped");
    } catch (Exception e) {}
  }
}
