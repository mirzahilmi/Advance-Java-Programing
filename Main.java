import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Methods myMethod = new Methods();
        String[] names = new String[5];
        int[] scores = new int[5];

        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
            scores[i] = sc.nextInt();
            sc.nextLine();
        }
        sc.close();

        myMethod.printName(names, scores);
    }
}

class Methods {
    void printName (String[] names, int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%s\t: %d\n", names[i], scores[i]);
        }
    }
}