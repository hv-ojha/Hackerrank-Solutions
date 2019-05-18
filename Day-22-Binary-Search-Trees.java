

	public static int getHeight(Node root){
      //Write your code here
        if(root==null)
            return -1;
        else
        {
            int l=getHeight(root.left);
            int r=getHeight(root.right);
            if(l>r)
                return l+1;
            else
                return r+1;
        }
    }

