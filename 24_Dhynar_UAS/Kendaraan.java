public class Kendaraan {
    String noTNKB;
    String namaPemilik;
    String jenis;
    int cc;
    int tahun;
    int bulanHarusBayar;

    public Kendaraan(String noTNKB, String namaPemilik, String jenis, int cc, int tahun, int bulanHarusBayar) {
        this.noTNKB = noTNKB;
        this.namaPemilik = namaPemilik;
        this.jenis = jenis;
        this.cc = cc;
        this.tahun = tahun;
        this.bulanHarusBayar = bulanHarusBayar;
    }

    public String getNoTNKB() {
        return noTNKB;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public String getJenis() {
        return jenis;
    }

    public int getCc() {
        return cc;
    }

    public int getTahun() {
        return tahun;
    }

    public int getBulanHarusBayar() {
        return bulanHarusBayar;
    }
}