package JavaBigDecimal;

import java.math.BigDecimal;
import java.util.Scanner;

public class JavaBigDecimal {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here

        String[] numberArray = new String[n];
        for (int i = 0; i < n; i++) {
            numberArray[i] = new String(s[i]);
        }

        for (int i = 1; i < n; i++) {
            String key = numberArray[i];
            int j = i - 1;
            while (j >= 0 && new BigDecimal(numberArray[j]).compareTo(new BigDecimal(key)) < 0) {
                numberArray[j + 1] = numberArray[j];
                j = j - 1;
            }
            numberArray[j + 1] = key;
        }

        for (int i = 0; i < n; i++) {
            s[i] = numberArray[i];
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
