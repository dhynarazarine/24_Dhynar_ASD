import java.util.Scanner;

public class PersegiPanjangDemo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah persegi panjang: ");
        int jumlahPersegiPanjang = sc.nextInt();
        PersegiPanjang24[] arrayOfPersegiPanjang24 = new PersegiPanjang24[jumlahPersegiPanjang];
        int panjang, lebar;
        
        // Percobaan 1
                arrayOfPersegiPanjang24[0]= new PersegiPanjang24();
                arrayOfPersegiPanjang24[0].panjang = 110;
                arrayOfPersegiPanjang24[0].lebar = 30;

                arrayOfPersegiPanjang24[1] = new PersegiPanjang24();
                arrayOfPersegiPanjang24[1].panjang = 80;
                arrayOfPersegiPanjang24[1].lebar = 40;

                arrayOfPersegiPanjang24[2] = new PersegiPanjang24();
                arrayOfPersegiPanjang24[2].panjang = 100;
                arrayOfPersegiPanjang24[2].lebar = 20;

                System.out.println("Persegi panjang ke -1, panjang: " + arrayOfPersegiPanjang24[0].panjang + ". lebar: " + arrayOfPersegiPanjang24[0].lebar);
                System.out.println("Persegi panjang ke -2, panjang: " + arrayOfPersegiPanjang24[1].panjang + ". lebar: " + arrayOfPersegiPanjang24[1].lebar);
                System.out.println("Persegi panjang ke -3, panjang: " + arrayOfPersegiPanjang24[2].panjang + ". lebar: " + arrayOfPersegiPanjang24[2].lebar);
        //Percobaan 2
        for (int i = 0; i < 3; i++){
                arrayOfPersegiPanjang24[i] = new PersegiPanjang24();
            
                System.out.println("Persegi panjang ke-" + (i + 1));
                System.out.print("Masukkan panjang: ");
                arrayOfPersegiPanjang24[i].panjang = sc.nextInt();
                System.out.print("Masukkan lebar: ");
                arrayOfPersegiPanjang24[i].lebar = sc.nextInt();
            }
            
            for (int i = 0; i < 3; i++){
                    System.out.println("Persegi panjang ke-" + (i + 1)+ ", panjang: " +
                    arrayOfPersegiPanjang24[i].panjang + ", lebar: " + arrayOfPersegiPanjang24[i].lebar);
                }          
        //Percobaan 3
        for (int i = 0; i < jumlahPersegiPanjang; i++){
            System.out.println();
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc.nextInt();
            
            arrayOfPersegiPanjang24[i] = new PersegiPanjang24(panjang,lebar);
        }   
        System.out.println();
        for(int i = 0; i < jumlahPersegiPanjang; i++){
            arrayOfPersegiPanjang24[i].cetakInfo(i);
            arrayOfPersegiPanjang24[i].hitungLuas();
            arrayOfPersegiPanjang24[i].hitungKeliling();
        }

            
    }
}
