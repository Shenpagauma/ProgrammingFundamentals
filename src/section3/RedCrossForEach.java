package section3;

import java.util.Scanner;

public class RedCrossForEach {
    public static void main(String[] args) {
        int total = 0;
        Scanner scInput = new Scanner(System.in);
        int tents = scInput.nextInt();
        int tent[] = new int[tents];
        for (int i = 0; i < tents; i++) {
            tent[i] = scInput.nextInt();
        }
        for (int refugee : tent) {
            total += refugee;
        }
        System.out.println(total);
        scInput.close();
    }

}
