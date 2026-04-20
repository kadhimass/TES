package model;

public class Tiket {
    private String kodeTiket;
    private String namaPenumpang;
    private Pesawat pesawat;
    private String nomorKursi;
    private double harga;

    public Tiket(String kodeTiket, String namaPenumpang, Pesawat pesawat, String nomorKursi, double harga) {
        if (pesawat == null) {
            throw new IllegalArgumentException("Pesawat tidak boleh null.");
        }

        if (harga < 0) {
            throw new IllegalArgumentException("Harga tiket tidak boleh negatif.");
        }

        if (!pesawat.pesanKursi()) {
            throw new IllegalStateException("Kursi pada pesawat sudah penuh.");
        }

        this.kodeTiket = kodeTiket;
        this.namaPenumpang = namaPenumpang;
        this.pesawat = pesawat;
        this.nomorKursi = nomorKursi;
        this.harga = harga;
    }

    public String getKodeTiket() {
        return kodeTiket;
    }

    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public Pesawat getPesawat() {
        return pesawat;
    }

    public String getNomorKursi() {
        return nomorKursi;
    }

    public double getHarga() {
        return harga;
    }

    public String getDetailTiket() {
        return "Tiket " + kodeTiket
                + "\nPenumpang : " + namaPenumpang
                + "\nPesawat   : " + pesawat.getMaskapai() + " (" + pesawat.getKodePesawat() + ")"
                + "\nRute      : " + pesawat.getAsal() + " -> " + pesawat.getTujuan()
                + "\nKursi     : " + nomorKursi
                + "\nHarga     : Rp" + String.format("%.0f", harga);
    }

    @Override
    public String toString() {
        return getDetailTiket();
    }
}
