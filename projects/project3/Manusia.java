package projects.project3;

public class Manusia {

  private String nama;
  private String NIK;
  private boolean jenisKelamin;
  private boolean menikah;

  public Manusia(
    String nama,
    String NIK,
    boolean jenisKelamin,
    boolean menikah
  ) {
    this.nama = nama;
    this.NIK = NIK;
    this.jenisKelamin = jenisKelamin;
    this.menikah = menikah;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public void setNIK(String NIK) {
    this.NIK = NIK;
  }

  public void setJenisKelamin(boolean jenisKelamin) {
    this.jenisKelamin = jenisKelamin;
  }

  public void setMenikah(boolean menikah) {
    this.menikah = menikah;
  }

  public String getNama() {
    return this.nama;
  }

  public String getNIK() {
    return this.NIK;
  }

  public boolean getJenisKelamin() {
    return this.jenisKelamin;
  }

  public boolean getMenikah() {
    return this.menikah;
  }

  public double getTunjangan() {
    return this.getMenikah() ? (this.getJenisKelamin() ? 25.00 : 20.00) : 15.00;
  }

  public double getPendapatan() {
    return this.getTunjangan();
  }

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
