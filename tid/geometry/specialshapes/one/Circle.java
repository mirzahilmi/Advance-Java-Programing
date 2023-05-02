package tid.geometry.specialshapes.one;

public class Circle {

  private double rad;
  private int id;

  public Circle(double rad, int id) {
    this.rad = rad;
    this.id = id;
  }

  public int getID() {
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
