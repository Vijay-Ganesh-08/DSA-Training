package LinkedList.SinglyLinkedList.Creation;

//Time Complexity O(1)
public class SinglyLinkedListCreation {

    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue) {

        head = new Node();              // Time Complexity O(1)
        Node node = new Node();         // Time Complexity O(1)
        node.next = null;               // Time Complexity O(1)
        node.value = nodeValue;         // Time Complexity O(1)
        head = node;                    // Time Complexity O(1)
        tail = node;                    // Time Complexity O(1)
        size = 1;                       // Time Complexity O(1)

        return head;
    }

}
