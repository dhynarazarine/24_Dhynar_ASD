public class Tugas2 {
    public String namaMK, KodeMK;
    public int  SKS, jam, semester;
    
    public Tugas2(){
    }

    public Tugas2(String KdMK, String MK,int sms,int Sks,int jm){
        KodeMK = KdMK;
        namaMK = MK;
        semester = sms;
        SKS = Sks;
        jam = jm;
    }

    public void displayInfo(){
        System.out.println("Kode MK     :" + KodeMK);
        System.out.println("Mata Kuliah :" + namaMK);
        System.out.println("Semester    :" + semester);
        System.out.println("SKS         :" + SKS);
        System.out.println("Jam         :" + jam);
    }
}