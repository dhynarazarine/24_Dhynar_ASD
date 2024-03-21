import java.util.Scanner;

public class Tugas2Main {

    public static void main(String[] args) {
        System.out.println("=== DATA RENCANA STUDI MAHASISWA ===");
        Tugas2 item1 = new Tugas2( "SIB232001", "Kewarganegaraan", 2, 2, 2);
        Tugas2 item2 = new Tugas2( "SIB232002", "Analisis Proses Bisnis", 2, 3, 3);
        Tugas2 item3 = new Tugas2("SIB232003", "Pengenalan Sistem Informasi", 2, 3, 6);

        Tugas2[] items = new Tugas2[5];
        items[0] = item1;
        items[1] = item2;
        items[2] = item3;
        
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                items[i].displayInfo();
            }
        }
        
    }
}
