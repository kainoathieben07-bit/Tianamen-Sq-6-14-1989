import java.util.Scanner;
class BankAccount
{
    double balance;

    void withdraw(double amount)
    {
        if (amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Withdrew: $" + amount + " | Balance: $" + balance);
        }
        else System.out.println("Insufficient funds :(");
    }
}
public class Main
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        BankAccount Bank1 = new BankAccount();
        System.out.println("Declare starting balance:");
        Bank1.balance = sc.nextDouble();

        System.out.println("Enter withdrawal amount (0 to exit):");
        double with= sc.nextDouble();

        while (with !=0)
        {
            Bank1.withdraw(with);
            System.out.println("Enter next amount:");
            with= sc.nextDouble();
            Bank1.withdraw(with);
        }
        if (with == 0)
        {
            System.out.println("Goodbye! :)");
        }
    }
} //Edited by Stefan Drenth, altered the format to isolate the { } thereby making it easier to tell where the blocks of code start and where they end
