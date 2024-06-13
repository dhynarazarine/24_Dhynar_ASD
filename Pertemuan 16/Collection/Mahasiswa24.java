public class Mahasiswa24 {
    String nim;
    String nama;
    String noTelp;

    public Mahasiswa24() {

    }

    public Mahasiswa24(String nim, String nama, String noTelp) {
        this.nim = nim;
        this.nama = nama;
        this.noTelp = noTelp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + nim + ", nama=" + nama + ", noTelp=" + noTelp + "}";
    } 
}