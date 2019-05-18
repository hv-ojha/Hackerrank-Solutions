import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner r = new Scanner(System.in);
        int t = r.nextInt();
        for(int i=1;i<=t;i++)
        {
            String str = new String();
            str=r.next();
            for(int j=0;j<str.length();j+=2)
                System.out.print(str.charAt(j));
            System.out.print(" ");
            for(int j=1;j<str.length();j+=2)
                System.out.print(str.charAt(j));
            System.out.println();
        }
    }
}

