package practicum;

public class Merchant {

// Mirza Hilmi Shodiq
// 225150707111067
// TI-D

    private String namaMerchant; // Primary Key (must UNIQUE)
    private String namaProduk;
    private double hargaMakanan;

    Merchant(String nama, String namaProduk, double hargaMakanan) {
        this.namaMerchant = nama;
        this.namaProduk = namaProduk;
        this.hargaMakanan = hargaMakanan;
    }

    void setNamaMerchant(String namaMerchant) {
        this.namaMerchant = namaMerchant;
    }
    void setNamaProduk(String NamaProduk) {
        this.namaProduk = NamaProduk;
    }
    void setHargaMakanan(double HargaMakanan) {
        this.hargaMakanan = HargaMakanan;
    }

    String getNamaMerchant() {
        return this.namaMerchant;
    }
    String getNamaProduk() {
        return this.namaProduk;
    }
    double getHargaMakanan() {
        return this.hargaMakanan;
    }
}
