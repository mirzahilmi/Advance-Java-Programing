package projects.project2;

public class Car {
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

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setPolNum(String polNum) {
        this.polNum = polNum;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getCarType() {
        return this.carType;
    }

    public String getPolNum() {
        return this.polNum;
    }

    public String getMerk() {
        return this.merk;
    }

    public boolean isStatus() {
        return this.status;
    }

}
