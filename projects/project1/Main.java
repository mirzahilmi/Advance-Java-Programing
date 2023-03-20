package projects.project1;

public class Main {

// Mirza Hilmi Shodiq
// 225150707111067
// TI-D

    public static void main(String[] args) {
        // Task 1 : Test tambahMerchant & tampilData method
        final String IDENTITY = "Mirza Hilmi Shodiq\n225150707111067\n";
        System.out.println(IDENTITY);

        DataMerchant.merchants = DataMerchant.tambahMerchant(new Merchant
        ("Antaguese", "Baguette", 782_900.68));

        DataMerchant.merchants = DataMerchant.tambahMerchant(new Merchant
        ("Mercurious", "Ratatouille", 34_389_900.32));

        DataMerchant.merchants = DataMerchant.tambahMerchant(new Merchant
        ("Andawgius", "Croissant", 83_982_900.99));

        DataMerchant.merchants = DataMerchant.tambahMerchant();
        System.out.println();

        DataMerchant.tampilData();

        // Task 2 : Test cariMerchant & tampilMerchant method
        Merchant merchant;

        merchant = DataMerchant.cariMerchant("Mercurious");
        DataMerchant.tampilMerchant(merchant);

        merchant = DataMerchant.cariMerchant("Mega what tea");
        DataMerchant.tampilMerchant(merchant);

        // Task 3 : Test updateMerchant method
        merchant = new Merchant("Andawgius", "Carbonara", 2_876_990);
        DataMerchant.updateMerchant(merchant);
        DataMerchant.tampilData();

        merchant = new Merchant("Poo and", "Island", 1);
        DataMerchant.updateMerchant(merchant);

        // Task 4 : Test tambahMerchant method constraint that a data must be unique
        DataMerchant.merchants = DataMerchant.tambahMerchant(new Merchant
        ("Antaguese", "Noodles", 1_489_900));
    }
}
