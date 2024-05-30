import java.util.Scanner;

public class GraphMain24 {
    public static void main(String[] args) throws Exception{
        Graph24 gedung = new Graph24(6);
        //Percobaan 1
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();
        gedung.removeEdge(1, 3);
        gedung.printGraph();

        //Modifikasi Percobaan 1
        Scanner sc = new Scanner(System.in);
        int asal, tujuan;

        System.out.print("Masukkan inputan: ");
        int input = sc.nextInt();

        for (int i = 0; i < input; i++) {
            System.out.print("Masukkan gedung asal: ");
            asal = sc.nextInt();
            System.out.print("Masukkan gedung tujuan: ");
            tujuan = sc.nextInt();
            if (gedung.jikaBenar(asal, tujuan)) {
                System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga");
            } else {
                System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga");
            }
            System.out.println();
        }
        sc.close();

    }
}
