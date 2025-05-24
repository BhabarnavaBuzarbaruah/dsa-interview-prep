// Method to reverse the Linked List
public void reverse() { // Time Complexity: O(n)
    NODE prev = null;              // Previous node (initially null)
    NODE curr = Tail = Head;       // Current node (starting at Head)
    NODE next;                     // Temporary node to hold next reference

    // Traverse through the list and reverse links
    while (curr != null) {
        next = curr.next;          // Save next node
        curr.next = prev;          // Reverse the link
        prev = curr;               // Move prev forward
        curr = next;               // Move curr forward
    }

    Head = prev; // Set new Head
}
