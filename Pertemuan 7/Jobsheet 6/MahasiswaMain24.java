import java.util.Scanner;

public class MahasiswaMain24 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner (System.in);
        Scanner sl = new Scanner (System.in);

        int jumMhs = 5;
        
        System.out.print("Input jumlah Mahasiswa: ");
        int maxSize = s.nextInt();
        PencarianMhs24 data = new PencarianMhs24(maxSize);

        System.out.println("-----------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara Urut dari NIM Terkecil");
        for (int i = 0; i < maxSize; i++){
            System.out.println("-------------------------");
            System.out.print("Nim\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = sl.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();

            Mahasiswa24 m = new Mahasiswa24(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("---------------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa  : ");
        data.tampil();
        
        System.out.println("---------------------------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan NIM Mahasiswa yang dicari: ");
        System.out.print("NIM : ");
        int cari = s.nextInt();

        //Sequential Search
        System.out.println("menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);


        //Binary Search
        System.out.println("==============================");
        System.out.println("menggunakan binary search");
        posisi = data.FindBinarySearch(cari, 0, maxSize-1);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}
