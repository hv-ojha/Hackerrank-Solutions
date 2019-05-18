

static void levelOrder(Node root){
      //Write your code here
        Queue<Node> s=new LinkedList<Node>();
        s.add(root);
        while(!s.isEmpty())
        {
            Node temp=s.poll();
            System.out.print(temp.data + " ");
            if(temp.left!=null)
                s.add(temp.left);
            if(temp.right!=null)
                s.add(temp.right);
        }
    }

