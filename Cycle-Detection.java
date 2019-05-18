

    // Complete the hasCycle function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean hasCycle(SinglyLinkedListNode head) {
        SinglyLinkedListNode temp=head;
        SinglyLinkedListNode next=head.next;
        while(temp!=null && next!=null && next.next!=null)
        {
            temp=temp.next;
            next=next.next.next;
            if(temp==next)
                return true;
        }
        return false;
    }

