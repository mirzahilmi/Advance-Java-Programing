package practicum;

// import java.util.ArrayList;
import java.util.Scanner;

public class DataMerchant {
    static Scanner sc = new Scanner(System.in);
    // static ArrayList<Merchant> data = new ArrayList<Merchant>();
    static Merchant merchants[] = new Merchant[0];

    static Merchant[] tambahMerchant(Merchant merchant) {
        Merchant tempMerchants[] = new Merchant[merchants.length + 1];
        for (int i = 0; i < merchants.length; i++) tempMerchants[i] = merchants[i];
        tempMerchants[tempMerchants.length - 1] = merchant;
        return tempMerchants;
    }

    static void tampilData() {
        for (Merchant merchant : merchants) {
            System.out.println("====Tampilan Data Merchant UBFood====");
            System.out.printf("Nama Merchant\t: %s\nNama Produk\t: %s\nHarga\t\t: %f\n\n",
            merchant.getNamaMerchant(), merchant.getNamaProduk(), merchant.getHargaMakanan());
        }
    }
}
