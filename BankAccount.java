import java.util.ArrayList;
public class BankAccount {

    String owner;
    double balance;
    ArrayList<Transaction> transactions;

    public BankAccount(String owner, double startBalance) {
        this.owner = owner;
        this.balance = startBalance;
        this.transactions = new ArrayList<>();

        transactions.add(new Transaction("deposit", startBalance));

    }

    public void deposit(double amount){
        if (amount > 0) {
            balance = balance + amount;
            transactions.add(new Transaction("deposit", amount));
            System.out.println("Indsatte " + amount + " Kr");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            transactions.add(new Transaction("withdraw", amount));
            System.out.println("Withdraw " + amount + " kr");
        } else if (amount > balance) {
            System.out.println("Not enough");
        }
    }

    public void printTransactionHistory() {
        System.out.println("=== Transaktionshistorik for " + owner + " ===");
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }

    public double getBalance(){
        return balance;
    }
}
