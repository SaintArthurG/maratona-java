package godoy.arthur.maratonajava.Associacao.Test;
import godoy.arthur.maratonajava.Associacao.dominio.Account;

import java.util.Arrays;
import java.util.Scanner;
public class AccountTest {
    public static void main (String[] args) {
        Account account1 = new Account("Arthur", -15.00);
        Account account2 = new Account("Lia", 250.00);

        System.out.printf("%s balance: $%.2f %n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n",
                account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n",
                depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f %n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n",
                account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n",
                depositAmount);
        account2.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f %n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n",
                account2.getName(), account2.getBalance());
    }
}
