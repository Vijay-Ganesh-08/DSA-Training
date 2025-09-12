package LinkedList.SinglyLinkedList.Insertion;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedListInsertion oInsertion = new SinglyLinkedListInsertion();
        oInsertion.createSinglyLinkedList(5);
        System.out.println(oInsertion.head.value);

        // oInsertion.insertInLinkedList(6, 0);
        // System.out.println(oInsertion.head.value);

        oInsertion.insertInLinkedList(7, 1);
        System.out.println(oInsertion.head.next.value);

        oInsertion.insertInLinkedList(8, 3);
        System.out.println(oInsertion.head.next.next.value);
    }
}
