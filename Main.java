import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Methods myMethod = new Methods();
        String[] names = new String[5];

        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }
        sc.close();

        myMethod.printName(names);
    }
}

class Methods {
    void printName (String[] names) {
        System.out.println(Arrays.toString(names));
    }
}