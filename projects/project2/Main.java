package projects.project2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nama\t\t: ");
        String name = sc.nextLine();

        System.out.print("Masukkan umur\t\t: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukkan nomor telfon\t: ");
        String phoneNumber = sc.nextLine();

        CarRider rider = new CarRider(name, age, phoneNumber);

        CarData data = new CarData();

        System.out.println();
        System.out.print("Tipe Mobil\t: ");
        String type = sc.nextLine();

        System.out.print("Nomor Plat\t: ");
        String licensePlate = sc.nextLine();

        System.out.print("Merk Mobil\t: ");
        String brand = sc.nextLine();

        data.addCar(type, licensePlate, brand);

        data.listOfCar();

        System.out.print("\n\nBerapa lama durasi peminjaman? ");
        int duration = sc.nextInt();
        sc.close();

        RentArchive arsip = new RentArchive();
        arsip.rent(rider, data.carList.get(0), duration);

        arsip.info();
    }
}
