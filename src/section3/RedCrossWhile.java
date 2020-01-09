package section3;

import java.util.Scanner;

public class RedCrossWhile {
    public static void main(String[] args) {
     
        int i = 0, total = 0;
        Scanner scInput = new Scanner(System.in);
        int tents = scInput.nextInt();
        int tent[] = new int[tents];
        while (i < tents) {
            int refugee = scInput.nextInt();
            tent[i] = refugee;
            total += tent[i];
            i++;
        }
        System.out.println(total);
        scInput.close();

    }

}
