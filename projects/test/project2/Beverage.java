package projects.test.project2;

public class Beverage extends Food implements FoodInterface {

  private String cupSize;

  public Beverage(String name, float price) {
    this.name = name;
    this.price = price;
  }

  public String getCupSize() {
    return this.cupSize;
  }

  public void setCupSize(String cupSize) {
    this.cupSize = cupSize;
  }

  public void show() {
    System.out.printf(
      "\nSnack: %s\nPrice per piece: %.2f\nCup Size: %s",
      this.name,
      this.price,
      this.cupSize
    );
  }

  public void price(int quantity) {
    System.out.printf("\nTotal Price: %.2f", this.price * quantity);
  }

  public int getSize() {
    return switch (this.cupSize.toLowerCase()) {
      case "demi" -> 88;
      case "short" -> 236;
      case "tall" -> 354;
      case "grande" -> 354;
      case "venti" -> 354;
      case "trenta" -> 354;
      default -> 236;
    };
  }
}
