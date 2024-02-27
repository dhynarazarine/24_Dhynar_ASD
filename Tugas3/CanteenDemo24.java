import java.util.Scanner;

public class CanteenDemo24 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan nama makanan: ");
        String nama = input.next();
        System.out.print("Masukkan harga: ");
        double harga = input.nextDouble();
        System.out.print("Masukkan jumlah stock: ");
        int stock = input.nextInt();

        Item24 item1 = new Item24("Nasi Goreng", 15000,10);
        Item24 item2 = new Item24("Donat Gula", 3000,20);
        Item24 item3 = new Item24("Cimory", 7000,15);
        Item24 item4 = new Item24("Kebab", 4500,12);
        Item24 item5 = new Item24("Nasi Kuning", 9000,16);

        Item24 item6 = new Item24 (nama,harga,stock);
        item6.displayInfo();
        
        Item24[] items = new Item24[5];
        items[0] = item1;
        items[1] = item2;
        items[2] = item3;
        items[3] = item4;
        items[4] = item5;
        
        for (int i = 0; i < items.length; i++){
           items[i].displayInfo();
        }
   
    }
    
}
