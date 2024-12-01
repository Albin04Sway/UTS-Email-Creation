import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {

        System.out.println("Welcome to UTS email creation!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first name:");
        String firstName = sc.nextLine();

        System.out.println("Please enter your last name:");
        String lastName = sc.nextLine();

        Email em1 = new Email(firstName, lastName);
        System.out.println(em1.showInfo());
    }
    
}
