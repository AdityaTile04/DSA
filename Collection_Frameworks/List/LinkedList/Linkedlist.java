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

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(5);
        ll.add(3, 4);
        ll.printNode();

        // ll.removeFirst();
        // ll.removeLast();
        // System.out.println("Size of LL is: " + ll.size);

        System.out.println("key found at index: " + ll.search(4));
        System.out.println("key found at index: " + ll.search(10)); // not found return -1
    }
}
