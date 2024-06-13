import java.util.Scanner;

public class Menu {
    KendaraanManager kendaraanManager;
    TransaksiManager transaksiManager;
    Scanner scanner;

    public Menu() {
        kendaraanManager = new KendaraanManager();
        transaksiManager = new TransaksiManager();
        scanner = new Scanner(System.in);
    }

    public void tampilkanMenu() {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Bayar Pajak");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan Transaksi berdasarkan nama Pemilik");
            System.out.println("5. Keluar");
            System.out.print("Pilih (1-5): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1:
                    kendaraanManager.daftarKendaraan();
                    break;
                case 2:
                    bayarPajak();
                    break;
                case 3:
                    transaksiManager.tampilkanTransaksi();
                    System.out.println("++++++++++++++++++++++++");
                    System.out.println("TOTAL PENDAPATAN: " + transaksiManager.hitungTotalPendapatan());
                    System.out.println("++++++++++++++++++++++++");
                    break;
                case 4:
                    transaksiManager.urutkanTransaksiBerdasarkanNamaPemilik();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    void bayarPajak() {
        System.out.println("*****************************");
        System.out.println("  MASUKKAN DATA PEMBAYARAN ");
        System.out.println("*****************************");
        System.out.print("Masukkan Nomer TNKB: ");
        String noTNKB = scanner.nextLine();
        Kendaraan kendaraanDitemukan = kendaraanManager.cariKendaraan(noTNKB);
        if (kendaraanDitemukan != null) {
            System.out.print("Bulan Bayar: ");
            int bulanBayar = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            long totalPembayaran = hitungTotalPembayaran(kendaraanDitemukan, bulanBayar);
            long denda = PajakCalculator.hitungDenda(kendaraanDitemukan, bulanBayar);

            TransaksiPajak transaksi = new TransaksiPajak(totalPembayaran, denda, bulanBayar, kendaraanDitemukan);
            transaksiManager.tambahTransaksi(transaksi);
            System.out.println("Pembayaran pajak berhasil.");
            System.out.println("><><><><><<><><><><><><><><><><><<>><><<><><><");
            System.out.printf("Kode: %d\nTNKB: %s\nNama: %s\nNominal: %d\nDenda: %d\n", transaksi.getKode(), 
            transaksi.getKendaraan().getNoTNKB(), transaksi.getKendaraan().getNamaPemilik(), transaksi.getNominalBayar(), transaksi.getDenda());
            System.out.println("><><><><><<><><><><><><><><><><><<>><><<><><><");
        } else {
            System.out.println("Kendaraan dengan nomor TNKB tersebut tidak ditemukan.");
        }
    }

    long hitungTotalPembayaran(Kendaraan kendaraan, int bulanBayar) {
        long totalPembayaran = PajakCalculator.hitungPajak(kendaraan);
        long denda = PajakCalculator.hitungDenda(kendaraan, bulanBayar);
        totalPembayaran += denda;
        return totalPembayaran;
    }
}