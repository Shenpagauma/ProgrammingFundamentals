package section4;

import java.util.Scanner;

public class ProductDetail extends Product {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the product id\n");
        int id = input.nextInt();
        System.out.println("Enter the product name\n");
        String productName = input.next();
        System.out.println("Enter the supplier name\n");
        String supplierName = input.next();
        Product product = new Product();
        product.setId(id);
        product.setProductName(productName);
        product.setSupplierName(supplierName);
        System.out.println("Product Id is " + product.getId());
        System.out.println("Product Name is " + product.getProductName());
        System.out.println("Supplier Name is " + product.getSupplierName());
        input.close();

    }

}
