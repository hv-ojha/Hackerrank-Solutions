import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat usd=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat chd = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat frd = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat in = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        // Write your code here.
        String us=usd.format(payment);
        String india = in.format(payment);
        String china = chd.format(payment);
        String france = frd.format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

