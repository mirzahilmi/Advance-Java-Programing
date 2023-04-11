package projects.project2;

public class Main {
    public static void main(String[] args) {
        CarRider ming = new CarRider("Lin Ming", 19, "08000000000");
        CarRider youhan = new CarRider("Bei Youhan", 20, "0811111111111");
        CarRider ling = new CarRider("Ling'er", 31, "082222222222");

        CarData data = new CarData();
        data.addCar("SUV", "N 1111 AB", "Honda");
        data.addCar("SPORT", "N 2222 AB", "SSC Tuatara");
        data.addCar("TRUCK", "N 3333 AB", "Suzuki");

        data.listOfCar();
        System.out.println("\n");

        RentArchive arsip = new RentArchive();
        arsip.rent(ming, data.carList.get(1), 9);
        arsip.rent(youhan, data.carList.get(0), 3);
        arsip.rent(ling, data.carList.get(1), 1);

        arsip.info();
    }   
}
