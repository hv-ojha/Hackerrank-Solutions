

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] a1 = a.toLowerCase().toCharArray();
        char[] b1 = b.toLowerCase().toCharArray();
        char temp;
        if(a1.length!=b1.length)
            return false;
        int j=a1.length;
        for(int i=0;i<j;i++)
        {
            for(int k=i;k<j;k++)
            {
                if(a1[i]>a1[k])
                {
                    temp=a1[i];
                    a1[i]=a1[k];
                    a1[k]=temp;
                }
                if (b1[i] > b1[k]) {
                    temp = b1[i];
                    b1[i] = b1[k];
                    b1[k] = temp;
                }
            }
        }
        String s=new String(a1);
        String t=new String(b1);
        if(s.toLowerCase().compareToIgnoreCase(t.toLowerCase())==0)
            return true;
        else
            return false;
    }

