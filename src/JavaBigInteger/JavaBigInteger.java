package JavaBigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sa = sc.nextLine();
        String sb = sc.nextLine();

        BigInteger a = new BigInteger(sa);
        BigInteger b = new BigInteger(sb);

        BigInteger sum = a.add(b);
        BigInteger multiply = a.multiply(b);

        System.out.println(sum);
        System.out.println(multiply);
    }
}
