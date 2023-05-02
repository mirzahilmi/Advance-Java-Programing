import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("test/sample.txt"));
            FileWriter fw = new FileWriter("test/output.txt");

            String line;
            while ((line = br.readLine()) != null) {
                fw.write(
                        String.format(
                                ".text-%s {\n\tcolor: %s !important\n}\n",
                                line.replace("$", ""),
                                line
                        )
                );
                fw.write(
                        String.format(
                                ".bg-%s {\n\tbackground: %s !important\n}\n",
                                line.replace("$", ""),
                                line
                        )
                );
            }

            br.close();
            fw.close();
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
    }
}
