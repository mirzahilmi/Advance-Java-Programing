package uts.geometry.specialshapes;

// Mirza Hilmi Shodiq
// 225150707111067

public class GrowingCircle {

   private String id;
   private double radius;
   private Point pO;

   private static int counter;
   private static double tempRad;
   private static Point tempPO;

   public GrowingCircle(double radius, int x, int y) {
      this.id = "L" + ++counter;
      this.radius = radius;
      this.pO = new Point(x, y);

      GrowingCircle.tempRad = this.radius;
      GrowingCircle.tempPO = pO;
   }

   public GrowingCircle() {
      this.id = "L" + ++counter;

      GrowingCircle.tempRad *= 2;
      this.radius = GrowingCircle.tempRad;

      GrowingCircle.tempPO.setX(tempPO.getX() * counter);
      GrowingCircle.tempPO.setY(tempPO.getY() * counter);
      this.pO = tempPO;
   }

   public int getXO() {
      return pO.getX();
   }

   public int getYO() {
      return pO.getY();
   }

   public void setXO(int x) {
      pO.setX(x);
   }

   public void setYO(int y) {
      pO.setY(y);
   }

   public void setPO(int x, int y) {
      pO.setX(x);
      pO.setY(y);
   }

   public String getId() {
      return id;
   }

   public double getRadius() {
      return radius;
   }

   public double computeArea() {
      return Math.PI * Math.pow(radius, 2);
   }

   public double computePerimeter() {
      return 2 * Math.PI * radius;
   }

}
