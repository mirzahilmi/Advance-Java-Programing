package test;

public class Main {
    public static void main(String[] args) {
        ScannerExtra scx = new ScannerExtra();

        Car[] cars = new Car[scx.nextInt("How many cars do you want? ")];
        scx.nextLine();

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(scx.nextLine("Enter car brand\t\t: "), scx.nextInt("Enter production year\t: "));
            scx.nextLine();
        }

        boolean isValid = true;

        while (isValid) {
            switch (scx.nextLine("Menu option:\n1. Informasi semua mobil\n2. Informasi pilihan mobil\n\nChoose : ")) {
                case "1":
                    System.out.println("Informasi semua mobil");
                    for (int i = 0; i < cars.length; i++) {
                        System.out.printf("Mobil ke-%d: %s, tahun %d\n", i + 1, cars[i].getBrand(),
                                cars[i].getProductionYear());
                    }
                    break;

                case "2":
                    String input = scx.nextLine("What is the name of the brand?");
                    for (int i = 0; i < cars.length; i++) {
                        if (cars[i].getBrand().equals(input))
                            System.out.printf("Mobil ke-%d: %s, tahun %d\n", i + 1, cars[i].getBrand(),
                                    cars[i].getProductionYear());
                    }
                    break;
                default:
                    isValid = false;
            }

        }

    }
}
