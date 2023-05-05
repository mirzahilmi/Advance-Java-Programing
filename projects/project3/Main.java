package projects.project3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final ArrayList<Manusia> manusians = new ArrayList<>();
    private static final ArrayList<MahasiswaFilkom> mahasiswans = new ArrayList<>();
    private static final ArrayList<Pekerja> pekerjans = new ArrayList<>();
    private static final ArrayList<Manajer> manajers = new ArrayList<>();

    private static final String LINE = "-------------------------";

    public static void main(String[] args) {
        final String OPTION = "1. Create New Object\n2. Show Objects Information\nAny. EXIT";
        final String LOG = String.format("\nMenu List\n%s\n%s\nInput : ", LINE, OPTION);

        boolean run = true;
        while (run) {
            System.out.print(LOG);
            switch (sc.nextLine().charAt(0)) {
                case '1' -> runCreateMenu();
                case '2' -> runInfoMenu();
                default -> run = false;
            }
        }

        sc.close();
    }

    private static void runInfoMenu() {
        final String OPTION = "1. Objects Count\n2. Manusia\n3. Mahasiswa FILKOM\n4. Pekerja\n5. Manajer\nAny. BACK";
        final String LOG = String.format("\nObjects Information\n%s\n%s\nInput : ", LINE, OPTION);

        while (true) {
            System.out.print(LOG);
            switch (sc.nextLine().charAt(0)) {
                case '1' -> System.out.printf(
                        "Objects Count:\n%dx Manusia\n%dx Mahasiswa FILKOM\n%dx Pekerja\n%dx Manajer\n",
                        manusians.size(), mahasiswans.size(), pekerjans.size(), manajers.size()
                );

                case '2' -> {
                    System.out.printf("\nManusia Count : %dx Manusia\n", manusians.size());
                    for (Manusia manusia : manusians) {
                        showManusiaInfo(manusia);
                        System.out.println();
                    }
                }

                case '3' -> {
                    System.out.printf("\nMahasiswa Count : %dx Mahasiswa FILKOM\n", mahasiswans.size());
                    for (MahasiswaFilkom mahasiswa : mahasiswans) {
                        showManusiaInfo(mahasiswa);
                        System.out.printf(
                                "\nIPK\t: %.1f\nNIM\t: %s\nStatus\t: %s\n",
                                mahasiswa.getIPK(), mahasiswa.getNIM(), mahasiswa.getStatus()
                        );
                    }
                }

                case '4' -> {
                    System.out.printf("\nPekerja Count : %dx Pekerja\n", pekerjans.size());
                    for (Pekerja pekerja : pekerjans) {
                        showManusiaInfo(pekerja);
                        System.out.printf(
                                "\nBonus\t: %.1f\nGaji\t: %.1f\nStatus\t: %s\n",
                                pekerja.getBonus(), pekerja.getGaji(), pekerja.getStatus()
                        );
                    }
                }

                case '5' -> {
                    System.out.printf("\nManajer Count : %dx Manajer\n", manajers.size());
                    for (Manajer manajer : manajers) {
                        showManusiaInfo(manajer);
                        System.out.printf(
                                "\nBonus\t: %.1f\nGaji\t: %.1f\nStatus\t: %s\nLama Kerja\t: %d hari\n",
                                manajer.getBonus(), manajer.getGaji(), manajer.getStatus(), manajer.getLamaKerja()
                        );
                    }
                }

                default -> {
                    return;
                }
            }
        }

    }

    private static void runCreateMenu() {
        final String OPTION = "1. Manusia\n2. Mahasiswa FILKOM\n3. Pekerja\n4. Manajer\nAny. BACK";
        final String LOG = String.format("\nObject List to Create\n%s\n%s\nInput : ", LINE, OPTION);

        while (true) {
            System.out.print(LOG);
            switch (sc.nextLine().charAt(0)) {
                case '1' -> manusians.add(runManusiaInput());
                case '2' -> mahasiswans.add(runMahasiswaInput());
                case '3' -> pekerjans.add(runPekerjaInput());
                case '4' -> manajers.add(runManajerInput());
                default -> {
                    return;
                }
            }
        }
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

        System.out.print("IPK\t: ");
        double ipk = sc.nextDouble();
        sc.nextLine();

        System.out.print("NIM\t: ");
        String nim = sc.nextLine();

        return new MahasiswaFilkom(man.getNama(), man.getNIK(), man.getJenisKelamin(), man.getMenikah(), nim, ipk);
    }

    private static Pekerja runPekerjaInput() {
        Manusia man = runManusiaInput();

        System.out.print("Jumlah Jam Kerja\t: ");
        int jamKerja = sc.nextInt();
        sc.nextLine();

        System.out.print("Jumlah Hari Kerja\t: ");
        int hariKerja = sc.nextInt();
        sc.nextLine();

        System.out.print("NIP\t: ");
        String nip = sc.nextLine();

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

    private static void showManusiaInfo(Manusia man) {
        System.out.printf(
                "\nNama\t: %s\nNIK\t: %s\nJenis Kelamin\t: %s\nStatus Menikah\t: %s\nPendapatan\t: %.1f$",
                man.getNama(), man.getNIK(), man.getJenisKelamin() ? "Laki-laki" : "Perempuan",
                man.getMenikah() ? "Sudah Menikah" : "Belum Menikah", man.getPendapatan()
        );
    }
}