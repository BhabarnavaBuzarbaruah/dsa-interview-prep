// Method to remove the nth node from the end of the Linked List
public void removeNthNODE(int n) {
    // Step 1: Calculate size of the Linked List
    int sz = 0;
    NODE temp = Head;
    while (temp != null) {
        temp = temp.next;
        sz++;
    }

    // Step 2: Handle special case - removing the first node
    if (n == sz) {
        Head = Head.next; // Simply move Head to the next node
        return;
    }

    // Step 3: Traverse to the (sz - n - 1)th node
    int i = 1;
    int iToFind = sz - n;
    NODE prev = Head;

    while (i < iToFind) {
        prev = prev.next;
        i++;
    }

    // Step 4: Remove nth node
    prev.next = prev.next.next;
}
