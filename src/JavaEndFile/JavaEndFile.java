package JavaEndFile;

import java.util.Scanner;

public class JavaEndFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileString = "";
        sc.nextLine();
        int counter = 1;
        while (sc.hasNextLine()) {
            fileString += counter + " " + sc.next();
            counter++;
            if (sc.hasNextLine()) {
                fileString += "\n";
            }
        }
        System.out.println(fileString);
    }
}
