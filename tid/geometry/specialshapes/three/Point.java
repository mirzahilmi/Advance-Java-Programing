package tid.geometry.specialshapes.three;

public class Point {

  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void setXO(int x) {
    this.x = x;
  }

  public void setYO(int y) {
    this.y = y;
  }

  public int getXO() {
    return this.x;
  }

  public int getYO() {
    return this.y;
  }
}
