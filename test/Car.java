package test;

public class Car {
    private String brand;
    private int productionYear;

    Car(String brand, int productionYear) {
        this.brand = brand;
        this.productionYear = productionYear;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    String getBrand() {
        return this.brand;
    }

    int getProductionYear() {
        return this.productionYear;
    }
}
