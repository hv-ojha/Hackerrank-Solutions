

    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        SinglyLinkedListNode first=head;
        SinglyLinkedListNode prev=null;
        SinglyLinkedListNode next=null;
        while(first!=null)
        {
            next=first.next;
            first.next=prev;

            prev=first;
            first=next;
        }
        return prev;
    }

