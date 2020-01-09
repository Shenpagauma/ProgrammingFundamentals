package section3;

import java.util.Scanner;

public class ReplaceOrganization {

    public static void main(String[] args) {
        
        Scanner privateInput = new Scanner(System.in);
        System.out.println("Enter the content of the document");
        String content = privateInput.nextLine();
        System.out.println("Enter the old name of the company\n");
        String oldName = privateInput.next();
        System.out.println("Enter the new name of the company\n");
        String newName = privateInput.next();
        System.out.println("The content of the modified document is\n");
        System.out.println(content.replace(oldName, newName));
        privateInput.close();
    }
}
