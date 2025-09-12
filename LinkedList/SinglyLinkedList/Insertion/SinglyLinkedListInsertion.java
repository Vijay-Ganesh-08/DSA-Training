package LinkedList.SinglyLinkedList.Insertion;

public class SinglyLinkedListInsertion {

    public Node head;
    public Node tail;
    public int size;

    // Creation Method SinglyLinkedList
    public Node createSinglyLinkedList(int nodeValue) {

        head = new Node();                      // Time Complexity O(1)
        Node node = new Node();                 // Time Complexity O(1)
        node.next = null;                       // Time Complexity O(1)
        node.value = nodeValue;                 // Time Complexity O(1)
        head = node;                            // Time Complexity O(1)
        tail = node;                            // Time Complexity O(1)
        size = 1;                               // Time Complexity O(1)

        return head;
    }

    // Insertion Method SinglyLinkedList
    // Time Complexity O(N) Space Complexity O(1)
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();                 // Time Complexity O(1)
        node.value = nodeValue;                 // Time Complexity O(1)

        if (head == null) {                     // Time Complexity O(1)
            createSinglyLinkedList(nodeValue);  // Time Complexity O(1)
            return;
        } else if (location == 0) {             // Time Complexity O(1)
            node.next = head;                   // Time Complexity O(1)
            head = node;                        // Time Complexity O(1)
        } else if (location >= size) {          // Time Complexity O(1)
            node.next = null;                   // Time Complexity O(1)
            tail.next = node;                   // Time Complexity O(1)
            tail = node;                        // Time Complexity O(1)
        } else {
            Node tempNode = head;               // Time Complexity O(1)
            int index = 0;                      // Time Complexity O(1)
            while (index < location - 1) {      // Time Complexity O(N)
                tempNode = tempNode.next;       // Time Complexity O(1)
                index++;                        // Time Complexity O(1)
            }
            Node nextNode = tempNode.next;      // Time Complexity O(1)
            tempNode.next = node;               // Time Complexity O(1)
            node.next = nextNode;               // Time Complexity O(1)
        }
        size++;                                 // Time Complexity O(1)
    }

}