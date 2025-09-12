package LinkedList.SinglyLinkedList.Traversal;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedListTraversal oTraversal = new SinglyLinkedListTraversal();
        oTraversal.createSinglyLinkedList(5);
        oTraversal.insertInLinkedList(6, 1);
        oTraversal.insertInLinkedList(7, 3);
        oTraversal.insertInLinkedList(8, 4);
        oTraversal.insertInLinkedList(9, 5);
        oTraversal.insertInLinkedList(10, 6);
        oTraversal.insertInLinkedList(4, 0);
        oTraversal.traverseSinglyLinkedList();
    }
}
