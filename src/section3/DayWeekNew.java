package section3;

import java.util.Scanner;

public class DayWeekNew {
    public static void main(String[] args) {
        Scanner day = new Scanner(System.in);
        System.out.println("Enter the day number\n");
        int dayNumber = day.nextInt();
        String week[] = new String[7];
        week[0] = "Saturday";
        week[1] = "Monday";
        week[2] = "Tuesday";
        week[3] = "Wednesday";
        week[4] = "Thursday";
        week[5] = "Firday";
        week[6] = "Saturday";
        System.out.println("Day of the week is " + week[dayNumber - 1]);
        day.close();
    }

}
