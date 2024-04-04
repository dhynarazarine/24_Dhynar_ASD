//Modif Percobaan 2 Pertanyaan 4
import java.util.Scanner;
public class StackMain24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackPakaian24 stk = new StackPakaian24(5);
        char pilih = 'y';
        while (pilih == 'y') {
            System.out.println("===== Menu =====");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Keluar");
            System.out.print("Pilihan (1 - 5) : ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Jenis : ");
                    String jenis = sc.nextLine();
                    System.out.print("Warna : ");
                    String warna = sc.nextLine();
                    System.out.print("Merk  : ");
                    String merk = sc.nextLine();
                    System.out.print("Ukuran: ");
                    String ukuran = sc.nextLine();
                    System.out.print("Harga : ");
                    double harga = sc.nextDouble();
                    sc.nextLine();
                    Pakaian24 p = new Pakaian24(jenis, warna, merk, ukuran, harga);
                    stk.push(p);
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.peek(); 
                    break;
                case 4:
                    stk.print();
                    break;
                case 5:
                    System.out.println("Keluar dari Program!");
                    return;
                default:
                    System.out.println("Piliham tidak valid!!!");
            }

            System.out.print("\nApakah anda ingin melanjutkan (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
        }
    }
}      

//Tugas nomor 1
// import java.util.Scanner;
// public class StackMain24 {
//     public static void main(String[] args) {
//         StackPakaian24 stk = new StackPakaian24(5);
//         Scanner sc = new Scanner(System.in);
//         char pilih = ' ';
//         do {
//             System.out.print("Jenis : ");
//             String jenis = sc.nextLine();
//             System.out.print("Warna : ");
//             String warna = sc.nextLine();
//             System.out.print("Merk  : ");
//             String merk = sc.nextLine();
//             System.out.print("Ukuran: ");
//             String ukuran = sc.nextLine();
//             System.out.print("Harga : ");
//             double harga = sc.nextDouble();

//             Pakaian24 p = new Pakaian24(jenis, warna, merk, ukuran, harga);
//             System.out.print("Apakah anda akan menambahkan data baru ke stack (y/n)? ");
//             pilih = sc.next().charAt(0);
//             sc.nextLine();
//             stk.push(p);
//         } while (pilih == 'y');
//         stk.print();
//         stk.pop();
//         stk.peek();
//         stk.print();
//         stk.getMax(); 
//     }
// }
