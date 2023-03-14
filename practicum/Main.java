package practicum;

public class Main {
    public static void main(String[] args) {
        DataMerchant.merchants = DataMerchant.tambahMerchant(new Merchant
        ("Antaguese", "Toasted Monkey Balls", 782_900.99));

        DataMerchant.merchants = DataMerchant.tambahMerchant(new Merchant
        ("Supratman", "Honey Glazed Turtle Foot", 34_389_900.99));

        DataMerchant.merchants = DataMerchant.tambahMerchant(new Merchant
        ("Andawgius", "Burnt Dolphin Brain", 83_982_900.99));

        DataMerchant.tampilData();
    }
}
