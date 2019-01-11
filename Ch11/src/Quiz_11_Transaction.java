import java.util.Date;

public class Quiz_11_Transaction {
    private java.util.Date date;
    private char type;
    private double amount;
    private double balance;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    Quiz_11_Transaction(){

    }

    Quiz_11_Transaction(char type, double amount, double balance, String description){
        this.balance = balance;
        this.amount = amount;
        this.type = type;
        this.description = description;
    }
}
