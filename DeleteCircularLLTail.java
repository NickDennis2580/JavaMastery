// Delete the tail node of a circular linked list

public ListNode deleteAtTail(ListNode head) {
    ListNode current = head;

    while(current.next.next != head)
        current = current.next;
    current.next = head;
    
    return head;
}
