import java.util.Scanner;

public class APP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        bankAccount.Information();
        if (bankAccount.name != null && bankAccount.email != null && bankAccount.phoneNumber != 0){
            System.out.println("Welcome to the bank, " + bankAccount.name + "!");
            System.out.println("Your registered email is: " + bankAccount.email);
            System.out.println("Your registered phone number is: " + bankAccount.phoneNumber);
            scanner.close();
        }
    }
}
