package projects.test.project2;

public class Snack extends Food implements FoodInterface {

  private int protein;

  public Snack(String name, float price, int protein) {
    this.name = name;
    this.price = price;

    this.protein = protein;
  }

  public void setProtein(int protein) {
    this.protein = protein;
  }

  public int getProtein() {
    return protein;
  }

  public void show() {
    System.out.printf(
      "\nBeverage: %s\nPrice per piece: %.2f\nProtein: %d",
      this.name,
      this.price,
      this.protein
    );
  }

  public void price(int quantity) {
    System.out.printf("\nTotal Price: %.2f", this.price * quantity);
  }

  public int getCalory() {
    return this.protein * 4;
  }
}
