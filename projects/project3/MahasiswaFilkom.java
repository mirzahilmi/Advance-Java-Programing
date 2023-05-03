package projects.project3;

public class MahasiswaFilkom extends Manusia {

    private String NIM;
    private double IPK;

    public MahasiswaFilkom(String nama, String NIK, boolean jenisKelamin, boolean menikah, String NIM, double IPK) {
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
        String major = switch (this.getNIM().charAt(6)) {
            case '2' -> "Teknik Meniup Gelembung";
            case '3' -> "Teknik Berburu Ubur Ubur";
            case '4' -> "Sistem Perhamburgeran";
            case '6' -> "Pendidikan Chum Bucket";
            case '7' -> "Teknologi Telepon Kerang";
            default -> "";
        };

        return String.format("%s, 20%s", major, this.getNIM().substring(0, 2));
    }

    public double getBeasiswa() {
        double ipk = this.getIPK();

        return (ipk >= 3.0 && ipk <= 3.5) ? 50.0 : (ipk > 3.5 && ipk <= 4.0) ? 75.0 : 0.0;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + this.getBeasiswa();
    }

    @Override
    public String toString() {
        return String.format(
                "%s\nIPK\t\t\t: %.1f\nNIM\t\t\t: %s\nStatus\t\t\t: %s",
                super.toString(), this.getIPK(), this.getNIM(), this.getStatus()
        );
    }
}
