public class Buku24 {
    String judul, pengarang;
    int halaman, stok, harga, totalHarga;

    void tampilInformasi(){
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga:Rp " + harga);
    }

    void terjual (int jml){
        if (stok > 0) {
                stok -= jml;
                System.out.println(jml + " buku terjual.");
            } else {
                System.out.println("Maaf, stok tidak mencukupi untuk melakukan penjualan sebanyak " + jml + " buku.");
            }
        }

    void restock (int jml){
        stok += jml;
    }

    void gantiHarga (int hrg){
        harga = hrg;
    }
    
    public Buku24(){

    }
    public Buku24(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
    int hitungHargaTotal(int jml) {
        return harga * jml;
    }
    double hitungDiskon(double hitungHargaTotal) {
        if (totalHarga > 150000) {
            return 0.15 * totalHarga;
        } else if (totalHarga >= 75000 && totalHarga <= 150000) {
            return 0.05 * totalHarga;
        } else {
            return 0;
        } 
    }
    double hargaAkhir(int jml) {
        double totalHarga = hitungHargaTotal(jml);
        double diskon = hitungDiskon(jml);
        return totalHarga - diskon;
}
}
