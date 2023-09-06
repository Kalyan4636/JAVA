public class Main {
    public static void main(String[] args) {
        Account a1 = new Account(500);
        Account a2 = new Account();
        a2.setBalance(500);

        Account a3 = new Account(10000);

        System.out.println("a1 balance = " + a1.getBalance() + " a2 balance = " + a2.getBalance() + " a3 balance = " + a3.getBalance());
    }
}

class Account {
    private int balance;
    Account() {

        balance = 5000;
    }

    Account(int balance) {
        try {
            if(balance>=5000) {
                this.balance = balance;
                System.out.println("The account is created and the balance is set to: "+ balance);
            } else {
                this.balance=0;
                System.out.println("Account can not be created");
                throw new LowBalanceException();
            }
        } catch(LowBalanceException e) {
            System.out.println(e);
        }

    }

    void setBalance(int balance) {
        try {
            if(balance>=5000) {
                this.balance = balance;
                System.out.println("The account is created and the balance is set to: "+ balance);
            } else {
                this.balance=0;
                System.out.println("Account can not be created");
                throw new LowBalanceException();
            }

        } catch(LowBalanceException e) {
            System.out.println(e);
        }
    }

    int getBalance() {
        return balance;
    }
}
class LowBalanceException extends Exception {

    public String toString() {
        return "Low Balance: The balance cannot be less than Rs.5000/-";
    }
}
