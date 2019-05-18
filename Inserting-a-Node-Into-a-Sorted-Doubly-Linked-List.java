

    // Complete the sortedInsert function below.

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
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode prev=head;
        DoublyLinkedListNode tmp=head;
        DoublyLinkedListNode n=new DoublyLinkedListNode(data);
        if(n.data<tmp.data)
        {
            tmp.prev=n;
            n.next=tmp;
            head=n;
            return n;
        }
        if(n.data>=tmp.data && n.data<=tmp.next.data)
        {
            prev=tmp.next;
            n.next=prev;
            n.prev=tmp;
            tmp.next=n;
            prev.prev=n;
            return head;
        }
        tmp=tmp.next;
        while(tmp.next!=null)
        {
            if(tmp.data>=n.data)
            {
                n.prev=prev;
                n.next=tmp;
                prev.next=n;
                tmp.prev=n;
                return head;
            }
            prev=tmp;
            tmp=tmp.next;
        }
        if(tmp.data>=n.data)
        {
           n.prev=prev;
            n.next=tmp;
            prev.next=n;
            tmp.prev=n;
            return head; 
        }
        tmp.next=n;
        n.prev=tmp;
        return head;
    }

