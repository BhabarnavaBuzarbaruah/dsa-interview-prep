// Method to rearrange Linked List in Zig-Zag fashion
public static void zigzag(NODE Head) {
    // Step 1: Find the middle node
    NODE mid = findMid(Head);

    // Step 2: Reverse the second half of the list
    NODE tempHead = mid.next;
    mid.next = null; // Split the list into two halves
    NODE rightHead = reverse(tempHead); // Reverse second half

    // Step 3: Merge both halves in zig-zag fashion
    NODE leftHead = Head;
    NODE nextLeft, nextRight;

    while (leftHead != null && rightHead != null) {
        nextLeft = leftHead.next;         // Save next left node
        leftHead.next = rightHead;        // Point left to right

        nextRight = rightHead.next;       // Save next right node
        rightHead.next = nextLeft;        // Point right to next left

        // Move pointers forward
        leftHead = nextLeft;
        rightHead = nextRight;
    }
}
