// Is a singly linked list even
public Boolean isListEven(ListNode head) {
    
    if(head == null)
        return true;
    
    Boolean even = false;
    
    while(head.next != null){
        head = head.next;
        even = !even;
    }
    
    return even;
}
