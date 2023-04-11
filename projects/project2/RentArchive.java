package projects.project2;

import java.util.ArrayList;

public class RentArchive {
    final String LINE = "------------------------";

    ArrayList<CarRent> rentData = new ArrayList<CarRent>();

    void rent(CarRider rider, Car car, int rentDur) {
        if (car.isStatus()) {
            car.setStatus(false);
            rentData.add(new CarRent(rider, car, rentDur));
            System.out.println("MOBIL BERHASIL DISEWA");
        } else
            System.out.println("MAAF, MOBIL SUDAH DISEWA");
    }

    void info() {
        System.out.printf("\n%s\nDAFTAR MOBIL\n%s", LINE, LINE);

        for (CarRent carRent : rentData) {
            System.out.printf("\nNAMA PEMINJAM\t: %s\nTIPE MOBIL\t: %s\nNO. POLISI\t: %s\nLAMA RENTAL\t: %d\n%s",
                    carRent.rider.getName(), carRent.car.getCarType(), carRent.car.getPolNum(), carRent.rentDur, LINE);
        }
    }
}
