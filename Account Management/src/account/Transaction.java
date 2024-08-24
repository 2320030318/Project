package account;
public class Transaction {
    private String transactionId;
    private String accountNumber;
    private double amount;
    private String type; // "deposit" or "withdrawal"

    public Transaction(String transactionId, String accountNumber, double amount, String type) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.type = type;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }
}
