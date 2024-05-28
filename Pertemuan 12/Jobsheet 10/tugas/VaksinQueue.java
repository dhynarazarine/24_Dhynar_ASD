package tugas;
public class VaksinQueue {
    Node24 head, tail;
    int size;

    public VaksinQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(String nama, String nomorAntrian) {
        Node24 newNode24 = new Node24(nama,nomorAntrian);
        if (head == null) {
            head = tail = newNode24;
        } else {
            tail.next = newNode24;
            newNode24.prev = tail;
            tail = newNode24;
        }
        size++;
        System.out.println("--------------------------------------------------");
        System.out.println(nama + " Telah ditambahkan ke antrian " + nomorAntrian);
    }

    public void remove() {
        if (head == null) {
            System.out.println("Antrian kosong!");
        } else {
            Node24 tmp = head;
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            size--;
            System.out.println(tmp.nama +" telah selesai divaksinasi.");
        }
    }

    public void printQueue() {
        if (head == null) {
            System.out.println("Antrian kosong.");
        } else {
            Node24 current = head;
            System.out.println("-----------------------");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("-----------------------");
            System.out.println("|No\t|Nama\t|");
            while (current != null) {
                System.out.println("|" + current.nomorAntrian + "\t|" + current.nama + "\t|");
                current = current.next;
            }
        }
        System.out.println("Sisa antrian: " + size);
    }
}
