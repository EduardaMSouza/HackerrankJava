package JavaSubarray;

import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int negativeSum = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int y = i; y < n; y++) {
                sum += arr[y];
                if (sum < 0) {
                    negativeSum++;
                }
            }

        }
        System.out.println(negativeSum);
}
}
