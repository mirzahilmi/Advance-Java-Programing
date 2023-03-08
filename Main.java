import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Program mirza = new Program();
        Scanner sc = new Scanner(System.in);

        switch (sc.nextInt()) {
            case 1:
                System.out.printf("%d", (int)mirza.persegi(sc.nextDouble()));
                break;
            case 2:
                System.out.printf("%d", (int)mirza.segitiga(sc.nextDouble(), sc.nextDouble()));
                break;
            case 3:
                double n = mirza.lingkaran(sc.nextInt());
                if (n % 1 == 0) System.out.println(n);
                else System.out.println(Math.floor(n));
                break;
            default:
            System.out.println("Input yang anda masukan tidak sesuai");
                break;
        }
        sc.close();
    }
}

class Program {
    Scanner sc = new Scanner(System.in);

    double persegi(double p) {
        return (int) Math.pow(p, 2);
    }

    double segitiga(double a, double t) {
        return (double) 0.5 * a * t;
    }

    double lingkaran(double r) {
        if (r % 7 == 0) return (22/7) * Math.pow(r, 2);
        else return 3.14 * Math.pow(r, 2);
    }
}