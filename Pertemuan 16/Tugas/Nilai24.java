public class Nilai24 implements Comparable<Nilai24>{
    Mahasiswa24 mahasiswa;
    MataKuliah24 matkul;
    double nilai;

    public Nilai24(Mahasiswa24 mahasiswa, MataKuliah24 matkul, double nilai) {
        this.mahasiswa = mahasiswa;
        this.matkul = matkul;
        this.nilai = nilai;
    }

    public Mahasiswa24 getMahasiswa() {
        return mahasiswa;
    }

    public MataKuliah24 getMatkul() {
        return matkul;
    }

    public double getNilai() {
        return nilai;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-15s %-30s %-5d %-5.2f", mahasiswa.getNim(), mahasiswa.getNama(), matkul.getMatkul(), matkul.getSks(), nilai);
    }
    public int compareTo(Nilai24 other) {
        return Double.compare(this.nilai, other.nilai);
    }
}