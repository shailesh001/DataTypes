

/**
 * Created by shailesh on 06/01/2017.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int i2;
        double d2;
        String s2;

        /* Read and save an integer, double, and String to your variables.*/
        i2 = scan.nextInt();
        d2 = scan.nextDouble();
        scan.nextLine(); // Otherwise the String Capture on the next line is skipped. This captures the new line char from nextDouble()
        s2 = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(Integer.toString(i + i2));

        /* Print the sum of the double variables on a new line. */
        System.out.println(Double.toString(d + d2));

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + s2);

        scan.close();
    }
}
