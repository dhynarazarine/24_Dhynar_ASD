import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian Pasien");
        System.out.println("2. Panggil Pasien");
        System.out.println("3. Cek Pasien Terdepan");
        System.out.println("4. Cek Pasien Belakang");
        System.out.println("5. Cek posisi Pasien berdasarkan nama");
        System.out.println("6. Daftar Pasien dalam antrian");
        System.out.println("7. Keluar");
        System.out.println("-------------------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        Queue antri = new Queue(jumlah);
        int pilih;

        do{
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Nama:");
                    String nama = sc.next();
                    System.out.print("No. ID:");
                    int NoID = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P):");
                    char jenisKelamin = sc.nextLine().charAt(0);
                    System.out.print("Umur:");
                    int umur = sc.nextInt();
                    Pasien24 pasien = new Pasien24(nama, NoID, jenisKelamin, umur);
                    antri.Enqueue(pasien);
                    break;

                case 2:
                    Pasien24 keluar = antri.Dequeue();
                    if (keluar != null){
                        System.out.println("Pasien yang keluar: " + keluar.nama);
                    }
                    break;

                case 3:
                    antri.peek();
                    break;
                
                case 4:
                    antri.peakRear();
                    break;
                case 5:
                    System.out.print("Masukkan nama Pasien: ");
                    String namaCari = sc.next();
                    antri.peekPosition(namaCari);
                    break;
                
                case 6:
                    antri.daftarPasien();
                    break;

                }
            } while (pilih >= 1 && pilih <= 6);
}
}


