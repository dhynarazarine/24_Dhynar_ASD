public class Tugas1 {
    public String nama;
    public String jenisKelamin;
    public int NIM;
    public double IPK;

    public Tugas1(){

    }

    public Tugas1(int N, double IP, String name, String JK){
        nama = name;
        jenisKelamin = JK;
        NIM = N;
        IPK = IP;
    }

    
    void cetakInfoMhs(int i){
        System.out.println();
        System.out.println("Data Mahasiswa ke-" + (i+1) );
        System.out.println("Nama         : " + nama );
        System.out.println("NIM          : "+ NIM);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("IPK          : " + IPK);
    }
    
}
