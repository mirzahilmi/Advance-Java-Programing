package projects.project4;

public class Main {

    public static void main(String[] args) {
        String[] names = {
            "Oman Prakasa", "Abdul Toqum", "Abdal Tasing",
            "Basan Bulan", "Wadi Rahardius", "Upik Utama",
            "Jayadi Sihombing", "Adiarja Najmudin", "Kornelius Marpaung"
        }; 
        
        PegawaiTetap[] tetaps = new PegawaiTetap[3];
        PegawaiHarian[] harians = new PegawaiHarian[3];
        Sales[] sales = new Sales[3];

        for (int i = 0; i < 3; i++) {
            tetaps[i] = new PegawaiTetap(
                names[i], getRandomKTP(), (int)(Math.random() * ((4_500_000 - 500_000) + 1) + 500_000)
            );

            harians[i] = new PegawaiHarian(
                names[i + 3], getRandomKTP(), 
                Math.random() * ((600_000 - 100_000) + 1) + 100_000, 
                (int)(Math.random() * ((70 - 20) + 1) + 10)
            );

            sales[i] = new Sales(
                names[i + 6], getRandomKTP(),
                (int)(Math.random() * ((70 - 20) + 1) + 10),
                Math.random() * ((400_000 - 50_000) + 1) + 50_000
            );
        }

        for (PegawaiTetap tetap : tetaps) {
            System.out.println(tetap.toString());
            System.out.println();
        }

        for (PegawaiHarian harian : harians) {
            System.out.println(harian.toString());
            System.out.println();
        }

        for (Sales sale : sales) {
            System.out.println(sale.toString());
            System.out.println();
        }
    }

    private static String getRandomKTP() {
        char[] ktp = new char[14];

        for (int i = 0; i < ktp.length; i++) {
            ktp[i] = (char)((int)(Math.random() * 10) + '0');
        }

        return new String(ktp);
    }
}
