package utp;

public class Queue {
    String name;
    String phoneNum;
    String platNum;

    Service[] services = new Service[3];

    int gross;

    private ScannerExtra scx = new ScannerExtra();

    Queue(String name, String phoneNum, String platNum) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.platNum = platNum;

        for (int i = 0; i < 3; i++) {
            int choose = scx.nextInt("Masukkan nomor Layanan yang ingin ditambahkan : ");
            scx.nextLine();

            if (scx.nextLine("Apakah anda masih ingin menambahkan layanan? ").equalsIgnoreCase("N")) continue;

            this.services[i] = Service.getService(choose);
        }

        for (int i = 0; i < services.length; i++) gross += services[i].price;
    }


}
