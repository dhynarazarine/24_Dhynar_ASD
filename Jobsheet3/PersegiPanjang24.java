public class PersegiPanjang24{
    public int panjang;
    public int lebar;   

    void cetakInfo(int i){
        System.out.println("Persegi panjang ke-" + (i+1) + "(panjang: " + panjang + ", lebar: " + lebar + ")");
    }

    public PersegiPanjang24(){
        
    }
    public PersegiPanjang24 (int p, int l){
        panjang = p;
        lebar = l;
    }

    void hitungLuas() {
        int luas = panjang * lebar;
        System.out.println("Luas persegi panjang: " + luas);
    }

    void hitungKeliling() {
        int keliling = 2 * (panjang + lebar);
        System.out.println("Keliling persegi panjang: " + keliling);
        System.out.println();
    }
}