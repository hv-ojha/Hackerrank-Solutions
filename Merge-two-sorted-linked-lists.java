

// Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode first=new SinglyLinkedListNode(0);
        SinglyLinkedListNode tail=first;
        while(true)
        {
            if(head1==null)
            {
                tail.next=head2;
                break;
            }
            if(head2==null)
            {
                tail.next=head1;
                break;
            }
            if(head1.data <= head2.data)
            {
                tail.next=head1;
                head1=head1.next;
            }
            else
            {
                tail.next=head2;
                head2=head2.next;
            }
            tail=tail.next;
        }
        return first.next;
    }

