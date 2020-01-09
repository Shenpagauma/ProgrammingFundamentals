package section3;

import java.util.Scanner;

public class RedCross {

    public static void main(String[] args) {
    
        Scanner refugeeInput = new Scanner(System.in);
        int i, total = 0;
        int tents = refugeeInput.nextInt();
        int refugee[] = new int[tents];
        for (i = 0; i < tents; i++) {
            refugee[i] = refugeeInput.nextInt();
            total += refugee[i];
        }
        System.out.println(total);
        refugeeInput.close();
    }
}
