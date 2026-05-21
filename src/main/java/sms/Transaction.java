package sms;
import java.util.List;
import java.util.ArrayList;

public class Transaction {
    private String transactionId;
    private String customerId;       
    private List<TransactionItem> items;
    private String date;         
    private double totalAmount;
    
    // Constructor
    public Transaction(String transactionId, String customerId, String date) {
        this.transactionId = transactionId;
        this.customerId = customerId;
        this.date = date;
        this.items = new ArrayList<>();
        this.totalAmount = 0;
    }
    
    // Getters
    public String getTransactionId() {
        return transactionId;
    }
    public String getCustomerId() {
        return customerId;
    }
    public List<TransactionItem> getItems() {
        return items;
    }
    public String getDate() {
        return date;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
    
    // Setters
    public void setDate(String date) {
        if (date == null || date.trim().isEmpty()) {
            System.out.println("Date cannot be empty");
            return;
        }
        this.date = date;
    }
    public void setTotalAmount(double totalAmount) {
        if (totalAmount < 0) {
            System.out.println("Total amount cannot be negative");
            return;
        }
        this.totalAmount = totalAmount;
    }
}