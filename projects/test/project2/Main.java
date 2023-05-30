package projects.test.project2;

public class Main {

  public static void main(String[] args) {
    ScannerExtra scx = new ScannerExtra();

    Snack snack1 = new Snack(
      scx.nextLine("Nama Snack : "),
      Float.parseFloat(scx.nextLine("Price per piece : ")),
      Integer.parseInt(scx.nextLine("Protein Total: "))
    );

    System.out.println();

    Beverage beverage1 = new Beverage(
      scx.nextLine("Nama Beverage : "),
      Float.parseFloat(scx.nextLine("Price per piece : "))
    );

    System.out.println();

    switch (
      scx
        .nextLine("What do you want to order (snack or beverage)? ")
        .toLowerCase()
    ) {
      case "snack" -> {
        int quantity = Integer.parseInt(scx.nextLine("How much? "));

        snack1.show();
        System.out.printf(
          "\nQuantity: %d\nCalories: %d",
          quantity,
          snack1.getCalory()
        );
        snack1.price(quantity);
      }
      case "beverage" -> {
        int quantity = Integer.parseInt(scx.nextLine("How much? "));
        String cupSize = scx.nextLine(
          "What sizes (demi, short, tall, grande, venti, or trenta)? "
        );

        beverage1.setCupSize(cupSize);

        beverage1.show();
        System.out.printf(
          "\nQuantity: %d\nSize: %dml",
          quantity,
          beverage1.getSize()
        );
        beverage1.price(quantity);
      }
    }
  }
}
