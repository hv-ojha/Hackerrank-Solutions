

    // Complete the findMergeNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode tmp = head1;
        SinglyLinkedListNode tmp2 = head2;
        while(tmp != tmp2)
        {
            if(tmp.next == null)
                tmp=head2;
            else
                tmp=tmp.next;
            if(tmp2.next == null)
                tmp2=head1;
            else
                tmp2=tmp2.next;
        }
        return tmp2.data;
    }

