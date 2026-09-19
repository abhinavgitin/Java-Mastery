package fundamentals.linkedlist;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        System.out.println();
        list.insertFirst(78);
        list.insertFirst(7);
        list.insertFirst(758);
        list.insertFirst(73);
        list.insertFirst(71);
        list.display();
        list.insertLast(919);
        list.insertLast(9101);
        list.display();
        System.out.println(list.getSize());
    }
}
