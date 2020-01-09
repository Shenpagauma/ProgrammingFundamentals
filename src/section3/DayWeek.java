package section3;

import java.util.Scanner;

public class DayWeek {

    public static void main(String[] args) {

        Scanner day = new Scanner(System.in);
        System.out.println("Enter the day number\n");
        int dayNumber = day.nextInt();
        String week[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
                "Saturday" };
        System.out.println("Day of the week is " + week[dayNumber - 1]);
        day.close();
    }

}
