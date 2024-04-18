public class Rekening24 {
    String noRekening, nama, namaibu, Phone, Email;

    Rekening24(String a, String b, String c, String d, String e){
        this.noRekening = a;
        this.nama       = b;
        this.namaibu    = c;
        this.Phone      = d;
        this.Email      = e;
    }

    void tampilkanData() {
        System.out.printf("%-15s%-20s%-20s%-15s%-25s%n", noRekening, nama, namaibu, Phone, Email);
    }


}