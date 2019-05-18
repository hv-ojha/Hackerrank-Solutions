

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        smallest = s.substring(0, k);
        largest = s.substring(0, k);
        String str=new String();
        for(int i = 0;i < s.length()-k+1;i++)
        {
            str=s.substring(i, i+k);
            if(str.compareTo(smallest)<0)
                smallest=str;
            if(str.compareTo(largest)>0)
                largest=str;
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

