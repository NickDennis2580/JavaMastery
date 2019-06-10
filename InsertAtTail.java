// Insert a node with data at tail
public ListNode insertAtTail(ListNode head, int data) {
  ListNode newNode = new ListNode(data);
  
  if(head == null)
    return newNode;
    
  ListNode current = head;
  
  while(current.next != null)
    current = current.next;
  current.next = newNode;
  
  return head;
}
