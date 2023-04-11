package test;

public class Main {
    public static void main(String[] args) {
        Dog anjing = new Dog("Doni", "Shiba", true);
        Dog anjing2 = new Dog("Agus", "Shiba", true);

        System.out.printf("Anjing 1 : %s\nAnjing 2 : %s", anjing.nama, anjing2.nama);
    }
}
