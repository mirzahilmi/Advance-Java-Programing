package projects.test;

public class Main {

  public static void main(String[] args) {
    Hewan hewan = new Hewan();
    Ayam ayam = new Ayam();
    Kucing kucing = new Kucing();
    Otter otter = new Otter();

    Hewan otter2 = new Otter();

    hewan.suara();
    ayam.suara();
    kucing.suara();
    otter.suara();

    otter2.suara();
  }
}
