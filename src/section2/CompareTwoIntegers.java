package section2;

import java.util.Scanner;

public class CompareTwoIntegers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int x = input.nextInt();
        System.out.println("Enter the second number");
        int y = input.nextInt();
        if (x == y) {
            System.out.println(x + " is equals to " + y);
        } else if (x > y) {
            System.out.println(x + " is greater than " + y);
        } else {
            System.out.println(x + " is less than " + y);
        }
        input.close();

    }

}
