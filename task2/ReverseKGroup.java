package task2;

public class ReverseKGroup {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Original: ");
        printList(head);

        head = reverseKGroup(head, 2);

        System.out.print("Reversed (k=2): ");
        printList(head);
    }

    public static Node reverseKGroup(Node head, int k) {
        if (head == null || k <= 1)
            return head;

        int count = 0;
        Node temp = head;
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }

        if (count < k)
            return head;

        Node prev = null, curr = head, next = null;
        for (int i = 0; i < k; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        if (next != null) {
            head.next = reverseKGroup(next, k);
        }

        return prev;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }
}
