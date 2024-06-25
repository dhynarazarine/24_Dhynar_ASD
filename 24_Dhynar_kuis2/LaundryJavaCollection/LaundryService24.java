import java.util.ArrayList;
import java.util.List;

public class LaundryService24 {
    List<LaundryItem24> itemLaundryList;

    public LaundryService24() {
        this.itemLaundryList = new ArrayList<>();
    }

    public void tambahItemLaundry(LaundryItem24 item) {
        itemLaundryList.add(item);
    }

    public void hapusItemLaundry(String id) {
        boolean isRemoved = itemLaundryList.removeIf(item -> item.getId().equals(id));
        if (isRemoved) {
            System.out.println("Item dengan ID " + id + " berhasil dihapus.");
        } else {
            System.out.println("Item dengan ID " + id + " tidak ditemukan.");
        }
    }

    public LaundryItem24 getItemLaundry(String id) {
        for (LaundryItem24 item : itemLaundryList) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public void cetakSemuaItemLaundry() {
        System.out.println("==========================================================================");
        System.out.printf("%-5s | %-20s | %-30s | %-10s%n", "ID", "Nama Pelanggan", "Deskripsi Item", "Harga");
        System.out.println("==========================================================================");
        for (LaundryItem24 item : itemLaundryList) {
            System.out.printf("%-5s | %-20s | %-30s | %-10.2f%n", item.getId(), item.getNamaPelanggan(), item.getDeskripsiItem(), item.getHarga());
        }
        System.out.println("==========================================================================");
    }
}