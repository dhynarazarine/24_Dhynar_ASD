package tugas;
import java.util.Scanner;

public class VaksinMain {
    public static void main(String[] args) {
        VaksinQueue queue = new VaksinQueue();
        Scanner sc24 = new Scanner(System.in);
        int menu;

        do {
            System.out.println("=============================");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("=============================");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("=============================");
            System.out.print("Masukan pilihan : ");
            menu = sc24.nextInt();
            sc24.nextLine();

            switch (menu) {
                case 1:
                System.out.println("-----------------------------------");
                System.out.println("Masukkan Data Penerima Vaksin");
                System.out.println("-----------------------------------");
                System.out.print("Masukkan nomor antrian : ");
                String nomorAntrian =sc24.next();
                System.out.print("Masukkan nama penerima : ");
                String nama = sc24.next();
                queue.add(nama, nomorAntrian);                   
                    break;
                
                case 2:
                queue.remove();
                break;

                case 3:
                queue.printQueue();
                break;

                case 4:
                System.out.println("KELUAR DARI PROGRAM");
                System.exit(0);
                break;
                default:
                System.out.println("Pilihan tidak valid, Silahkan coba lagi");
                break;

            }
        } while (menu != 5);
    }
}
