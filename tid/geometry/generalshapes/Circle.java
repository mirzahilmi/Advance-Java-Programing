package tid.geometry.generalshapes;

// Miza Hilmi Shodiq
// 225150707111067

public class Circle {
    private double rad;

    public Circle() {}

    public Circle(double rad) {
        this.rad = rad;
    }

    public void setRad(double val) {
        this.rad = val;
    }

    public double getRad() {
        return this.rad;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.rad;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.rad, 2);
    }

    public int getArea(int n) {
        return (int) (Math.PI * Math.pow(this.rad, 2) * n);
    }

}
