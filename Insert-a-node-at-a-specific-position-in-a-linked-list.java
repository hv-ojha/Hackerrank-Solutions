

    // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode temp=head;
        SinglyLinkedListNode prev=head;
        SinglyLinkedListNode n=new SinglyLinkedListNode(data);
        if(position==0)
        {
            n.next=head;
            head=n;
            return head;
        }
        int i=0;
        while(i!=position)
        {
            prev=temp;
            temp=temp.next;
            i++;
        }
        prev.next=n;
        n.next=temp;
        return head;
    }

