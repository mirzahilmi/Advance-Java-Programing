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

        this.gaji = this.calculateGaji();
        this.bonus = this.calculateBonus();
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

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calculateGaji() {
        return this.hariKerja * this.jamKerja * 15;
    }

    public double calculateBonus() {
        int weekDays = (this.hariKerja - this.hariKerja / 7 * 7) == 6 ?
                this.hariKerja / 7 * 2 + 1 : this.hariKerja / 7 * 2;

        // Rumus bonus lembur = total hari kerja bukan libur * jam kerja diatas 7 jam * 7
        // Rumus bonus libur = total hari libur * jam kerja * 20
        return ((this.hariKerja - weekDays) * (this.jamKerja - 7) * 7) + (weekDays * this.jamKerja * 20);
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
                "%s\nBonus\t\t\t: %.1f$\nGaji\t\t\t: %s$\nStatus\t\t\t: %s",
                super.toString(), this.getBonus(), this.getGaji(), this.getStatus()
        );
    }
}
