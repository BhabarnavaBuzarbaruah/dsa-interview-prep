// Java Program to Implement a Singly Linked List

public class LinkedList {

    // Node class represents each element in the Linked List
    public static class NODE {
        int data;       // Stores data
        NODE next;      // Points to the next node

        // Constructor to create a new node and increment the size
        public NODE(int data) {
            this.data = data;
            this.next = null;
            size++; // Size is increased every time a new node is created
        }
    }

    // Head and Tail are references to the first and last node in the Linked List
    public static NODE Head;
    public static NODE Tail;

    // Tracks the number of elements in the Linked List
    public static int size;

    // Method to add a node at the beginning of the list
    public void addFirst(int data) {
        NODE newNODE = new NODE(data); // Create a new node
        if (Head == null) {            // If the list is empty
            Head = Tail = newNODE;
            return;
        }
        newNODE.next = Head;           // Point new node to current Head
        Head = newNODE;                // Update Head to new node
    }

    // Method to print all elements in the Linked List
    public void printList() {
        if (Head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        NODE current = Head;           // Temporary node to traverse the list
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to add a node at the end of the list
    public void addLast(int data) {
        NODE newNODE = new NODE(data); // Create a new node
        if (Head == null) {            // If list is empty
            Head = Tail = newNODE;
            return;
        }
        Tail.next = newNODE;           // Link last node to new node
        Tail = newNODE;                // Update Tail reference
    }

    // Method to add a node at a specific index
    public void add(int index, int data) {
        if (index == 0) {              // Insert at beginning
            addFirst(data);
            return;
        }

        NODE newNODE = new NODE(data); // New node to be inserted
        int pointer = 0;               // Tracks current index
        NODE temp = Head;              // Start from head

        // Traverse to the node before the desired position
        while (pointer < index - 1) {
            temp = temp.next;
            pointer++;
        }

        // Insert node at the index
        newNODE.next = temp.next;
        temp.next = newNODE;
    }

    // Method to remove the first node
    public void removeFirst() {
        if (Head == null) {            // If list is empty, do nothing
            return;
        } else if (size == 1) {        // If only one node is present
            Head = Tail = null;
            size--;
            return;
        }
        Head = Head.next;              // Move Head to the next node
        size--;
    }

    // Method to remove the last node
    public void removeLast() {
        if (Head == null) {            // Empty list
            return;
        } else if (size == 1) {        // Only one node
            Head = Tail = null;
            size--;
            return;
        }

        NODE temp = Head;
        // Traverse till the second-last node
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }

        temp.next = null;              // Remove reference to last node
        Tail = temp;                   // Update Tail
        size--;
    }
}
