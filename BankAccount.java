import java.util.Random;
import java.util.Scanner;
public class BankAccount {
    private int accountNumber= 0000000;
    public String name;
    public String email;
    public int phoneNumber = 0000000000;
    Scanner scanner = new Scanner(System.in);
    Random ramdom = new Random();

    public void accountNumber(){
    if (name + email + phoneNumber != null){
        this.accountNumber = accountNumber + ramdom.nextInt(ramdom.nextInt(10000000));
        System.out.println("Account Number: " + accountNumber);
     }
    }

    public void Information(){
    System.out.println("Enter your name: " );
    name = scanner.nextLine();
    System.out.println("Enter your email: " );
    email = scanner.nextLine();
    System.out.println("Enter your phone number: " );
    phoneNumber = scanner.nextInt();
    System.out.println("Name: " + name + "\nEmail: " + email + "\nPhone Number: " + phoneNumber);
    if (name.isEmpty() && email.isEmpty() && phoneNumber != 0    ){
        System.out.println("Your information has been saved") ;
        accountNumber();
     }
    }
}
