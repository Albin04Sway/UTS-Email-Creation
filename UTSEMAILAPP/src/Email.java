import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private String altnernateEmail;
    private int defaultpasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "uts.edu.au";
    
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    
    
        this.department = setDepartment();
    //Call a method for asking for the department - return the department

    this.password = randomPassword(defaultpasswordLength);
    System.out.println("Your password is: " + this.password);
    //Call a method that returns a random password

    if (department.equalsIgnoreCase("Staff")) {
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + companySuffix;
    } else {
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
    }
    //Combine Elements to generate email

    }
    //Constructor to recieve the first and lat name


    private String setDepartment(){
        System.out.println( "Welcome " + firstName.toUpperCase() + " "  + lastName.toUpperCase());

        Scanner sc = new Scanner(System.in);
        int depChoice = 0;
        String department = "";

        while (depChoice < 1 || depChoice > 3) {
            System.out.println("Please enter your department:");
            System.out.println("1 for Student");
            System.out.println("2 for Alumni");
            System.out.println("3 for Staff");
            
            // Check for valid input
            if (sc.hasNextInt()) {
                depChoice = sc.nextInt();
                switch (depChoice) {
                    case 1:
                        department = "Student";
                        break;
                    case 2:
                        department = "Alumni";
                        break;
                    case 3:
                        department = "Staff";
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } else {
                // Clear invalid input and prompt again
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // Discard the invalid input
            }
        }
        return department;
    }
    //Ask for the department

    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@%$";
        char[] password = new char[length];
        for(int i = 0; i < length; i++)
        {
          int rand = (int) (Math.random() * passwordSet.length());
          password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    //Generate password
    
    public void setMailboxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }
    //Set the mailbox capacity

    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
    //Set the alternate email

    public void changePassword(String password){
        this.password = password;
    }
    //Change the password

    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName +
            "\nCOMPANY NAME: " + email +
            "\nMAILBOX CAPACITY: " +  mailBoxCapacity + "mb";
    }
}
