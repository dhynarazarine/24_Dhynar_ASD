public class Barang24 {
    private String nama;
    private int harga;
    private int jumlah;

    // Constructor pertama
    public Barang24(String nama, int harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    // Constructor kedua
    public Barang24(String nama, int harga) {
        this(nama, harga, 0); // Memanggil constructor lengkap dengan nilai default untuk jumlah
    }

    // Constructor ketiga
    public Barang24(String nama) {
        this(nama, 0, 0); // Memanggil constructor lengkap dengan nilai default untuk harga dan jumlah
    }
}