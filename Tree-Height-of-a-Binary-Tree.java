

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
      	// Write your code here.
        if(root==null)
            return -1;
        int l=height(root.left);
        int r=height(root.right);
        if(l>r)
            return l+1;
        else
            return r+1;
    }

