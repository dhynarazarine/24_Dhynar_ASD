public class PersegiPanjangDemo24 {
    public static void main(String[] args) {
        PersegiPanjang24[] arrayOfPersegiPanjang24 = new PersegiPanjang24[3];

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
    }   
}
