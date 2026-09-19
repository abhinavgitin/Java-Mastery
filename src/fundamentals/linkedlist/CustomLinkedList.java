package fundamentals.linkedlist;

public class CustomLinkedList {

    private class Node { // this is an inner class
        private int value;
        private Node next; // The next is the object here

        public Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }

        public Node(int value) { // initializes a value for what object was calling it
            this.value = value;
        }
    }

    // These belong to the CustomLinkedList Objects
    private Node head;
    private Node tail;
    private int size;

    CustomLinkedList() {
        this.size = 0;
    }

    void insertFirst(int value ) {
        // for everytime this is called it make a new node (object) and points that to the beginning of the list
        Node node = new Node(value); // *this node
        node.next = head; // the next will point to the head
        head = node; // this makes the head point to the newly created *this node

        if ( tail == null ) {
            tail = head;
        }
        size++;
    }

    void insertLast ( int value ) {
        if ( tail == null ) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    void display() {
        Node temp = head;
        while ( temp != null ) {
            System.out.print(temp.value + " ->");
            temp = temp.next;
        }
        System.out.println("End");
    }
    int getSize() {
        return this.size;
    }
}

/* The entire mental model is that the linkedlist is storing the val and with the val its is also storing the address ( called reference in java {be strict} ) OF THE NEXT NODE
* so It's something like this |val,next| -> |val,next| -> and goes on till the size
*
* for example take the insert to be as 10 20 and 30 the head and the tail initially is null we insertFirst(10)
* then the new object is created and the value is initialized with 10 upon the object creation
* then we initialize the `next` data member of the class Node to point to the head initially so it is like next -> head
* now we point the head to the newly created node so it becomes like
* head -> null | or ity5
* next -> head | now the next will point to -> ity5
* then update the head to
* head -> node ( new ) it7z
* so now the head -> it7z
* ( i am using that to get some reference idea )
*
* and then we do the insertFirst(20)
* we create a new Node(20) object ig6t
* point the node.next which was initially ity5 ( node.next -> ity5 ) which is now ( node.next -> it7z )
* then update the node with the new node like previous it was head -> it7z which is now head -> ig6t
*
* and like wise we follow  */