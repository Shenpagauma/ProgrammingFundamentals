package section4;

import java.util.Scanner;

public class ProfitLossMethods {

    public static void main(String[] args) {
        
        int x, y, z;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of dozens of toys purchased\n ");
        x = input.nextInt();
        System.out.println("Enter the price per dozen \n");
        y = input.nextInt();
        System.out.println("Enter the selling price of 1 toy \n");
        z = input.nextInt();
        ProfitLossMethods profitLoss = new ProfitLossMethods();
        float profitPer = profitLoss.calculateProfit(x, y, z);
        System.out.printf("Sam's profit percentage is %.2f percent", profitPer);
        input.close();

    }

    public float calculateProfit(int dozenCount, int pricePerDozen, int sellPrice) {
        float costPrice = (float) pricePerDozen / 12;
        float profit = (float) sellPrice - costPrice;
        float profitPercent = (profit / costPrice) * 100;
        return profitPercent;

    }

}
