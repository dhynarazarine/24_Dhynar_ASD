import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class LoopCollection24 {
    public static void main(String[] args) {
        //Percobaan 
        // Stack<String> fruits = new Stack<>();
        // fruits.push("Banana");
        // fruits.push("Orange");
        // fruits.add("Watermelon");
        // fruits.add("Leci");
        // fruits.push("Salak");

        // for (String fruit : fruits) {
        //     System.out.printf("%s ", fruit);
        // }

        // System.out.println("\n" + fruits.toString());

        // while (!fruits.empty()) {
        //     System.out.printf("%s ", fruits.pop());
        // }

        // fruits.push("Melon");
        // fruits.push("Durian");
        // System.out.println();
        // for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
        //     String fruit = it.next();
        //     System.out.printf("%s ", fruit);
        // }

        // System.out.println();
        // fruits.stream().forEach(e -> {
        //     System.out.printf("%s ", e);
        // });

        // System.out.println();
        // for (int i = 0; i < fruits.size(); i++) {
        //     System.out.printf("%s ", fruits.get(i));
        // }

         //Modifikasi Pertanyaan 5
         Stack<String> fruits = new Stack<>();
         fruits.push("Banana");
         fruits.push("Orange");
         fruits.add("Watermelon");
         fruits.add("Leci");
         fruits.push("Salak");
        //Mengganti elemen terakhir dengan "Strawberry"
         fruits.set(fruits.size() - 1, "Strawberry");
          for (String fruit : fruits) {
              System.out.printf("%s ", fruit);
          }
 
          System.out.println("\n" + fruits.toString());
 
          while (!fruits.empty()) {
              System.out.printf("%s ", fruits.pop());
          }
        //   fruits.push("Melon");
        //   fruits.push("Durian");
          System.out.println();
          for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
              String fruit = it.next();
              System.out.printf("%s ", fruit);
         }
 
          System.out.println();
          fruits.stream().forEach(e -> {
              System.out.printf("%s ", e);
          });
 
          System.out.println();
          for (int i = 0; i < fruits.size(); i++) {
              System.out.printf("%s ", fruits.get(i));
         }
         

        //Modifikasi Pertanyaan 6
        // Menambahkan buah baru
        fruits.push("Mango");
        fruits.push("Guava");
        fruits.push("Avocado");

        // Melakukan sorting
        Collections.sort(fruits);

        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }
        System.out.println();

    
    }
}