// Chain of Responsibility Design Pattern using abstract class

//Abstract class
abstract class Account {

    protected Account successor;
    protected double balance;

    public void setNext(Account account) {
        this.successor = account;
    }

    public void pay(double amountToPay) {
        if (canPay(amountToPay)) {
            System.out.printf("Paid %s using %s%n",
                    amountToPay, this.getClass().getSimpleName());
        } else if (successor != null) {
            System.out.printf("Can't pay using %s. Processing...%n",
                    this.getClass().getSimpleName()
            );
            successor.pay(amountToPay);
        } else {
            throw new RuntimeException("None of the accounts have enough balance.");
        }
    }

    public boolean canPay(double amount) {
        return this.balance >= amount;
    }
}

//Concrete classes
class Bank extends Account {

    public Bank(double balance) {
        this.balance = balance;
    }
}

class Paypal extends Account {

    public Paypal(double balance) {
        this.balance = balance;
    }
}

class Bitcoin extends Account {

    public Bitcoin(double balance) {
        this.balance = balance;
    }
}

public class ChainOfResponsibilityDemo1 {

    public static void main(String[] args) {
        // Create instances of the different account types
        Bank bank = new Bank(100);
        Paypal paypal = new Paypal(200);
        Bitcoin bitcoin = new Bitcoin(300);

        bank.setNext(paypal);
        paypal.setNext((bitcoin));

        // Let's try to pay 259
        bank.pay(259);
    }
}
