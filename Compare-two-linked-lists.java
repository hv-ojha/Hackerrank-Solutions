

    // Complete the compareLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode temp1=head1;
        SinglyLinkedListNode temp2=head2;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.data!=temp2.data)
                return false;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        if(temp1!=null)
            return false;
        else if(temp2!=null)
            return false;
        return true;
    }

