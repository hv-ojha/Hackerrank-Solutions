

    // Complete the removeDuplicates function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        SinglyLinkedListNode next=head.next;
        SinglyLinkedListNode temp=head;
        if(head.next==null)
            return head;
        while(temp.next!=null)
        {
            if(next.data==temp.data)
            {
                temp.next=next.next;
                next=temp.next;
                continue;
            }
            temp=temp.next;
            next=temp.next;
        }
        return head;
    }

