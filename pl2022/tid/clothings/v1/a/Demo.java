package pl2022.tid.clothings.v1.a;

import java.util.Scanner;

public class Demo {
    // Mirza Hilmi Shodiq
    // 225150707111067

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final String LINE = "***********************";
        final String PROGRAM_USERNAME = "Mirza Hilmi Shodiq";
        final String PROGRAM_LOG = String.format("%s\nClothing v1.a\nby %s\n%s", LINE, PROGRAM_USERNAME, LINE);

        final String OPTION = "1. Atasan\n2. Celana panjang";
        final String LOG = String.format("Silahkan pilih jenis baju di bawah ini:\n%s\nPilihan: ", OPTION);

        System.out.println(PROGRAM_LOG);

        System.out.printf("\n%s", LOG);

        switch (sc.nextLine().charAt(0)) {
            case '1' -> {
                Clothing cloth = getClothing();

                System.out.print("Lebar bahu: ");
                int shoulderSize = sc.nextInt();
                sc.nextLine();

                Shirt shirt = new Shirt(cloth.getId(), cloth.getSize(), shoulderSize);

                System.out.printf("\nDeskripsi atasan:\n%s", shirt.getDescription());
            }
            case '2' -> {
                Clothing cloth = getClothing();

                System.out.print("Tipe tempat sabuk: ");
                String beltLoopsType = sc.nextLine();

                Trousers trousers = new Trousers(cloth.getId(), cloth.getSize(), beltLoopsType);

                System.out.printf("\nDeskripsi atasan:\n%s", trousers.getDescription());
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
