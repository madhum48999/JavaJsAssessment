package task2;

public class DetectCycle {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2; // cycle

        System.out.println("Created list with cycle 1->2->3->4->2...");

        Node start = detectCycle(head);
        if (start != null) {
            System.out.println("Cycle detected at node with data: " + start.data);
        } else {
            System.out.println("No cycle detected");
        }
    }

    public static Node detectCycle(Node head) {
        if (head == null || head.next == null)
            return null;

        Node slow = head, fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (!cycle)
            return null;

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
