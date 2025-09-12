package LinkedList.SinglyLinkedList.Creation;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedListCreation oCreation = new SinglyLinkedListCreation();
        oCreation.createSinglyLinkedList(10);
        System.out.println(oCreation.head.value);
    }

}
