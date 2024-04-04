package JavaLoops2;

import java.util.Scanner;

public class JavaLoops2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int somaTotal = a;

            for(int y = 0;y < n;y++) {

                somaTotal += (int) Math.pow(2, y) *b;
                System.out.print(somaTotal + " ");
            }
            System.out.println();
        }
        in.close();
    }

}
