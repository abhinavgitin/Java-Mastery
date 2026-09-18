package fundamentals.linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(8);
        list.add(781);
        list.add(71);
        list.add(7);

        for (int i : list) {
            System.out.println(i + " ");
        }
    }
}
