package JavaStringsIntroduction;

import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String lexicographically = "";

        if (A.compareTo(B) < 0) lexicographically = "Yes";
        else lexicographically = "No";

        String substringA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String substringB = B.substring(0, 1).toUpperCase() + B.substring(1);


        System.out.println(A.length() + B.length());
        System.out.println(lexicographically);
        System.out.println(substringA + " " + substringB);

    }
}
