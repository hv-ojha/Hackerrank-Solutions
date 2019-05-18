

    public static Node removeDuplicates(Node head) {
      //Write your code here
        Node temp=head;
        Node next=head;
        if(temp.next == null)
            return head;
        while(temp.next!=null && next!=null)
        {
            next=temp.next;
            if(temp.data == next.data)
                temp.next=next.next;
            else
                temp=temp.next;
        }
        return head;
    }

