public class LaundryLinkedList24 {
    Node24 head;

    public LaundryLinkedList24() {
        this.head = null;
    }

    public void tambahItemLaundry(LaundryItem24 item) {
        Node24 newNode = new Node24(item);
        if (head == null) {
            head = newNode;
        } else {
            Node24 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void hapusItemLaundry(String id) {
        if (head == null)
            return;

        if (head.data.getId().equals(id)) {
            head = head.next;
            return;
        }

        Node24 current = head;
        while (current.next != null && !current.next.data.getId().equals(id)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public LaundryItem24 getItemLaundry(String id) {
        Node24 current = head;
        while (current != null) {
            if (current.data.getId().equals(id)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public void cetakSemuaItemLaundry() {
        System.out.println("==========================================================================");
        System.out.printf("%-5s | %-20s | %-30s | %-10s%n", "ID", "Nama Pelanggan", "Deskripsi Item", "Harga");
        System.out.println("==========================================================================");
        Node24 current = head;
        while (current != null) {
            LaundryItem24 item = current.data;
            System.out.printf("%-5s | %-20s | %-30s | %-10.2f%n", item.getId(), item.getNamaPelanggan(),
                    item.getDeskripsiItem(), item.getHarga());
            current = current.next;
        }
        System.out.println("==========================================================================");
    }
}
