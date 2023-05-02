package test;

public class Speedrun {

  public static void main(String[] args) {
    // Luas 5 Hektar
    // 900k / Hektar untuk perawatan
    // 50kg Apel / Hektar
    // 28k / kg Apel
    // 320k / hektar pupuk ajaib (x2 Apel) selama 3 hari

    ScannerExtra scx = new ScannerExtra();

    final String LOG =
      "\nSilahkan pilih menu anda:\n1. Melihat Informasi Apel\n2. Tambah Lahan Apel\n3. Pakai Pupuk\n4. Next Day\n5. Exit\nMasukkan Pilihan Anda: ";
    final String SEPARATOR = "========================";
    final String SEPARATOR_THIN = "------------------------";

    String option;
    boolean active = true;

    Land kebun = new Land("Apel", 5, 50, 28_000, 900_000, 320_000);

    int n = 0;
    while (active) {
      option = scx.nextLine(LOG);
      System.out.println(SEPARATOR);

      switch (option) {
        case "1":
          System.out.printf(
            "Nama\t\t: %s\nLuas\t\t: %d Hektar\nTotal Apel/Hari\t: %d kg\nKeuntungan/Hari\t: Rp. %d\n",
            kebun.name,
            kebun.area,
            kebun.rate,
            kebun.income
          );
          System.out.println(SEPARATOR);
          break;
        case "2":
          kebun.area += scx.nextInt("Tambahkan Luas Tanah (hektar) : ");
          kebun.updateIncome(
            kebun.area,
            kebun.rate,
            kebun.itemPrice,
            kebun.fee
          );
          scx.nextLine();
          System.out.println(SEPARATOR_THIN);
          System.out.println("Tanah Berhasil Ditambahkan");
          System.out.println(SEPARATOR);
          break;
        case "3":
          kebun.setActive(active);
          System.out.println("Pupuk Berhasil Dipakai");
          System.out.println(SEPARATOR);
          break;
        case "4":
          kebun.updateDay();
          System.out.printf(
            "\nHari Telah Berganti, Memasuki hari ke-%d\n",
            ++n
          );
          System.out.println(SEPARATOR);
          break;
        default:
          active = false;
      }
    }
  }
}
