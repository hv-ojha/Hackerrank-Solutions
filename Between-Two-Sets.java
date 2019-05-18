import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the getTotalX function below.
     */
    static int getTotalX(int[] a, int[] b) {
        /*
         * Write your code here.
         */
        int tot=0;
        int len=b.length;
        for(int i=a[0];i<=b[len-1];i++)
        {
            int flag = 0;
            for(int k=0;k<a.length;k++)
            {
                if(flag==1)
                    break;
                if(i%a[k]==0)
                    flag=0;
                else
                    flag=1;
            }
            if(flag==0)
            {
                for(int j=0;j<b.length;j++)
                {
                    if(flag==1)
                        break;
                    if(b[j]%i==0)
                        flag=0;
                    else
                        flag=1;
                }
            }
            if(flag==1)
                continue;
            else
                tot++;
        }
        return tot;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);

        bw.write(String.valueOf(total));
        bw.newLine();

        bw.close();
    }
}
