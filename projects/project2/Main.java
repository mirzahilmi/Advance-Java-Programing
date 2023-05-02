package projects.project2;

import java.util.Scanner;

public class Main {

  private static Scanner sc = new Scanner(System.in);

  private static CarData data = new CarData();
  private static RentArchive archive = new RentArchive();

  private static final String PASSWORD = "admin";

  public static void main(String[] args) {
    while (true) {
      System.out.print(
        "\nMenu Option:\n1. Sign in as Customer\n2. Sign in as Administrator\n3. Exit\nInput: "
      );
      switch (sc.nextLine()) {
        case "1":
          signIn();
          break;
        case "2":
          System.out.print("\nMasukkan password : ");
          signIn(sc.nextLine());
          break;
        case "3":
          return;
        default:
          System.out.println("\nInput tidak valid!");
      }
    }
  }

  private static void signIn() {
    System.out.print("\nMasukkan nama\t\t: ");
    String name = sc.nextLine();

    System.out.print("Masukkan umur\t\t: ");
    int age = sc.nextInt();
    sc.nextLine();

    System.out.print("Masukkan nomor telfon\t: ");
    String phoneNumber = sc.nextLine();

    CarRider rider = new CarRider(name, age, phoneNumber);

    while (true) {
      System.out.print(
        "\nMenu Option:\n1. Tampilkan Mobil\n2. Sewa Mobil\n3. Sign Out\nInput: "
      );
      switch (sc.nextLine()) {
        case "1":
          data.listOfCar();
          break;
        case "2":
          System.out.print("\nMasukkan plat nomor: ");
          Car car = data.getCar(sc.nextLine());

          if (car == null) {
            System.out.println("Mobil tersebut tidak terdapat pada database.");
            break;
          }

          System.out.print("Berapa lama durasi sewa? ");
          archive.rent(rider, car, sc.nextInt());
          sc.nextLine();

          break;
        case "3":
          return;
        default:
          System.out.println("\nInput tidak valid!");
      }
    }
  }

  private static void signIn(String password) {
    if (!password.equals(PASSWORD)) {
      System.out.println("\nWRONG PASSWORD");
      return;
    }

    while (true) {
      System.out.print(
        "\nMenu Option:\n1. Tampilkan Mobil yang disewa\n2. Tampilkan Mobil\n3. Tambahkan mobil\n4. Sign Out\nInput: "
      );
      switch (sc.nextLine()) {
        case "1":
          archive.info();
          break;
        case "2":
          data.listOfCar();
          break;
        case "3":
          System.out.print("\nTipe Mobil\t: ");
          String type = sc.nextLine();

          System.out.print("Nomor Plat\t: ");
          String licensePlate = sc.nextLine();

          System.out.print("Merk Mobil\t: ");
          String brand = sc.nextLine();

          data.addCar(type, licensePlate, brand);
          break;
        case "4":
          return;
        default:
          System.out.println("\nInput tidak valid!");
      }
    }
  }
}
