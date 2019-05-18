

    public static  Node insert(Node head,int data) {
        //Complete this method
        Node ne=new Node(data);
        if(head==null)
        {
            head=ne;
            return head;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=ne;
            return head;
        }
    }

