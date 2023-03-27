package tid.geometry.specialshapes.three;

// Miza Hilmi Shodiq
// 225150707111067

public class Circle {
    private double rad;
    private static int autoID;
    private String id = "L";
    private Point pO;

    public Circle(double rad, int x, int y) {
        this.rad = rad;
        this.id += ++autoID;
        this.pO = new Point(x, y);
    }

    public String getID() {
        return this.id;
    }

    public double getRad() {
        return this.rad;
    }

    public int getXo() {
        return this.pO.getXO();
    }

    public int getYo() {
        return this.pO.getYO();
    }

    public double getCircumference() {
        return 2 * Math.PI * this.rad;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.rad, 2);
    }
}
