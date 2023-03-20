package projects.project1;

// import java.util.ArrayList;

public class DataMerchant {

// Mirza Hilmi Shodiq
// 225150707111067
// TI-D

    static Merchant merchants[] = new Merchant[0];
    private static ScannerExtra scx = new ScannerExtra();

    // Another approach using ArrayList :
    // static ArrayList<Merchant> merchants = new ArrayList<Merchant>();

    static Merchant[] tambahMerchant(Merchant merchant) {
        
        if (!isUnique(merchant) || merchant == null) {
            System.out.println("The provided data already exist in the database\n");
            return null;
        }

        Merchant temp[] = new Merchant[merchants.length + 1];
        for (int i = 0; i < merchants.length; i++) temp[i] = merchants[i];

        // or use arraycopy methods from System Class in order to copy
        // a source array to another array without changing its length

        // System.arraycopy(merchants, 0, temp, 0, merchants.length);

        temp[temp.length - 1] = merchant;
        return temp;
    }
    
    // Another approach with ArrayList Class available methods
    // static void tambahMerchant(Merchant merchant) {
    // merchants.add(merchant);
    // }

    static Merchant[] tambahMerchant() {
        Merchant merchant = new Merchant(scx.nextLine("Nama\t\t: "), scx.nextLine("Nama Produk\t: "), scx.nextDouble("Harga Makanan\t: "));

        if (!isUnique(merchant) || merchant == null) {
            System.out.println("The provided data already exist in the database\n");
            return null;
        }

        Merchant temp[] = new Merchant[merchants.length + 1];
        for (int i = 0; i < merchants.length; i++) temp[i] = merchants[i];

        temp[temp.length - 1] = merchant;
        return temp;
    }

    static void tampilData() {
        for (Merchant merchant : merchants) {
            tampilMerchant(merchant);
        }
    }

    static Merchant cariMerchant(String param) {
        for (Merchant merchant : merchants) if (merchant.getNamaMerchant() == param) return merchant;
        
        System.out.println("No record matching the provided data was found in the database. Please verify the data and try again\n");
        return null;
    }

    static void tampilMerchant(Merchant merchant) {
        if (merchant == null) {
            System.out.println("The input object is invalid or null\n");
            return;
        }

        System.out.println("====Tampilan Data Merchant UBFood====");
        System.out.printf("Nama Merchant\t: %s\nNama Produk\t: %s\nHarga\t\t: %.2f\n\n",
        merchant.getNamaMerchant(), merchant.getNamaProduk(), merchant.getHargaMakanan());
    }

    static void updateMerchant(Merchant thisMerchant) {
        for (int i = 0; i < merchants.length; i++) {
            if (merchants[i].getNamaMerchant() == thisMerchant.getNamaMerchant()) {
                merchants[i] = thisMerchant;
                return;
            }
        }

        System.out.println("No record matching the provided data was found in the database. Please verify the data and try again\n");
    }

    private static boolean isUnique(Merchant thisMerchant) {
        for (Merchant merchant : merchants) if (merchant.getNamaMerchant() == thisMerchant.getNamaMerchant()) return false;
        return true;
    }
}
