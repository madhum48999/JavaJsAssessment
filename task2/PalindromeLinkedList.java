package task2;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        System.out.print("List: ");
        printList(head);

        if (isPalindrome(head)) {
            System.out.println("Is Palindrome: Yes");
        } else {
            System.out.println("Is Palindrome: No");
        }
    }

    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null)
            return true;

        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null, curr = slow, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node p1 = head;
        Node p2 = prev;

        while (p2 != null) {
            if (p1.data != p2.data)
                return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    static void printList(Node node) {
        Node temp = node;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
