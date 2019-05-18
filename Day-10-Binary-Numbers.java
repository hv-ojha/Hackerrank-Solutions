import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        Stack<Integer> s=new Stack<Integer>();
        int count=0,max=0,i;
        i=n;
        while(i>0)
        {
            s.push(i%2);
            i=i/2;
        }
        while(!s.isEmpty())
        {
            if(s.peek()==0)
                count=0;
            else
                count++;
            if(max<=count)
                max=count;
            s.pop();
        }
        System.out.println(max);
    }
}
