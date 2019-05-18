import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int n = sc.nextInt();
            boolean flag = false;
            if(n == 1)
            {
                System.out.println("Not prime");
                continue;
            }
            for(int i = 2; i*i <= n; i++)
            {
                if(n % i == 0)
                    flag = true;
            }
            if(flag == false)
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
        sc.close();
    }
}

