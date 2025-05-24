// Method to find the middle node of the Linked List
public NODE findMid(NODE Head) {
    NODE slow = Head;  // Moves one step at a time
    NODE fast = Head;  // Moves two steps at a time

    // When fast reaches end, slow will be at mid
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    return slow; // Middle node
}
// Method to check if the Linked List is a palindrome
public boolean isPalindrome() {
    // Special cases: empty list or single node list
    if (Head == null || Head.next == null) {
        return true;
    }

    NODE temp = Head;

    // Step 1: Find the middle of the list
    NODE mid = findMid(temp);

    // Step 2: Reverse the second half of the list
    NODE curr = mid;
    NODE prev = null;
    NODE next;

    while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    // Step 3: Compare the first half and the reversed second half
    NODE left = Head;
    NODE right = prev;  // Head of reversed second half

    while (right != null) {
        if (left.data != right.data) {
            return false;  // Mismatch found
        }
        left = left.next;
        right = right.next;
    }

    return true;  // All matched, it's a palindrome
}
