

    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        DoublyLinkedListNode tmp=head;
        DoublyLinkedListNode temp=null;
        if(head.next==null)
            return head;
        while(tmp != null)
        {
            temp=tmp.prev;
            tmp.prev=tmp.next;
            tmp.next=temp;
            tmp=tmp.prev;
        }
        if(temp==null)
            return tmp;
        return temp.prev;
    }

