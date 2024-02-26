public class LinkedList {
    Node head;

    // creating our own LinkedList methods
    public void insert(int data){
        // 'insert' creates a new node
        Node node = new Node();

        // set node data to the inserted data
        node.data = data;

        // set the new node next pointer to null
        node.next = null;

        // if head of the Linked List does not exist
        if(head == null){
            // set the new node to the head of the linked list
            head = node;
        // if the head != null
        }else{
            // create a temp node variable equal to head
            Node n = head;
            // while the n.next pointer isn't null
            while(n.next!=null){
                // move to the next object in the Linked List
                n = n.next;
            }
            // if n.next is null insert the node
            n.next = node;
        }
    }

    public void show(){
        // print all the values of the linked list
        Node node = head;
        while(node.next != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void insertAtStart(int data){
        // change the head location from the current object to the new object
        // next will point to the previous head element

        // create a new node
        Node node = new Node();

        // set the new node data equal to the data being inserted
        node.data = data;

        // set the new node next pointer equal to the location of the previous head
        node.next = head;

        // set the head equal to the new node
        head = node;
    }

    public void insertAt(int index, int data){
        // inserting an object at a certain location

        // create a new node with the data being inserted
        Node node = new Node();
        node.data = data;
        node.next = null;

        // first check if the request index value is 0th location
        if(index == 0){
            // call previous method that sets a new head value
            insertAtStart(data);
         // to make sure index 0 doesn't get added twice
        } else{
            // set a temp variable to the current head of the linked list
            Node n = head;

            // travel through the linked list and find the correct index to insert the new node
            for(int i=0; i<index-1; i++){
                // set the head to the next node in the linked list
                n = n.next;
            }

            // set the new node next data to what the head next was pointing to
            node.next = n.next;

            // update the old head to the node being inserted
            n.next = node;
        }
    }

    public void deleteAt(int index){
        // change the pointer to the next next object

        // deleting the first element
        if(index == 0){
            // set the head node what the current head is pointing at
            head = head.next;
        }else{
            // deleting non first elements
            Node newHead = head;
            Node n1 = null;

            // traverse through the list
            for(int i=0; i<index-1; i++){
                newHead = newHead.next;
            }

            // assign a new variable to newHead.next;
            n1 = newHead.next;

            //newHead.next needs to be replaced by n1.next
            newHead.next = n1.next;
            n1 = null;
        }
    }
}
