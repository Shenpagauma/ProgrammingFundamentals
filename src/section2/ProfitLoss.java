package section2;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        int x, y, z;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of dozens of toys purchased\n ");
        x = input.nextInt();
        System.out.println("Enter the price per dozen \n");
        y = input.nextInt();
        System.out.println("Enter the selling price of 1 toy \n");
        z = input.nextInt();
        ProfitLoss profitLoss = new ProfitLoss();
        float profitPer = profitLoss.profitPercent(x, y, z);
        System.out.printf("Sam's profit percentage is %.2f percent", profitPer);
        input.close();

    }

    float profitPercent(int x, int y, int z) {
        float costPrice = (float) y / 12;
        float profit = (float) z - costPrice;
        float profitPercent = (profit / costPrice) * 100;
        return profitPercent;

    }

}
