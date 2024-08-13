
// Your application should do the following:
// Generate an email with the following syntax: firstname.lastname@department.company.com
// Determine the department (sales, development, accounting), if none leave blank
// Generate a random String for a password
// Have set methods to change the password, set the mailbox capacity, and define an alternate email address
// Have get methods to display the name, email, and mailbox capacity
import EmailPack.EmailData;

public class app {
    public static void main(String[] args) {
        EmailData D1 = new EmailData();

        D1.accept();
        D1.department();
        D1.createPass();
        D1.ChangePass();
        D1.display();
    }
}
