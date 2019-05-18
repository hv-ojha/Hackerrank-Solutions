import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        int i,h;
        String hr=new String();
        String s1=new String("");
        String a=new String(s.substring(8,10));
        h=Integer.parseInt(s.substring(0,2));
        if(a.equals("PM"))
        {
            if(h==12)
                hr=String.valueOf(h);
            else
            {
                h=h+12;
                hr=String.valueOf(h);
            }
            s1=hr+s.substring(2,8);
        }
        else if(a.equals("AM"))
        {
            if(h<10)
            {
                hr='0'+String.valueOf(h);
            }
            else
                hr=String.valueOf(h);
            if(h==12)
            {
                h=0;
                s1='0' + String.valueOf(h) + s.substring(2,8);
            }
            else
            {
                s1=hr+s.substring(2,8);
            }
        }
        return s1;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
