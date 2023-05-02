package projects.project3;

public class Manajer extends Pekerja{
    private int lamaKerja;

    public Manajer(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah, int lamaKerja) {
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
    public String toString() {
        return String.format(
                "Nama\t\t\t: %s\nNIK\t\t\t: %s\nJenis Kelamin\t: %s\nPendapatan\t\t\t: %.1f$\nBonus\t\t\t: %.1f$\nGaji\t\t\t: %s$\nStatus\t\t\t: %s\nLama Kerja\t\t\t: %d",
                this.getNama(),
                this.getNIK(),
                this.getJenisKelamin() ? "Laki-Laki" : "Perempuan",
                this.getPendapatan(),
                this.getBonus(),
                this.getGaji(),
                this.getStatus(),
                this.getLamaKerja()
        );
    }
}
