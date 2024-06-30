
import java.util.*;
import java.util.Scanner;

class ATM {
    float Balance;
    int PIN = 5678;

    public void cheakpin() {
        System.out.println("Enter your PIN; ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if (enteredpin == PIN) {
            menu();
        } else {
            System.out.println("Enter a valid pin");

        }

    }

    public void menu() {
        System.out.println("Enter your Choice");
        System.out.println("1. Cheak A/C balance ");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1) {
            cheakBalance();
        } else if (opt == 2) {
            withdrawMoney();
        } else if (opt == 3) {
            depositMoney();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("Enter a valid choice");
        }

    }

    public void cheakBalance() {
        System.out.println("Balance: " + Balance);
        menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter the amount you want to withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > Balance) {
            System.out.println("Insufficient balance");
        } else {
            Balance = Balance - amount;
            System.out.println("Money withdrawl successful");

        }
        menu();

    }

    public void depositMoney() {
        System.out.println("Enter the amount you want to deposit: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money deposited successfully");
        menu();

    }

}

public class ATMMacine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.cheakpin();

    }
}