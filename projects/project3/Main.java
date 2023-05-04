package projects.project3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Manusia> manusians = new ArrayList<>();
        ArrayList<MahasiswaFilkom> mahasiswans = new ArrayList<>();
        ArrayList<Pekerja> pekerjans = new ArrayList<>();
        ArrayList<Manajer> manajers = new ArrayList<>();

        final String LINE = "-------------------------";
        final String OPTION = "1. Manusia\n2. Mahasiswa Filkom\n3. Pekerja\n4. Manajer\n5. Objects Total\nAny. EXIT";
        final String LOG = String.format("Object List to Create\n%s\n%s\n%s\nInput : ", LINE, OPTION, LINE);


        boolean run = true;
        while (run) {
            System.out.print(LOG);
            switch (sc.nextLine()) {
                case "1":
                    manusians.add(runManusiaInput());
                    break;
                case "2":
                    mahasiswans.add(runMahasiswaInput());
                    break;
                case "3":
                    pekerjans.add(runPekerjaInput());
                    break;
                case "4":
                    manajers.add(runManajerInput());
                    break;
                case "5":
                    System.out.printf(
                            "Objects:\n%dx Manusia\n%dx Mahasiswa FILKOM\n%dx Pekerja\n%dx Manajer\n",
                            manusians.size(), mahasiswans.size(), pekerjans.size(), manajers.size()
                    );
                    break;
                default:
                    run = false;
            }
        }

        sc.close();
    }

    private static Manusia runManusiaInput() {
        System.out.print("Nama Lengkap\t: ");
        String nama = sc.nextLine();

        System.out.print("NIK\t: ");
        String nik = sc.nextLine();

        System.out.print("Jenis Kelamin (Pria atau Wanita)\t: ");
        boolean jenisKelamin = !sc.nextLine().equalsIgnoreCase("wanita");

        System.out.print("Status (Menikah atau Kosongi)\t: ");
        boolean menikah = sc.nextLine().equalsIgnoreCase("menikah");

        return new Manusia(nama, nik, jenisKelamin, menikah);
    }

    private static MahasiswaFilkom runMahasiswaInput() {
        Manusia man = runManusiaInput();

        System.out.print("NIM\t: ");
        String nim = sc.nextLine();

        System.out.print("IPK\t: ");
        double ipk = sc.nextDouble();
        sc.nextLine();

        return new MahasiswaFilkom(man.getNama(), man.getNIK(), man.getJenisKelamin(), man.getMenikah(), nim, ipk);
    }

    private static Pekerja runPekerjaInput() {
        System.out.print("Jumlah Jam Kerja\t: ");
        int jamKerja = sc.nextInt();
        sc.nextLine();

        System.out.print("Jumlah Hari Kerja\t: ");
        int hariKerja = sc.nextInt();
        sc.nextLine();

        System.out.print("NIP\t: ");
        String nip = sc.nextLine();

        Manusia man = runManusiaInput();

        return new Pekerja(jamKerja, hariKerja, nip, man.getNama(), man.getNIK(), man.getJenisKelamin(), man.getMenikah());
    }

    private static Manajer runManajerInput() {
        Pekerja worker = runPekerjaInput();

        System.out.print("Lama Kerja\t: ");
        int lamaKerja = sc.nextInt();
        sc.nextLine();

        return new Manajer(
                worker.getJamKerja(), worker.getHariKerja(), worker.getNIP(),
                worker.getNama(), worker.getNIK(), worker.getJenisKelamin(),
                worker.getMenikah(), lamaKerja
        );
    }
}
