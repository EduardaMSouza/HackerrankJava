package JavaStringReverse;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int isPalindrome=0;

        for (int i = 0; i < A.length()/2; i++) {
            if (A.charAt(i) == A.charAt(A.length()-i-1)) {
                isPalindrome++;
            }
        }

        System.out.println(isPalindrome == A.length()/2 ? "YES" : "NO");
    }
}
