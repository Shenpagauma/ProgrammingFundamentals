package section3;

import java.util.Scanner;

public class SecureUrl {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string\n");
        String url = input.next();
        System.out.println("Enter the start string\n");
        String startString = input.next();
        if (url.startsWith(startString)) {
            System.out.println("\"" + url + "\" starts with \"" +startString+"\"");

        } else {
            System.out.println("\"" + url + "\" does not starts with \"" +startString+"\"");
        }
        input.close();
    }

}
