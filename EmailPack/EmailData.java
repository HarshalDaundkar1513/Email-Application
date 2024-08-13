// Your application should do the following:
// Generate an email with the following syntax: firstname.lastname@department.company.com
// Determine the department (sales, development, accounting), if none leave blank
// Generate a random String for a password
// Have set methods to change the password, set the mailbox capacity, and define an alternate email address
// Have get methods to display the name, email, and mailbox capacity

package EmailPack;

import java.util.*;

public class EmailData {
    String firstname, lastname, department, password, UserEmail, AlternateEmail;
    String CompanyName = "abc.com";
    int ch, passlength = 8, mailcapcity = 100;

    Scanner input = new Scanner(System.in);

    // Function for accepting user Name , Lastname
    public void accept() {
        System.out.println("Enter First Name : ");
        firstname = input.next();
        System.out.println("Enter Last Name : ");
        lastname = input.next();

    }

    // Function for Displaying details
    public void display() {
        // Combining mail id
        UserEmail = firstname + lastname + "@" + department + "." + CompanyName;
        AlternateEmail = lastname + firstname + "@" + department + "." + CompanyName;
        System.out.println("Dear " + firstname + " your Email is : " + UserEmail);
        System.out.println("Alternative Email is : " + AlternateEmail);
        System.out.println(firstname + "'s Password is : " + password);

    }

    public int CheckForChangingPass() {
        int passcheck;
        System.out.println("If you want to change password Enter : 1 Else: 2");
        passcheck = input.nextInt();
        return passcheck;
    }

    public void ChangePass() {
        int checkPass = CheckForChangingPass();
        if (checkPass == 1) {
            System.out.println("Enter new password");
            password = input.next();
        }

    }

    // Function for accepting user department using switch

    public String department() {

        System.out
                .println("Please select your Department from This 3 \n1.Sales\n2.Developement\n3.Accounting\n4.Other");
        ch = input.nextInt();
        switch (ch) {
            case 1:
                department = "sales";
                break;
            case 2:
                department = "developement";
                break;
            case 3:
                department = "accounting";
                break;
            default:
                department = "";
                break;
        }
        return department;
    }

    public void createPass() {
        password = generateRandomPassword(passlength);
    }

    // random password generator
    public static String generateRandomPassword(int length) {
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*()-_+=<>?";
        String combinedChars = upperCaseLetters + lowerCaseLetters + numbers + specialCharacters;
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            password.append(combinedChars.charAt(random.nextInt(combinedChars.length())));
        }

        return password.toString();
    }

}