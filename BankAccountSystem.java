package Java_Task_3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccountSystem {
    public static void displayAccounts(List<Integer> accountNumbers,
                                       List<String> customerNames,
                                       List<Double> balances) {

        System.out.println("\n==== Account List ====");

        for (int i = 0; i < accountNumbers.size(); i++) {
            System.out.println("Account Number : " + accountNumbers.get(i));
            System.out.println("Customer Name  : " + customerNames.get(i));
            System.out.println("Balance        : $" + balances.get(i));
            System.out.println("----");
        }
    }

    public static void depositMoney(List<Integer> accountNumbers,
                                    List<Double> balances,
                                    int accountNumber,
                                    double amount) {

        for (int i = 0; i < accountNumbers.size(); i++) {

            if (accountNumbers.get(i) == accountNumber) {
                balances.set(i, balances.get(i) + amount);
                System.out.println("Deposit successful.");
                System.out.println("New Balance: $" + balances.get(i));
                return;
            }
        }

        System.out.println("Account not found.");
    }

    public static void withdrawMoney(List<Integer> accountNumbers,
                                     List<Double> balances,
                                     int accountNumber,
                                     double amount) {

        for (int i = 0; i < accountNumbers.size(); i++) {

            if (accountNumbers.get(i) == accountNumber) {

                if (balances.get(i) >= amount) {
                    balances.set(i, balances.get(i) - amount);
                    System.out.println("Withdrawal successful.");
                    System.out.println("Remaining Balance: $" + balances.get(i));
                } else {
                    System.out.println("Insufficient balance.");
                }

                return;
            }
        }

        System.out.println("Account not found.");
    }

    public static void checkBalance(List<Integer> accountNumbers,
                                    List<Double> balances,
                                    int accountNumber) {

        for (int i = 0; i < accountNumbers.size(); i++) {

            if (accountNumbers.get(i) == accountNumber) {
                System.out.println("Current Balance: $" + balances.get(i));
                return;
            }
        }

        System.out.println("Account not found.");
    }

    public static void calculateStatistics(List<Double> balances) {

        double totalMoney = 0;
        double highestBalance = balances.get(0);
        double lowestBalance = balances.get(0);
        int accountsAbove5000 = 0;

        for (double balance : balances) {

            totalMoney += balance;

            if (balance > highestBalance) {
                highestBalance = balance;
            }

            if (balance < lowestBalance) {
                lowestBalance = balance;
            }

            if (balance > 5000) {
                accountsAbove5000++;
            }
        }

        System.out.println("\n========== Account Statistics ==========");
        System.out.println("Total Money: $" + totalMoney);
        System.out.println("Highest Balance: $" + highestBalance);
        System.out.println("Lowest Balance: $" + lowestBalance);
        System.out.println("Accounts Above $5000: " + accountsAbove5000);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Integer> accountNumbers = new ArrayList<>();
        List<String> customerNames = new ArrayList<>();
        List<Double> balances = new ArrayList<>();

        accountNumbers.add(1001);
        customerNames.add("Ali");
        balances.add(5000.0);

        accountNumbers.add(1002);
        customerNames.add("Ahmed");
        balances.add(2500.0);

        accountNumbers.add(1003);
        customerNames.add("Sara");
        balances.add(7200.0);

        accountNumbers.add(1004);
        customerNames.add("Fatima");
        balances.add(3100.0);

        accountNumbers.add(1005);
        customerNames.add("Omar");
        balances.add(6800.0);

        accountNumbers.add(1006);
        customerNames.add("Mona");
        balances.add(1500.0);

        accountNumbers.add(1007);
        customerNames.add("Salim");
        balances.add(8900.0);

        accountNumbers.add(1008);
        customerNames.add("Noor");
        balances.add(4300.0);

        accountNumbers.add(1009);
        customerNames.add("Hassan");
        balances.add(9900.0);

        accountNumbers.add(1010);
        customerNames.add("Aisha");
        balances.add(2750.0);

        int choice;

        do {

            System.out.println("\n===== Bank Account System =====");
            System.out.println("1. Display All Accounts");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Account Balance");
            System.out.println("5. Display Account Statistics");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    displayAccounts(accountNumbers, customerNames, balances);
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    int depositAccount = input.nextInt();
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = input.nextDouble();
                    depositMoney(accountNumbers, balances, depositAccount, depositAmount);
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int withdrawAccount = input.nextInt();
                    System.out.print("Enter Withdrawal Amount: ");
                    double withdrawAmount = input.nextDouble();
                    withdrawMoney(accountNumbers, balances, withdrawAccount, withdrawAmount);
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    int balanceAccount = input.nextInt();
                    checkBalance(accountNumbers, balances, balanceAccount);
                    break;

                case 5:
                    calculateStatistics(balances);
                    break;

                case 6:
                    System.out.println("Thank you for using the Bank Account System.");
                    break;

                default:
                    System.out.println("Invalid choice.  Please try again.");
            }

        } while (choice != 6);

        input.close();
    }

}
