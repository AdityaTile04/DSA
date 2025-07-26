package LinkedList;

public class Linkedlist {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data); // create new node
        if (head == null) {
            head = tail = newNode;
            return;
        }
        size++;
        // step 2 : create newNode next = head;
        newNode.next = head;
        // step 3: head => newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data); // create a new node
        if (head == null) {
            head = tail = newNode;
        }
        size++;
        tail.next = newNode;
        tail = newNode;

    }

    public void printNode() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        size++;
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int search(int k) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == k) { // key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1; // key not found
    }

    public int helper(Node head, int k) {
        if (head == null) {
            return -1;
        }
        if (head.data == k) {
            return 0;
        }
        int i = helper(head.next, k);
        if (i == -1) {
            return -1;
        }
        return i + 1;
    }

    public int recursiveSearch(int k) {
        return helper(head, k);
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        if (n == size) {
            head = head.next; // remove first
            return;
        }
        int i = 1;
        int iToF = size - n;
        Node prev = head;
        while (i < iToF) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head) { // this is helper function
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPlindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        Node midNode = findMid(head);

        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void removeCycle() {
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
        if (cycle == false) {
            return;
        }

        slow = head;
        Node prev = null;

        // Special case: cycle starts at head
        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
            return;
        }

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;
    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);
        // left - right
        Node rigthHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRigth = mergeSort(rigthHead);

        return merge(newLeft, newRigth);
    }

    public void zigZag() {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node rigth = prev;
        Node nextL, nextR;

        while (left != null && rigth != null) {
            nextL = left.next;
            left.next = rigth;
            nextR = rigth.next;
            rigth.next = nextL;

            left = nextL;
            rigth = nextR;
        }
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(5);
        // ll.add(3, 4);
        // ll.printNode();

        // ll.removeFirst();
        // ll.removeLast();
        // System.out.println("Size of LL is: " + ll.size);

        // System.out.println("key found at index: " + ll.search(4));
        // System.out.println("key found at index: " + ll.search(10)); // not found
        // return -1

        // System.out.println("key found at index: " + ll.recursiveSearch(4));
        // System.out.println("key found at index: " + ll.recursiveSearch(10)); // not
        // found return -1

        // ll.printNode();
        // ll.deleteNthfromEnd(3);
        // ll.printNode();

        // palindrome LL
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);

        // ll.printNode();
        // System.out.println(ll.checkPlindrome());

        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;

        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

        Linkedlist list = new Linkedlist();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(6);

        // list.printNode();
        // list.head = list.mergeSort(ll.head);
        // ll.printNode();

        list.printNode();
        list.zigZag();
        list.printNode();

    }
}
