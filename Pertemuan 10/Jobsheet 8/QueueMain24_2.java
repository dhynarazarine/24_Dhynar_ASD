import java.util.Scanner;

public class QueueMain24_2 {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian paling belakang");
        System.out.println("-------------------------------------");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        Queue24_2 Antri = new Queue24_2(jumlah);

        int pilih;

        do{
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening: ");
                    String norek = sc.next();
                    System.out.print("Nama: ");
                    String nama = sc.next();
                    System.out.print("Alamat: ");
                    String alamat = sc.next();
                    System.out.print("Umur: ");
                    int umur = sc.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = sc.nextDouble();

                    Nasabah24 nb = new Nasabah24(norek, nama, alamat, umur, saldo);
                    sc.nextLine();
                    Antri.Enqueue(nb);
                    break;

                case 2:
                Nasabah24 data = Antri.Dequeue();
                    if (! " ".equals(data.norek) && !" ".equals(data.nama) && !" ".equals(data.alamat) && data.umur != 0 && data.saldo != 0){
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " " + data.alamat + " " + data.umur + " " + data.saldo + " ");
                        break;
                    }            
            
                case 3 :
                    Antri.peek();
                    break;

                case 4 :
                    Antri.print();
                    break;

                case 5: // Modifikasi
                    Nasabah24 rearData = Antri.peakRear();
                    if (rearData != null) {
                        System.out.println("Antrian paling belakang: " + rearData.alamat + " " + rearData.umur + " " + rearData.norek + " " + rearData.saldo + " " + rearData.nama);
                    }
                    break;
                }
            } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
        }
    }
