// Deletes the head of a circular linked list


public ListNode deleteAtHead(ListNode head) {

    if(head == null)
        return null;
                
    ListNode temp = head.next;
    ListNode newHead = head.next;

    head.next = null;
    
    if(temp.next == null)
        return null;
    
    while(temp.next.next != null)
        temp = temp.next;

    temp.next = newHead;
    
    return newHead;

    
}
