package JavaOutputFormatting;

import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.println(s1 + formattingString(s1) + formattingNumber(x));
        }
        System.out.println("================================");

    }

    public static String formattingNumber(int x) {
        return String.format("%03d", x);
    }

    public static String formattingString(String s1) {
        return String.format("%15s", s1).substring(0, 15-s1.length());
    }
}
