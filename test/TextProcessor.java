package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextProcessor {

  public static void main(String[] args) {
    String inputFilePath = "sample.txt";
    String outputFilePath = "output.txt";

    try (
      BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
      FileWriter fw = new FileWriter(outputFilePath)
    ) {
      String line;
      while ((line = br.readLine()) != null) {
        // Process each line with algorithm
        String processedLine = yourAlgorithm(line);

        // Write the processed line to the output file
        fw.write(processedLine);
        fw.write(System.lineSeparator());
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static String yourAlgorithm(String line) {
    String temp = line.substring(3, 15);
    return line.replace(temp, "");
  }
}
