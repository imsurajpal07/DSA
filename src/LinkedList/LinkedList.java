package LinkedList;

public class LinkedList {

    Node head;

    public void insertAtStart(int num) {
        Node currNode = new Node(num);

        currNode.next = head;
        head = currNode;
    }

    public void insert(int data, int pos) {
        Node node = new Node(data);
        Node currNode = head;
        int currPos = 2;
        if (pos == 1) {
            insertAtStart(data);
            return;
        }
        while (currNode.next != null) {
            if (currPos == pos) {
                node.next = currNode.next;
                currNode.next = node;
            }
            currNode = currNode.next;
            currPos += 1;
        }
        if (currPos == pos) {
            insertAtEnd(data);
        }
    }

    public void insertAtEnd(int data) {
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = new Node(data);
    }

    public void deleteAtPos(int pos) {
        Node currNode = head;
        int currPoss = 2;
        while (currNode.next != null) {
            if (pos == currPoss) {
                currNode.next = currNode.next.next;
            }
            currPoss += 1;
            currNode = currNode.next;
        }
    }

    public void deleteAtStart() {
        head = head.next;
    }

    public void deleteAtEnd() {
        Node currNode = head;
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }
        currNode.next = null;
    }

    public void printLinkedList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + (currNode.next != null ? "-> " : "-> null"));
            currNode = currNode.next;
        }
        System.out.println();
    }
}
