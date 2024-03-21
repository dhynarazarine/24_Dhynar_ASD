import java.util.Scanner;
public class MainAkar24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.println("\t\tNILAI AKAR PANGKAT");
        System.out.println("=======================================================");
        System.out.print("Masukkan jumlah bilangan yang ingin dihitung akarnya: ");
        int jmlBilangan = sc.nextInt();

        Akar24[] akr = new Akar24[jmlBilangan];
        for (int i = 0; i < jmlBilangan; i++) {
            akr[i] = new Akar24();
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            akr[i].nilai = sc.nextInt();
        }

        System.out.println("=======================================================");
        System.out.println("Hasil Akar Pangkat Dua dengan Brute Force");
        for (int i = 0; i < jmlBilangan; i++) {
            System.out.println("Akar pangkat dua dari " + akr[i].nilai + " adalah: " + akr[i].akarBF(akr[i].nilai));
        }

        System.out.println("=======================================================");
        System.out.println("Hasil Akar Pangkat Dua dengan Divide and Conquer");
        for (int i = 0; i < jmlBilangan; i++) {
            System.out.println("Akar pangkat dua dari " + akr[i].nilai + " adalah: " + akr[i].akarDC(akr[i].nilai, 0, akr[i].nilai));
        }
        System.out.println("=======================================================");
    }
}