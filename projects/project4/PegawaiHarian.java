package projects.project4;

// Mirza Hilmi Shodiq
// 225150707111067

public class PegawaiHarian extends Pegawai {

  private double upahPerJam;
  private int totalJam;

  public PegawaiHarian(
    String nama,
    String noKTP,
    double upahPerJam,
    int totalJam
  ) {
    super(nama, noKTP);
    this.upahPerJam = upahPerJam;
    this.totalJam = totalJam;
  }

  public double getUpahPerJam() {
    return upahPerJam;
  }

  public int getTotalJam() {
    return totalJam;
  }

  public void setUpahPerJam(double upahPerJam) {
    this.upahPerJam = upahPerJam;
  }

  public void setTotalJam(int totalJam) {
    this.totalJam = totalJam;
  }

  @Override
  public String toString() {
    return String.format(
      "Pegawai Harian\t: %s\n%s\nUpah/jam\t: Rp %.1f\nTotal jam kerja\t: %d\nPendapatan\t: Rp %.0f",
      this.getNama(),
      super.toString(),
      this.upahPerJam,
      this.totalJam,
      this.gaji()
    );
  }

  @Override
  public double gaji() {
    return (this.totalJam <= 40)
      ? this.upahPerJam * this.totalJam
      : this.upahPerJam * 40 + (this.totalJam - 40) * this.upahPerJam * 1.5;
  }
}
