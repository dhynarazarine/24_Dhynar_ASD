public class LinkedList24 {
    Node24 head;

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi linked list : ");
            Node24 currentNode24 = head;

            while (currentNode24 != null) {
                System.out.print(currentNode24.data + "\t");
                currentNode24 = currentNode24.next;
            }

            System.out.println("");
        }else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst (int input){
        Node24 newNode = new Node24(input, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast (int input) {
        Node24 newNode = new Node24(input, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            Node24 currentNode24 = head;

            while (currentNode24.next != null){
                currentNode24 = currentNode24.next;
            }

            currentNode24.next = newNode;
        }
    }

    public void insertAfter (int key, int input) {
        Node24 newNode = new Node24(input, null);

            if (!isEmpty()) {
                Node24 currentNode24 = head;

                do {
                    if (currentNode24.data == key){
                        newNode.next = currentNode24.next;
                        currentNode24.next = newNode;
                        break; 
                    }

                    currentNode24 = currentNode24.next;
            } while (currentNode24 != null);
        } else {
            System.out.print("Linked list kosong");
        }
    }
}
