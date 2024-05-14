import java.util.Scanner;

public class ScavengerMain24 {
    public static void main(String[] args) {
        ScavengerHunt24 game = new ScavengerHunt24();
        game.addPoint("Berada dimana kota Probolinggo?", "Jawa Timur");
        game.addPoint("Ikon kota Probolinggo?", "Mangga Anggur");
        game.addPoint("Berapa 2 pangkat 2?", "4");
        game.addPoint("Gunung yang ada di daerah Probolinggo", "Bromo");

        game.displayPoints();

        Scanner sc24 = new Scanner(System.in);
        while (game.head != null) {
            System.out.print("Jawab: ");
            String answer = sc24.nextLine();
            if (game.checkAnswer(answer)) {
                System.out.println("Jawaban benar! Lanjut ke point berikutnya.");
            } else {
                System.out.println("Jawaban salah. Coba lagi.");
            }
        }
        System.out.println("Selamat! Anda telah menyelesaikan game.");
        sc24.close();
        System.exit(0);
    }
}
