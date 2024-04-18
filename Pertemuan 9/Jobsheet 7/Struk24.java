import java.util.Stack;

public class Struk24 {
    int nomorTransaksi;
    String tanggalPembelian;
    int jumlahBarang;
    double totalHargaBayar;

    public Struk24(int nomorTransaksi, String tanggalPembelian, int jumlahBarang, double totalHargaBayar) {
        this.nomorTransaksi = nomorTransaksi;
        this.tanggalPembelian = tanggalPembelian;
        this.jumlahBarang = jumlahBarang;
        this.totalHargaBayar = totalHargaBayar;
    }

    public String toString() {
        return "Nomor Transaksi: " + nomorTransaksi +
                "\nTanggal Pembelian: " + tanggalPembelian +
                "\nJumlah Barang: " + jumlahBarang +
                "\nTotal Harga Bayar: " + totalHargaBayar + "\n";
    }

}