// Iterative method to search for a node with given data
public int searchKey(int data) {
    if (size == 0) {  // Special case: Linked List is empty
        return -1;
    }

    NODE temp = Head;    // Start from the head
    int pointer = 0;     // Keeps track of current index

    // Traverse the list until the end
    while (temp != null) {
        if (temp.data == data) {  // Data found
            return pointer;
        }
        temp = temp.next;         // Move to next node
        pointer++;                // Increment index
    }

    return -1; // Data not found
}

// Recursive method to search for a node with given data
public int recursiveSearch(int data, NODE Head) {
    NODE temp = Head;   // Current node

    if (temp == null) {
        return -1;  // Base case: reached end, data not found
    }

    if (temp.data == data) {
        return 0;   // Base case: data found at this node
    }

    // Recursive call on the next node
    int idx = recursiveSearch(data, temp.next);

    if (idx == -1) {
        return -1;  // Data not found in remaining list
    }

    return idx + 1; // Add 1 to index as recursion unwinds
}
