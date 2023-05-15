package projects.project4;

public class PegawaiTetap extends Pegawai {

    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    @Override
    public String toString() {
        return String.format(
            "Pegawai Tetap\t: %s\n%s\nUpah\t\t: %.1f\nPendapatan\t: Rp %.0f",
            this.getNama(), super.toString(), this.upah, this.gaji()
        );
    }

    @Override
    public double gaji() {
        return this.upah;
    }
}
