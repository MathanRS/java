import java.text.DecimalFormat;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        DecimalFormat dc =new DecimalFormat("0.0");
        int input=0;
        boolean isValid =false;

        while (!isValid) {
            System.out.println("1. Savings Account\n2. Current Account");
            System.out.print("Enter your choice: ");
            input = sc.nextInt();
            if (input == 1 || input == 2) {
                isValid = true; // Exit the loop when 1 or 2 is entered
            }
            else {
                System.out.println("Invalid choice. Please enter 1 for Savings Account or 2 for Current Account.");
            }
        }

        System.out.print("Enter the Account Number");
        String accountNumber=sc.next();
        sc.nextLine();

        System.out.println("Enter Customer name:");
        String customerName =sc.nextLine();

        System.out.println("Enter the Balance amount:");
        double balance =sc.nextDouble();
        System.out.println("Enter the number of years");
        int noOfYears =sc.nextInt();

        System.out.println("Customer Name :"+customerName.toUpperCase());
        System.out.println("Account Number :"+accountNumber);
        System.out.println("Account Balance :"+balance);
        boolean isvalid =false;

        switch (input) {
            case 1:
                Savings obj = new Savings(accountNumber, customerName, balance);
                System.out.println("Maintance charge forcurrent Account :" + dc.format(obj.calculateMaintenanceCharge(noOfYears)));
                break;
            case 2:
                current c = new current(accountNumber, customerName, balance);
                System.out.println("Maintance charge forcurrent Account :" + dc.format(c.calculateMaintenanceCharge(noOfYears)));
                break;
        }
    }
}