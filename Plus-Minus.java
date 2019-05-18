import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int n=arr.length,i;
        double pos=0,nega=0,zero=0;
        double frac_pos,frac_neg,frac_zero;
        for(i=0;i<n;i++)
        {
            if(arr[i]>0)
                pos++;
            else if(arr[i]<0)
                nega++;
            else
                zero++;
        }
        frac_pos = pos/n;
        frac_neg=nega/n;
        frac_zero=zero/n;
        DecimalFormat df = new DecimalFormat("#.######");
        String format_neg = df.format(frac_neg);
        String format_pos = df.format(frac_pos);
        String format_zero = df.format(frac_zero);
        System.out.println(format_pos);
        System.out.println(format_neg);
        System.out.println(format_zero);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
