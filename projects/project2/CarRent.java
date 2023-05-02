package projects.project2;

class CarRent {

  private CarRider rider;
  private Car car;
  private int rentDur;

  CarRent(CarRider rider, Car car, int rentDur) {
    this.rider = rider;
    this.car = car;
    this.rentDur = rentDur;
  }

  void setRider(CarRider rider) {
    this.rider = rider;
  }

  void setCar(Car car) {
    this.car = car;
  }

  void setRentDur(int rentDur) {
    this.rentDur = rentDur;
  }

  CarRider getRider() {
    return this.rider;
  }

  Car getCar() {
    return this.car;
  }

  int getRentDur() {
    return this.rentDur;
  }
}
