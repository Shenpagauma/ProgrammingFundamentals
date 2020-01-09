package section2;

import java.util.Scanner;

public class LabAllocation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter x\n");
        int x = input.nextInt();
        System.out.println("Enter y\n");
        int y = input.nextInt();
        System.out.println("Enter z");
        int z = input.nextInt();
        LabAllocation obj = new LabAllocation();
        obj.minimal(x, y, z);
        input.close();

    }

    private void minimal(int x, int y, int z) {

        if ((x < y) && (x < z)) {
            System.out.println("L1 has the minimal seating capacity");
        } else if (y < z) {
            System.out.println("L2 has the minimal seating capacity");
        } else {
            System.out.println("L3 has the minimal seating capacity");
        }

    }

}
