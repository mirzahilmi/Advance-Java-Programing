package tid.geometry.ui;

import tid.geometry.specialshapes.three.Circle;

public class GeometryDemo_v4_0 {

  public static void main(String[] args) {
    final String PROGRAM_NAME = "Geometry Demo v4.0";
    final String PROGRAM_AUTHOR = "by Mirza Hilmi Shodiq";
    final String PROGRAM_OPTION = "Ada berapa lingkaran yang akan dibuat? ";
    System.out.printf(
      "%s\n%s\n%s\n\n",
      PROGRAM_NAME,
      PROGRAM_AUTHOR,
      "======================="
    );

    ScannerExtra scx = new ScannerExtra();

    Circle[] lingkarans = new Circle[scx.nextInt(PROGRAM_OPTION)];
    System.out.println();
    for (int i = 0; i < lingkarans.length; i++) {
      System.out.printf("Lingkaran %d\n", i + 1);
      lingkarans[i] =
        new Circle(
          scx.nextDouble("  Masukkan radius lingkaran (m): "),
          scx.nextInt("  Masukkan koordinat x titik asal: "),
          scx.nextInt("  Masukkan koordinat y titik asal: ")
        );
      System.out.println();
    }

    System.out.println();

    for (Circle lingkaran : lingkarans) {
      System.out.printf(
        "Lingkaran ke-%s:\nID\t\t: %s\nTitik asal\t: (%d, %d)\nRadius\t\t: %.2f m\nLuas\t\t: %.2f m2\nKeliling\t: %.2f m\n\n",
        lingkaran.getID(),
        lingkaran.getID(),
        lingkaran.getXo(),
        lingkaran.getYo(),
        lingkaran.getRad(),
        lingkaran.getArea(),
        lingkaran.getCircumference()
      );
    }

    scx.close();
  }
}
