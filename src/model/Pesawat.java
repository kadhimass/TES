package model;

public class Pesawat {
    private String kodePesawat;
    private String maskapai;
    private String asal;
    private String tujuan;
    private int kapasitasKursi;
    private int kursiTerisi;

    public Pesawat(String kodePesawat, String maskapai, String asal, String tujuan, int kapasitasKursi) {
        if (kapasitasKursi <= 0) {
            throw new IllegalArgumentException("Kapasitas kursi harus lebih dari 0.");
        }

        this.kodePesawat = kodePesawat;
        this.maskapai = maskapai;
        this.asal = asal;
        this.tujuan = tujuan;
        this.kapasitasKursi = kapasitasKursi;
        this.kursiTerisi = 0;
    }

    public String getKodePesawat() {
        return kodePesawat;
    }

    public String getMaskapai() {
        return maskapai;
    }

    public String getAsal() {
        return asal;
    }

    public String getTujuan() {
        return tujuan;
    }

    public int getKapasitasKursi() {
        return kapasitasKursi;
    }

    public int getKursiTerisi() {
        return kursiTerisi;
    }

    public int getSisaKursi() {
        return kapasitasKursi - kursiTerisi;
    }

    public boolean tersediaKursi() {
        return getSisaKursi() > 0;
    }

    public boolean pesanKursi() {
        if (!tersediaKursi()) {
            return false;
        }

        kursiTerisi++;
        return true;
    }

    public String getInfoPesawat() {
        return "Pesawat " + maskapai
                + " (" + kodePesawat + ")"
                + " rute " + asal + " -> " + tujuan
                + ", kapasitas: " + kapasitasKursi
                + ", terisi: " + kursiTerisi
                + ", sisa kursi: " + getSisaKursi();
    }

    @Override
    public String toString() {
        return getInfoPesawat();
    }
}
