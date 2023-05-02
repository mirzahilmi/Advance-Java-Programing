package utp.test;

public class Service {

  int key;
  String name;
  int price;

  Service(int num, String name, int price) {
    this.key = num;
    this.name = name;
    this.price = price;
  }

  static Service[] services = new Service[5];

  private static String[] names = {
    "Layanan Ganti Oli",
    "Layanan Operasi Mobil",
    "Layanan Ketok Magic",
    "Layanan Modif Racing",
    "Layanan Modif Elektrik",
  };

  private static int[] prices = {
    500_000,
    2_000_000,
    3_000_000,
    5_000_000,
    5_500_000,
  };

  static void loadData() {
    for (int i = 0; i < services.length; i++) {
      services[i] = new Service(i + 1, names[i], prices[i]);
    }
  }

  static Service[] getAll() {
    return services;
  }

  static Service getService(int number) {
    for (int i = 0; i < services.length; i++) {
      if (services[i].key == number) return services[i];
    }

    return null;
  }
}
