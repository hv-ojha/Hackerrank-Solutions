

    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode temp=head;
        SinglyLinkedListNode n=new SinglyLinkedListNode(data);
        if(temp==null)
        {
            head=n;
            return head;
        }
        while(temp.next!=null)
            temp=temp.next;
        temp.next=n;
        return head;
    }

