import java.util.Scanner;

public class TugasMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tugas1[] arrayOfMahasiswa = new Tugas1[3];
        int NIM;
        double IPK;
        String nama, jenisKelamin;
        double totalIpk = 0;

    
    for (int i = 0; i < 3; i++ ){
        System.out.println();
        System.out.println("Masukkan data Mahasiswa ke-" + (i + 1));
        System.out.print("Masukkan nama          : ");
        nama = sc.next();
        System.out.print("Masukkan NIM           : ");
        NIM = sc.nextInt();
        System.out.print("Masukkan jenis kelamin : ");
        jenisKelamin = sc.next();
        System.out.print("Masukkan IPK           : ");
        IPK = sc.nextDouble();

        arrayOfMahasiswa[i] = new Tugas1(NIM, IPK, nama, jenisKelamin);
        totalIpk += IPK;
    }
    int index = 0;
    for (Tugas1 tugas1 : arrayOfMahasiswa) {
        tugas1.cetakInfoMhs(index);
        index++;
    }
    if (3 != 0){
        double rataipk = totalIpk/3;
        System.out.println("Rata rata IPK : " + String.format("%.1f", rataipk));
    }
    }
}

   