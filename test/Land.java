package test;

public class Land {
    String name;
    int area;
    int rate;
    int itemPrice;
    int fee;

    int income;

    Fertilizer fertilizer;
    Apple product;

    Land(String name, int area, int rate, int itemPrice, int fee, int fertilizerPrice) {
        this.name = name;
        this.area = area;
        this.rate = rate;
        this.fee = fee;
        
        updateIncome(area, rate, itemPrice, fee);
        
        this.product = new Apple(itemPrice);
        this.fertilizer = new Fertilizer(false, fertilizerPrice, 0);
    }

    void updateIncome(int area, int rate, int itemPrice, int fee) {
        this.income = (this.area * this.rate * this.itemPrice) - (this.fee * this.area);
    }

    void setActive(boolean state) {
        if (state) {
            this.fertilizer.active = true;
            this.fertilizer.duration = 3;
    
            this.rate *= 2;
        }
        else {
            this.rate /= 2;
        }
        
        updateIncome(this.area, this.rate, this.itemPrice, this.fee);
    }

    void updateDay() {
        if (this.fertilizer.duration <= 0) setActive(false);
        else --this.fertilizer.duration;
    }
}
