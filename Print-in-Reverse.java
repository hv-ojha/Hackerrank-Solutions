

    // Complete the reversePrint function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void reversePrint(SinglyLinkedListNode head) {
        SinglyLinkedListNode temp=head;
        if(temp.next!=null)
            reversePrint(temp.next);
        System.out.println(temp.data);
    }

