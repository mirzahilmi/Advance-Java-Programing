package shape;

public class Circle {

  private final double PI = 3.141592653589793;
  // or private double pi = Math.PI;

  private double rad;

  public void setRad(double val) {
    this.rad = val;
  }

  public double getRad() {
    return this.rad;
  }

  public double getCircumference() {
    return 2 * PI * this.rad;
  }

  public double getArea() {
    return PI * (this.rad * this.rad);
    // or return PI * (Math.sqrt(this.rad));
  }
}
