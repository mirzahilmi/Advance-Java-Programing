package tid.geometry.specialshapes.two;

// Miza Hilmi Shodiq
// 225150707111067

public class Circle {

  private double rad;
  private static int autoID;
  private String id = "L";

  public Circle(double rad) {
    this.rad = rad;
    this.id += ++autoID;
  }

  public String getID() {
    return id;
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
}
