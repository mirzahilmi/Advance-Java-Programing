package utp.test;

public class Main {

  public static void main(String[] args) {
    /*
     * Layanan :
     * Ganti Oli : 500k
     * Operasi Mobil : 2JT
     * Ketok Magic : 3JT
     * Modif Racing : 5JT
     * Modif Elektrik : 5.5JT
     */

    final String LOGIN_LOG =
      "Selamat datang pada laman login terminal sederhana!";
    final String OPTION =
      "1. Menampilkan semua antrian pada hari ini\n2. Menambahkan Antrian\n3. Log out dari Sistem";
    final String LOG =
      "Selamat datang pada aplikasi terminal sederhana!\nSilahkan pilih salah satu menu di bawah ini:\n" +
      OPTION +
      "\nMasukan Anda : ";
    final String ERROR = "Tidak ada Daftar Layanan";

    final String BORDER = "============================";
    final String BORDER_THIN = "----------------------------";

    ScannerExtra scx = new ScannerExtra();

    System.out.print(LOGIN_LOG);
    Merchant.login(
      scx.nextLine("\nUsername\t: "),
      scx.nextLine("Password\t: ")
    );
    if (!Merchant.loggedIn) return;

    Service.loadData();

    boolean active = true;
    while (active) {
      switch (scx.nextLine(LOG)) {
        case "1":
          if (Merchant.queueAmt <= 0) {
            System.out.println(ERROR);
            break;
          }

          System.out.println(BORDER);

          for (int i = 0; i < Merchant.queues.length; i++) {
            if (Merchant.queues[i] == null) break;

            System.out.printf(
              "\nName : %s\nPhone : %s\nLicense : %s",
              Merchant.queues[i].name,
              Merchant.queues[i].phoneNum,
              Merchant.queues[i].platNum
            );

            System.out.println("Daftar Layanan :");

            for (int j = 0; j < Merchant.queues[i].services.length; j++) {
              System.out.println(BORDER_THIN);
              System.out.printf(
                "\nLayanan Nomor : %d\nName : %s\nPrice : %d\n",
                Merchant.queues[i].services[i].key,
                Merchant.queues[i].services[i].name,
                Merchant.queues[i].services[i].price
              );
              System.out.println(BORDER_THIN);
            }
          }
          break;
        case "2":
          System.out.println("Daftar Layanan");
          for (int i = 0; i < Service.services.length; i++) {
            System.out.println(BORDER_THIN);
            System.out.printf(
              "\nLayanan Nomor : %d\nName : %s\nPrice : %d\n",
              Service.services[i].key,
              Service.services[i].name,
              Service.services[i].price
            );
            System.out.println(BORDER_THIN);
          }

          Merchant.addQueue(
            new Queue(
              scx.nextLine("Masukkan nama pemesan : "),
              scx.nextLine("Masukkan Nomer Telepon : "),
              scx.nextLine("Masukkan Nomor Plat : ")
            )
          );

          break;
        default:
          break;
      }
    }
  }
}
