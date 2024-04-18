public class Transaksi24 {
    double saldo, saldoAwal, saldoAkhir;
    String tanggalTransaksi, type, noRekening;

    Transaksi24(Rekening24 rekening, double a, double b, double c, String d, String e){
        this.saldo              = a;
        this.saldoAwal          = b;
        this.saldoAkhir         = c;
        this.tanggalTransaksi   = d;
        this.type               = e;
        this.noRekening         = rekening.noRekening;
    }

    void tampilkanDataSaldo(){
        System.out.printf("%-20s%-15s%-20s%-20s%-15s%-25s%n",noRekening, saldo, saldoAwal, saldoAkhir, tanggalTransaksi, type);
    }
    
}
