public class LaundryItem24 {
    String id;
    String namaPelanggan;
    String deskripsiItem;
    double harga;

    public LaundryItem24(String id, String namaPelanggan, String deskripsiItem, double harga) {
        this.id = id;
        this.namaPelanggan = namaPelanggan;
        this.deskripsiItem = deskripsiItem;
        this.harga = harga;
    }

    public String getId() {
        return id;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getDeskripsiItem() {
        return deskripsiItem;
    }

    public double getHarga() {
        return harga;
    }
}
