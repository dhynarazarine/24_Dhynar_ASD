import java.util.Scanner;

public class MainLaundry24 {
    public static void main(String[] args) {
        LaundryService24 layanan = new LaundryService24();

        layanan.tambahItemLaundry(new LaundryItem24("1", "Rina", "Baju", 50000));
        layanan.tambahItemLaundry(new LaundryItem24("2", "Bayu", "Celana", 30000));
        layanan.tambahItemLaundry(new LaundryItem24("3", "Saiful", "Gaun", 70000));
        layanan.tambahItemLaundry(new LaundryItem24("4", "Rahmat", "Jas", 100000));
        layanan.tambahItemLaundry(new LaundryItem24("5", "Indah", "Gamis", 35000));

        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("***** Menu Layanan Laundry *****");
            System.out.println("1. Tambah Item Laundry");
            System.out.println("2. Hapus Item Laundry");
            System.out.println("3. Ambil Item Laundry");
            System.out.println("4. Cetak Semua Item Laundry");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID               : ");
                    String id = scanner.nextLine();
                    System.out.print("Masukkan Nama Pelanggan   : ");
                    String namaPelanggan = scanner.nextLine();
                    System.out.print("Masukkan Deskripsi Item   : ");
                    String deskripsiItem = scanner.nextLine();
                    System.out.print("Masukkan Harga            : ");
                    double harga = scanner.nextDouble();
                    scanner.nextLine();  
                    layanan.tambahItemLaundry(new LaundryItem24(id, namaPelanggan, deskripsiItem, harga));
                    break;
                case 2:
                    System.out.print("Masukkan ID yang ingin dihapus : ");
                    id = scanner.nextLine();
                    layanan.hapusItemLaundry(id);
                    break;
                case 3:
                    System.out.print("Masukkan ID yang ingin diambil : ");
                    id = scanner.nextLine();
                    LaundryItem24 item = layanan.getItemLaundry(id);
                    if (item != null) {
                        System.out.println("Detail Item");
                        System.out.println("ID              : " + item.getId());
                        System.out.println("Nama Pelanggan  : " + item.getNamaPelanggan());
                        System.out.println("Deskripsi Item  : " + item.getDeskripsiItem());
                        System.out.println("Harga           : " + item.getHarga());
                    } else {
                        System.out.println("Item tidak ditemukan!");
                    }
                    break;
                case 4:
                    layanan.cetakSemuaItemLaundry();
                    break;
                case 5:
                    System.out.println("Anda Telah Keluar Dari Program");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
