import java.util.Scanner;
public class ATM {
    private BankAccount account;
    private Scanner scanner;
    public ATM(BankAccount account) {
        this.account = account;
        scanner = new Scanner(System.in);
    }
    public void start() {
        int choice;
        do {
            System.out.println("\n========================");
            System.out.println("       ATM MENU");
            System.out.println("========================");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid choice.");
                scanner.next();
                System.out.print("Enter your choice: ");
            }
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Current Balance: $" + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Enter a valid amount.");
                        scanner.next();
                        System.out.print("Enter deposit amount: ");
                    }
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Enter a valid amount.");
                        scanner.next();
                        System.out.print("Enter withdrawal amount: ");
                    }
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
        scanner.close();
    }
}