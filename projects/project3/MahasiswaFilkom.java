package projects.project3;

public class MahasiswaFilkom extends Manusia {

  private String NIM;
  private double IPK;

  public MahasiswaFilkom(
    String nama,
    String NIK,
    boolean jenisKelamin,
    boolean menikah,
    String NIM,
    double IPK
  ) {
    super(nama, NIK, jenisKelamin, menikah);
    this.NIM = NIM;
    this.IPK = IPK;
  }

  public void setNIM(String NIM) {
    this.NIM = NIM;
  }

  public void setIPK(double IPK) {
    this.IPK = IPK;
  }

  public String getNIM() {
    return this.NIM;
  }

  public double getIPK() {
    return this.IPK;
  }

  public String getStatus() {
    String major;
    switch (this.getNIM().substring(6)) {
      case "2":
        major = "Teknik Meniup Gelembung";
        break;
      case "3":
        major = "Teknik Berburu Ubur Ubur";
        break;
      case "4":
        major = "Sistem Perhamburgeran";
        break;
      case "6":
        major = "Pendidikan Chum Bucket";
        break;
      case "7":
        major = "Teknologi Telepon Kerang";
    }

    return String.format("%s, 20%s", major, this.getNIM().substring(0, 2));
  }

  public double getBeasiswa() {
    double ipk = this.getIPK();

    return (ipk >= 3.0 && ipk <= 3.5)
      ? 50.0
      : (ipk > 3.5 && ipk <= 4.0) ? 75.0 : 0.0;
  }

  @Override
  public String toString() {
    return String.format(
      "Nama\t\t: %s\nNIK\t\t: %s\nJenis Kelamin\t: %s\nPendapatan\t: %.1f$",
      this.getNama(),
      this.getNIK(),
      this.jenisKelamin ? "Laki-Laki" : "Perempuan",
      this.getPendapatan()
    );
  }
}
