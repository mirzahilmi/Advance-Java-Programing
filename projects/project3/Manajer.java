package projects.project3;

public class Manajer extends Pekerja {

  // Mirza Hilmi Shodiq
  // 225150707111067

  private int lamaKerja;

  public Manajer(
    int jamKerja,
    int hariKerja,
    String NIP,
    String nama,
    String NIK,
    boolean jenisKelamin,
    boolean menikah,
    int lamaKerja
  ) {
    super(jamKerja, hariKerja, NIP, nama, NIK, jenisKelamin, menikah);
    this.lamaKerja = lamaKerja;
  }

  public int getLamaKerja() {
    return lamaKerja;
  }

  public void setLamaKerja(int lamaKerja) {
    this.lamaKerja = lamaKerja;
  }

  @Override
  public double calculateBonus() {
    return super.calculateBonus() * 1.3;
  }

  @Override
  public double getPendapatan() {
    return super.getPendapatan() + 15.0;
  }

  @Override
  public String toString() {
    return String.format("%s\nLama Kerja : %s", super.toString(), this.getLamaKerja());
  }
}
