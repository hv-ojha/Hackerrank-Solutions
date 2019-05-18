import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        if(A.compareTo(B)>0)
            System.out.println("Yes");
        else
            System.out.println("No");
        StringBuffer s=new StringBuffer();
        for(int i=0;i<A.length();i++)
        {
            if(i==0)
                s.append(Character.toUpperCase(A.charAt(i)));
            else
                s.append(Character.toLowerCase(A.charAt(i)));
        }
        s.append(' ');
        for(int i=0;i<B.length();i++)
        {
            if(i==0)
                s.append(Character.toUpperCase(B.charAt(i)));
            else
                s.append(Character.toLowerCase(B.charAt(i)));
        }
        System.out.println(s.toString());
    }
}



