// Merge Sort on Linked List - Time Complexity: O(n log n)
public static NODE MergeSort(NODE Head) {
    // Base case: if the list is empty or contains a single node
    if (Head == null || Head.next == null) {
        return Head;
    }

    // Step 1: Find the middle of the list
    NODE mid = findMid(Head);
    NODE rightHead = mid.next; // Start of the right half
    mid.next = null;           // Break the list into two halves

    // Step 2: Sort both halves recursively
    NODE newLeft = MergeSort(Head);       // Sort left half
    NODE newRight = MergeSort(rightHead); // Sort right half

    // Step 3: Merge the two sorted halves
    return merge(newLeft, newRight);
}
java
Copy
Edit
// Helper method to merge two sorted linked lists
private static NODE merge(NODE Head1, NODE Head2) {
    // Dummy node to simplify merging logic
    NODE mergeLL = new NODE(-1);
    NODE temp = mergeLL;

    // Compare elements from both lists and build merged list
    while (Head1 != null && Head2 != null) {
        if (Head1.data <= Head2.data) {
            temp.next = Head1;
            Head1 = Head1.next;
        } else {
            temp.next = Head2;
            Head2 = Head2.next;
        }
        temp = temp.next;
    }

    // Append remaining nodes from Head1 or Head2
    while (Head1 != null) {
        temp.next = Head1;
        Head1 = Head1.next;
        temp = temp.next;
    }

    while (Head2 != null) {
        temp.next = Head2;
        Head2 = Head2.next;
        temp = temp.next;
    }

    return mergeLL.next; // Return head of the merged list (skip dummy node)
}
