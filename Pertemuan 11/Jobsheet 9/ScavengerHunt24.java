public class ScavengerHunt24 {
    Pointer24 head;

    public ScavengerHunt24() {
        this.head = null;
    }

    public void addPoint(String question, String answer) {
        Pointer24 newPoint = new Pointer24(question, answer);
        if (head == null) {
            head = newPoint;
        } else {
            Pointer24 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newPoint;
        }
    }

    public void displayPoints() {
        Pointer24 current = head;
        int index = 1;
        while (current != null) {
            System.out.println("Point " + index + ": " + current.pertanyaan);
            current = current.next;
            index++;
        }
    }

    public boolean checkAnswer(String userAnswer) {
        if (head != null) {
            if (head.jawaban.equals(userAnswer)) {
                head = head.next;
                return true;
            }
        } else {
            return false;
        }
        return false;
    }
}
