package section4;

import java.util.Scanner;

public class ProductDetailsCons {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the product id");
        int id = input.nextInt();
        System.out.println("Enter the product name");
        String productName = input.next();
        System.out.println("Enter the supplier name");
        String supplierName = input.next();
        ProductC product = new ProductC(id, productName, supplierName);
        product.display();
        input.close();
    }

}