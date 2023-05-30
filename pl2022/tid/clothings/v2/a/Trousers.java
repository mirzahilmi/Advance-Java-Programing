package pl2022.tid.clothings.v2.a;

public class Trousers extends Clothing {

  // Mirza Hilmi Shodiq
  // 225150707111067

  private String beltLoopsType;

  public Trousers() {}

  public Trousers(String id, int size, String beltLoopsType) {
    super.setId(id);
    super.setSize(size);

    this.beltLoopsType = beltLoopsType;
  }

  public String getBeltLoopsType() {
    return beltLoopsType;
  }

  public void setBeltLoopsType(String beltLoopsType) {
    this.beltLoopsType = beltLoopsType;
  }

  @Override
  public String getDescription() {
    return String.format("%s\nTipe tempat sabuk: %s", super.getDescription(), this.beltLoopsType);
  }
}
