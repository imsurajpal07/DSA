package LinkedList;

public class LinkedListRunner {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtStart(10);
        list.insertAtStart(20);
        list.insertAtStart(30);
        list.printLinkedList();
        list.insert(15,1);
        list.insert(56,2);
        list.insert(45,6);
        list.printLinkedList();
        list.insertAtEnd(23);
        list.printLinkedList();
        list.deleteAtPos(4);
        list.printLinkedList();
        list.deleteAtEnd();
        list.printLinkedList();
        list.deleteAtStart();
        list.printLinkedList();
    }
}
