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

    public void addFirst(int data) {
        Node newNode = new Node(data); // create new node
        if (head == null) {
            head = tail = newNode;
            return;
        }
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

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.printNode();
        ll.addFirst(2);
        ll.printNode();
        ll.addFirst(1);
        ll.printNode();
        ll.addLast(3);
        ll.printNode();
        ll.addLast(4);
        ll.printNode();

        ll.printNode();

    }
}
