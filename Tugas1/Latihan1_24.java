import java.util.Scanner;

public class Latihan1_24 {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (i == 6 || i == 10){
                continue;
            }
            if (i % 2 == 0){
                System.out.println(i + " ");
            } else {
                System.out.println("*");
            }
        }
    }
}