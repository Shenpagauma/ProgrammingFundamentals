package section4;

import java.util.Scanner;

public class GenCDetails {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of GenCs");
        int gen = input.nextInt();
        Trainee[] emp = new Trainee[gen];
        for (int i = 0; i < gen; i++) {
            emp[i] = new Trainee();//memory creation
            System.out.println("Enter Employee Id");
            int empid = input.nextInt();
            emp[i].setEmployeeId(empid);
            System.out.println("Enter Name");           
            String empname = input.next();
            emp[i].setName(empname);
        }

        Trainee obj = new Trainee();
        obj.display(emp);
        input.close();

    }

}
