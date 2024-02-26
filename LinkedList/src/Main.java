public class Main {
    public static void main(String[] args) {

        // Linked List Implementation
        LinkedList linkedList = new LinkedList();

        // linkedList methods
        linkedList.insert(6);
        linkedList.insert(12);
        linkedList.insert(18);
        linkedList.insertAtStart(25);
        linkedList.insertAt(2,26);
        linkedList.insertAt(0,78);
        linkedList.deleteAt(2);
        linkedList.show();
    }
}