package HomeWork08;

public class HomeWork08 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000);
        checkingAccount.deposit(10);
//        checkingAccount.withDraw(9);
        System.out.println(checkingAccount.getBalance());
    }
}

class BankAccount {
    private double balance;//余额

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    //存款
    public void deposit(double amount) {
        balance += amount;
    }

    //取款
    public void withDraw(double amount) {
        balance -= amount;
    }
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);
    }

    @Override
    public void withDraw(double amount) {
        super.withDraw(amount + 1);
    }
}

class SavingAccount extends BankAccount {
    private int count = 3;
    private double rate = 0.01;

    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void deposit(double amount) {
        if (count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
        count--;
    }

    @Override
    public void withDraw(double amount) {
        if (count > 0) {
            super.withDraw(amount);
        } else {
            super.withDraw(amount + 1);
        }
    }
    public void earnMonthlyInterest(){
        count=3;
        super.deposit(getBalance()*rate);
    }
}