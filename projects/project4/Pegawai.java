package projects.project4;

// Mirza Hilmi Shodiq
// 225150707111067

public class Pegawai {

  private String nama;
  private String noKTP;

  public Pegawai(String nama, String noKTP) {
    this.nama = nama;
    this.noKTP = noKTP;
  }

  public String getNama() {
    return nama;
  }

  public String getNoKTP() {
    return noKTP;
  }

  @Override
  public String toString() {
    return String.format("No. KTP\t\t: %s", this.noKTP);
  }

  public double gaji() {
    return 0.0;
  }
}
