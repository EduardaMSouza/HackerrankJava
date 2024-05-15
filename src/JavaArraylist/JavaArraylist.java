package JavaArraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0 ; i < n ; i++) {
            list.add(new ArrayList<>());
            String[] strings = sc.nextLine().split(" ");
            for (int j = 1; j <= Integer.parseInt(strings[0]); j++) {
                list.get(i).add(Integer.parseInt(strings[j]));
            }
        }

        int q = sc.nextInt();
        sc.nextLine();

        String[] queries = new String[q];
        for (int i = 0; i < q; i++) {
             queries[i] = sc.nextLine();
        }

        for (String query : queries) {
            String[] split = query.split(" ");
            if (list.get(Integer.parseInt(split[0])-1).size() > Integer.parseInt(split[1])-1) {
                System.out.println(list.get(Integer.parseInt(split[0])-1).get(Integer.parseInt(split[1])-1));
            }else {
                System.out.println("ERROR!");
            }
        }

        sc.close();
    }
}
