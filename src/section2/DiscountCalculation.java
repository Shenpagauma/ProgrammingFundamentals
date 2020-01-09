package section2;

import java.util.Scanner;

public class DiscountCalculation {
    public static void main(String[] args) {
        float item1, item2;
        int discount;
        Scanner input = new Scanner(System.in);
        System.out.println("Price of item 1:\n ");
        item1 = input.nextFloat();
        System.out.println("Price of item 2:\n");
        item2 = input.nextFloat();
        System.out.println("Discount in percentage: \n");
        discount = input.nextInt();
        DiscountCalculation totalCal = new DiscountCalculation();
        float totalAmount = totalCal.calTotal(item1, item2);
        float discountAmount = totalCal.calDiscount(totalAmount, discount);
        float savedAmount = totalCal.calSaved(totalAmount, discountAmount);
        System.out.printf("Total amount : $%.2f \n", totalAmount);
        System.out.printf("Discounted amount : $%.2f \n", discountAmount);
        System.out.printf("Saved amount : $%.2f \n", savedAmount);
        input.close();
    }

    float calTotal(float item1, float item2) {
        float totalAmount = item1 + item2;
        return totalAmount;
    }

    float calDiscount(float totalAmount, int discount) {
        float discountPer = totalAmount * discount / 100;
        float discountAmount = totalAmount - discountPer;
        return discountAmount;
    }

    float calSaved(float totalAmount, float discountAmount) {
        float savedAmount = totalAmount - discountAmount;
        return savedAmount;
    }
}
