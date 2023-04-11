package projects.project2;

import java.util.ArrayList;

class CarData {
    final private String LINE = "------------------------";

    ArrayList<Car> carList = new ArrayList<Car>();

    void addCar(String carType, String polNum, String merk) {
        carList.add(new Car(carType, polNum, merk, true));
    }

    void listOfCar() {
        System.out.printf("\n%s\nDAFTAR MOBIL\n%s", LINE, LINE);

        for (Car car : carList) {
            System.out.printf("\nTIPE MOBIL\t: %s\nNO. POLISI\t: %s\nMERK MOBIL\t: %s\n%s",
            car.getCarType(), car.getPolNum(),car.getMerk(), LINE);
        }

    }
}
