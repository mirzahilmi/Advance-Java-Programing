package projects.project3;

public class Pekerja extends Manusia {
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;

    public Pekerja(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        super(nama, NIK, jenisKelamin, menikah);

        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;

        this.setGaji();
        this.setBonus();
    }

    public double getGaji() {
        return this.gaji;
    }

    public double getBonus() {
        return this.bonus;
    }

    public int getJamKerja() {
        return this.jamKerja;
    }

    public int getHariKerja() {
        return this.hariKerja;
    }

    public String getNIP() {
        return this.NIP;
    }

    public void setGaji() {
        this.gaji = this.hariKerja * this.jamKerja * 15;
    }

    public void setBonus() {
        this.bonus = (((hariKerja - (hariKerja % 5)) * jamKerja * 15)
                + (((hariKerja - (hariKerja % 5)) * (jamKerja - 7) * 7))
                + ((hariKerja % 5) * jamKerja * 20));
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }


    public String getStatus() {
        String branch = String.format("%s cabang ke-%s", switch (this.NIP.charAt(0)) {
            case '1' -> "Mondstadt";
            case '2' -> "Liyue";
            case '3' -> "Inazuma";
            case '4' -> "Sumeru";
            case '5' -> "Fontaine";
            case '6' -> "Natlan";
            case '7' -> "Snezhnaya";
            default -> "";
        }, this.NIP.charAt(2));

        String departement = switch (this.NIP.charAt(6)) {
            case '1' -> "Pemasaran";
            case '2' -> "Humas";
            case '3' -> "Riset";
            case '4' -> "Teknologi";
            case '5' -> "Personalia";
            case '6' -> "Akademik";
            case '7' -> "Administrasi";
            case '8' -> "Operasional";
            case '9' -> "Pembangunan";
            default -> "";
        };

        return String.format("%s, %s", departement, branch);
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + this.getGaji() + this.getBonus();
    }

    @Override
    public String toString() {
        return String.format(
                "Nama\t\t\t: %s\nNIK\t\t\t: %s\nJenis Kelamin\t: %s\nPendapatan\t\t\t: %.1f$\nBonus\t\t\t: %.1f$\nGaji\t\t\t: %s$\nStatus\t\t\t: %s",
                this.getNama(),
                this.getNIK(),
                this.getJenisKelamin() ? "Laki-Laki" : "Perempuan",
                this.getPendapatan(),
                this.getBonus(),
                this.getGaji(),
                this.getStatus()
        );
    }
}
