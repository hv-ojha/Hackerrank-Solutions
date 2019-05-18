

    // Complete the getNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        SinglyLinkedListNode temp=head;
        int n=0;
        int data=0;
        while(temp.next!=null)
        {
            n++;
            temp=temp.next;
        }
        System.out.println("N Equals to " + n);
        if(positionFromTail==0)
        {
            System.out.println("Equals to 0");
            return temp.data;
        }
        if(positionFromTail==n)
        {
            System.out.println("Equals to " + n);
            return head.data;
        }
        int i=0;
        temp=head;
        while(positionFromTail!=(n-i) && temp.next!=null)
        {
            i++;
            temp=temp.next;
        }
        return temp.data;
    }

