package projects.project2;

class Car {

  private String carType;
  private String polNum;
  private String merk;
  private boolean status;

  Car(String carType, String polNum, String merk, boolean status) {
    this.carType = carType;
    this.polNum = polNum;
    this.merk = merk;
    this.status = status;
  }

  void setCarType(String carType) {
    this.carType = carType;
  }

  void setPolNum(String polNum) {
    this.polNum = polNum;
  }

  void setMerk(String merk) {
    this.merk = merk;
  }

  void setStatus(boolean status) {
    this.status = status;
  }

  String getCarType() {
    return this.carType;
  }

  String getPolNum() {
    return this.polNum;
  }

  String getMerk() {
    return this.merk;
  }

  boolean isStatus() {
    return this.status;
  }
}
