package pl2022.tid.clothings.v2.a;

import java.util.Scanner;

public class Demo {

  // Mirza Hilmi Shodiq
  // 225150707111067

  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    final String LINE = "***********************";
    final String PROGRAM_USERNAME = "Mirza Hilmi Shodiq";
    final String PROGRAM_LOG = String.format(
      "%s\nClothing v2.0\nby %s\n%s",
      LINE,
      PROGRAM_USERNAME,
      LINE
    );

    final String OPTION = "1. Atasan\n2. Celana panjang";
    final String LOG = String.format(
      "Silahkan pilih jenis baju di bawah ini:\n%s\nPilihan: ",
      OPTION
    );

    System.out.println(PROGRAM_LOG);

    System.out.print("Berapa baju yang akan diproduksi? ");
    int amount = Integer.parseInt(sc.nextLine());

    boolean[] userChoice = new boolean[amount];
    Clothing[] userClothings = new Clothing[amount];

    for (int i = 0; i < amount; i++) {
      System.out.printf("\nUntuk baju ke-%d, %s", i + 1, LOG);

      switch (sc.nextLine().charAt(0)) {
        case '1' -> {
          userChoice[i] = true;
          Clothing cloth = getClothing();

          System.out.print("Lebar bahu: ");
          int shoulderSize = sc.nextInt();
          sc.nextLine();

          userClothings[i] =
            new Shirt(cloth.getId(), cloth.getSize(), shoulderSize);
        }
        case '2' -> {
          Clothing cloth = getClothing();

          System.out.print("Tipe tempat sabuk: ");
          String beltLoopsType = sc.nextLine();

          userClothings[i] =
            new Trousers(cloth.getId(), cloth.getSize(), beltLoopsType);
        }
      }
    }

    System.out.printf(
      "\n%s\n%s",
      "Deskripsi baju yang diproduksi",
      "=============================="
    );
    for (int i = 0; i < amount; i++) {
      System.out.printf("\nBaju ke-%d", i + 1);
      if (userChoice[i]) {
        System.out.printf("\n%s", ((Shirt) userClothings[i]).getDescription());
      } else {
        System.out.printf(
          "\n%s",
          ((Trousers) userClothings[i]).getDescription()
        );
      }
    }
  }

  private static Clothing getClothing() {
    System.out.print("\nMasukkan deskripsi atasan\n ID: ");
    String id = sc.nextLine();

    System.out.print("Ukuran umum: ");
    int size = sc.nextInt();
    sc.nextLine();

    Clothing clothing = new Clothing();
    clothing.setId(id);
    clothing.setSize(size);

    return clothing;
  }
}
