public class TransaksiPajak {
    static int counter = 0;
    int kode;
    long nominalBayar;
    long denda;
    int bulanBayar;
    Kendaraan kendaraan;

    public TransaksiPajak(long nominalBayar, long denda, int bulanBayar, Kendaraan kendaraan) {
        this.kode = ++counter;
        this.nominalBayar = nominalBayar;
        this.denda = denda;
        this.bulanBayar = bulanBayar;
        this.kendaraan = kendaraan;
    }

    public int getKode() {
        return kode;
    }

    public long getNominalBayar() {
        return nominalBayar;
    }

    public long getDenda() {
        return denda;
    }

    public int getBulanBayar() {
        return bulanBayar;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }
}