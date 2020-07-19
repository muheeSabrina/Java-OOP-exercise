package week3.exercises;

public class Account {
    public double credit,debit,balance;

    Account(double balance){
        this.balance =balance;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }
}
