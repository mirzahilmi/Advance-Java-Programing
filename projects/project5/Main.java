package projects.project5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf(
            "\n%s\n%s",
            "Selamat datang di game Defend FILKOM !",
            "Silahkan masukkan nama player : "
        );
        String name = sc.nextLine();

        int option;
        menu:while (true) {
            System.out.print(
                "\nSilahkan pilih karakter yang anda inginkan :\n1. Magician\n2. Healer\n3. Warrior\n"
            );

            try {
                option = sc.nextInt();
                sc.nextLine();
                break menu;
            } catch (InputMismatchException e) {
                System.out.print("Tolong masukkan angka !");
                sc.nextLine();
            }
        }
        sc.close();

        Character hero;
        switch (option) {
            case 1 -> hero = new Magician();
            case 2 -> hero = new Healer();
            case 3 -> hero = new Warrior();
            default -> hero = null;
        }

        Titan enemy = new Titan();
        int counter = 1;
        switch (hero.getClass().getSimpleName()) {
            case "Magician":
            case "Warrior":
                while (enemy.getHP() > 0 && hero.getHP() > 0) {
                    System.out.printf(
                        "============ TURN %d ============\nEnemy's HP : %d\n%s's HP : %d\n",
                        counter++, enemy.getHP(), name, hero.getHP()
                    );
                    if ((counter & 1) == 0) hero.receiveDamage((enemy.attack()) ? enemy.getAttack() : 0);
                    else enemy.receiveDamage((hero.attack()) ? hero.getAttack() : 0);
                }
                break;
            case "Healer":
                while (enemy.getHP() > 0 && hero.getHP() > 0) {
                    System.out.printf(
                        "============ TURN %d ============\nEnemy's HP : %d\n%s's HP : %d\n",
                        counter++, enemy.getHP(), name, hero.getHP()
                    );
                    if ((counter & 1) == 0) {
                        hero.receiveDamage((enemy.attack()) ? enemy.getAttack() : 0);
                        ((Healer)hero).heal();
                    }
                    else enemy.receiveDamage((hero.attack()) ? hero.getAttack() : 0);
                }
        }

        System.out.printf(
            "============ TURN %d ============\nEnemy's HP : %d\n%s's HP : %d\n=================================\n%s menang\n\n",
            counter++, enemy.getHP(), name, hero.getHP(), (enemy.getHP() == 0) ? name : "Enemy"
        );

        System.out.print("============ PLAYER ============\n");
        hero.info();

        System.out.print("\n============ MUSUH ============\n");
        enemy.info();
    }
}
