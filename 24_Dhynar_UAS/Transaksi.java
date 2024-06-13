class Transaksi {
    TransaksiPajak[] daftarTransaksi;
    int jumlahTransaksi;

    Transaksi() {
        this.daftarTransaksi = new TransaksiPajak[10];
        this.jumlahTransaksi = 0;
    }

    void tampilkanTransaksi() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Daftar Transaksi Pembayaran Pajak:");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.printf("%-6s%-15s%-10s%-12s%-12s%-15s%n", "Kode", "Nominal Bayar", "Denda", "Bulan Bayar", "No. TNKB", "Nama Pemilik");
        for (int i = 0; i < jumlahTransaksi; i++) {
            TransaksiPajak transaksi = daftarTransaksi[i];
            System.out.printf("%-6d%-15d%-10d%-12d%-12s%-15s%n", transaksi.getKode(), transaksi.getNominalBayar(), transaksi.getDenda(), transaksi.getBulanBayar(), transaksi.getKendaraan().getNoTNKB(), transaksi.getKendaraan().getNamaPemilik());
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    void urutkanTransaksiBerdasarkanNamaPemilik() {
        for (int i = 0; i < jumlahTransaksi - 1; i++) {
            for (int j = 0; j < jumlahTransaksi - i - 1; j++) {
                if (daftarTransaksi[j].getKendaraan().getNamaPemilik().compareTo(daftarTransaksi[j + 1].getKendaraan().getNamaPemilik()) > 0) {
                    TransaksiPajak temp = daftarTransaksi[j];
                    daftarTransaksi[j] = daftarTransaksi[j + 1];
                    daftarTransaksi[j + 1] = temp;
                }
            }
        }
        System.out.println("Transaksi telah diurutkan berdasarkan nama pemilik.");
        tampilkanTransaksi();
    }

    void tambahTransaksi(TransaksiPajak transaksi) {
        if (jumlahTransaksi < daftarTransaksi.length) {
            daftarTransaksi[jumlahTransaksi++] = transaksi;
        } else {
            System.out.println("Kapasitas transaksi penuh.");
        }
    }

    long hitungTotalPendapatan() {
        long total = 0;
        for (int i = 0; i < jumlahTransaksi; i++) {
            total += daftarTransaksi[i].getNominalBayar();
        }
        return total;
    }
}