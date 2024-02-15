import java.util.Scanner;

public class Array_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========================================================================================");
        System.out.println("                                Program Menghitung IP Semester                            ");
        System.out.println("==========================================================================================");
        
        // Nama-nama mata kuliah
        String[] matkul = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
       
        // Bobot SKS untuk setiap mata kuliah
        int[] sks= {2, 2, 3, 3, 3, 4, 2, 2};
        double[] nilaiAngka = new double[8];
        String[] nilaiHuruf = new String[8];
        double[] bobotNilai = new double[8];
        double ip, TotalIp = 0, ipSemester;
        int totalSKS = 0;

        // Memasukkan nilai angka untuk setiap mata kuliah
        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + matkul[i] + ": ");
            nilaiAngka[i] = scanner.nextDouble();
            
            if(nilaiAngka[i] <= 100 && nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4;
            } else if (nilaiAngka[i] <= 80 && nilaiAngka[i] > 73){
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            }  else if (nilaiAngka[i] <= 73 && nilaiAngka[i] > 65){
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3;
            }  else if (nilaiAngka[i] <= 65 && nilaiAngka[i] > 60){
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            }  else if (nilaiAngka[i] <= 60 && nilaiAngka[i] > 50){
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2;
            }  else if (nilaiAngka[i] <= 50 && nilaiAngka[i] > 39){
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1;
            }  else if (nilaiAngka[i] <= 39){
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            } if (nilaiAngka[i] > 100 && nilaiAngka[i] < 1) {
                nilaiAngka[i] = 0;
                nilaiHuruf[i] = "Tidak Valid!";
                bobotNilai[i] = 0;
            }
        }
        
        // Hasil Konversi Nilai yang sudah diinputkan 
        System.out.println("==========================================================================================");
        System.out.println("                                    Hasil Konversi Nilai                                  ");
        System.out.println("==========================================================================================");
        
        System.out.printf("%-40s %-15s %-15s %-15s \n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0;i < matkul.length;i++) {
            System.out.printf("%-43s %-17s %-14s %-1s \n", matkul[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }

        for (int i = 0;i < matkul.length;i++) {
            ip = bobotNilai[i] * sks[i];
            TotalIp += ip;
            totalSKS += sks[i];
        }

        ipSemester = TotalIp/totalSKS;
        System.out.println("==========================================================================================");
        System.out.printf("IP anda adalah " + "%.2f", ipSemester);
    }
}   
        
         
