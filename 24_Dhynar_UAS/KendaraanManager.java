public class KendaraanManager {
    Kendaraan[] daftarKendaraan;
    int jumlahKendaraan;

    public KendaraanManager() {
        this.daftarKendaraan = new Kendaraan[10];
        this.jumlahKendaraan = 0;
        // Inisialisasi daftar kendaraan
        tambahKendaraan(new Kendaraan("S 4567 YV", "Basko", "Mobil", 2000, 2012, 4));
        tambahKendaraan(new Kendaraan("N 4511 VS", "Arta", "Mobil", 2500, 2015, 3));
        tambahKendaraan(new Kendaraan("AB 4321 A", "Wisnu", "Motor", 125, 2018, 2));
        tambahKendaraan(new Kendaraan("B 1234 AG", "Sisa", "Motor", 150, 2020, 1));
    }

    public void tambahKendaraan(Kendaraan kendaraan) {
        if (jumlahKendaraan < daftarKendaraan.length) {
            daftarKendaraan[jumlahKendaraan++] = kendaraan;
        } else {
            System.out.println("Kapasitas kendaraan penuh.");
        }
    }

    public void daftarKendaraan() {
        System.out.println("=========================");
        System.out.println("DAFTAR KENDARAAN");
        System.out.println("=========================");
        System.out.printf("| %-12s% | 15s% | 10s% | 6s% | 6s% | 15s%n", "No. TNKB", "Nama Pemilik", "Jenis", "CC", "Tahun", "Bulan Harus Bayar");
        for (int i = 0; i < jumlahKendaraan; i++) {
            Kendaraan kendaraan = daftarKendaraan[i];
            System.out.printf("%-12s%-15s%-10s%-6d%-6d%-15d%n", kendaraan.getNoTNKB(), kendaraan.getNamaPemilik(), kendaraan.getJenis(), kendaraan.getCc(), 
            kendaraan.getTahun(), kendaraan.getBulanHarusBayar());
        }
    }

    public Kendaraan cariKendaraan(String noTNKB) {
        for (int i = 0; i < jumlahKendaraan; i++) {
            if (daftarKendaraan[i].getNoTNKB().equals(noTNKB)) {
                return daftarKendaraan[i];
            }
        }
        return null;
    }
}