import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Human person = new Human();
        System.out.println("Masukkan identitas manusia: ");

        System.out.printf("\tNama : ");
        person.setName(sc.nextLine());

        System.out.printf("\tTahun Lahir : ");
        person.setYearOfBirth(sc.nextInt());
        sc.nextLine();

        System.out.printf("\nDeskripsi manusia:\n\tNama: %s\n\tTahun lahir: %d\n", person.getName(),
                person.getYearOfBirth());
        person.breath();

        sc.close();
    }
}