package pl2022.tid.clothings.v1.b;

public class Clothing {

  // Mirza Hilmi Shodiq
  // 225150707111067

  protected String id;
  protected int size;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public String getDescription() {
    return String.format("ID: %s\nUkuran umum: %d", this.id, this.size);
  }
}
