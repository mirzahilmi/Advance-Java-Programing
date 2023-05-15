package projects.project4;

public class Sales extends Pegawai {

    private int penjualan;
    private double komisi;

    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    @Override
    public String toString() {
        return String.format(
            "Sales\t\t: %s\n%s\nTotal Penjualan\t: Rp %d\nBesaran komisi\t: %.1f\nPendapatan\t: Rp %.0f",
            this.getNama(), super.toString(), this.penjualan, this.komisi, this.gaji()
        );
    }

    @Override
    public double gaji() {
        return this.penjualan * this.komisi;
    }
}
