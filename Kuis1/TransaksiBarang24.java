import java.util.Scanner;
public class TransaksiBarang24{
    public Barang24 [] barangs = new Barang24 [100];
    public Barang24 [] pembelians = new Barang24 [100];
    public int jumlahBarang;
    public int jumlahPembelian;

    public TransaksiBarang24(){
        barangs[jumlahBarang++] = new Barang24("K01", "Sabun", 1000, 5);
        barangs[jumlahBarang++] = new Barang24("K02", "Pasta Gigi", 2000, 10);
        barangs[jumlahBarang++] = new Barang24("K03", "Biore", 3000, 23);
        barangs[jumlahBarang++] = new Barang24("K04", "Shampoo", 4000, 55);
        barangs[jumlahBarang++] = new Barang24("K05", "Sikat Gigi", 5000, 65);
    }
    public void tampilkanBarang() {
        System.out.println("Daftar Barang:");
        System.out.format("=======================================\n");
        System.out.format("| Kode |    Nama    |  Harga  | Stok  |\n");
        System.out.format("=======================================\n");
        for (int i = 0; i < jumlahBarang; i++) {
            Barang24 barang = barangs[i];
            System.out.format("| %-4s | %-10s | %-7.2f | %-5d |\n", barang.getKode(), barang.getNama(), barang.getHarga(), barang.getStok());
        }
        System.out.format("_______________________________________\n");
    }
    public void tampilkanBarangPembelian() {
        System.out.println("Daftar Pembelian:");
        for (int i = 0; i < jumlahPembelian; i++) {
            Barang24 barang = pembelians[i];
            System.out.println("Kode: " + barang.getKode() + ", Nama: " + barang.getNama() + ", Harga: " + barang.getHarga());
        }
    }
    public void melakukanPembelian() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Masukkan kode barang: ");
            String kodeBarang = sc.nextLine();

            Barang24 barangDibeli = null;
            for (int i = 0; i < jumlahBarang; i++) {
                Barang24 barang = barangs[i];
                if (barang.getKode().equals(kodeBarang)) {
                    barangDibeli = barang;
                    break;
                }
            }

            if (barangDibeli != null && barangDibeli.getStok() > 0) {
                pembelians[jumlahPembelian++] = barangDibeli;
                barangDibeli.setStok(barangDibeli.getStok() - 1);
                System.out.println("Pembelian berhasil!");

                System.out.print("Apakah ingin menambahkan barang lagi? (ya/tidak): ");
                String tambahLagi = sc.nextLine();
                if (!tambahLagi.equalsIgnoreCase("ya")) {
                    break;
                }
            } else {
                System.out.println("Barang tidak ditemukan atau stok habis.");
            }
        } while (true);
    }
}
