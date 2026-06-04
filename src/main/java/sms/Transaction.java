package sms;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Transaction {
    
    public enum Status {
        ACTIVE,
        COMPLETED,
        CANCELLED
    }
    private Customer customer;
    private List<TransactionItem> items;
    private LocalDate date;
    private Status status;
    private double totalAmount;
    
    // Constructor
    public Transaction(Customer customer, LocalDate date) {
        this.customer = customer;
        this.date = date;
        this.items = new ArrayList<>();
        status = Status.ACTIVE;
        this.totalAmount = 0;
    }

    
    // Getters

    public List<TransactionItem> getItems() {
        return items;
    }
    public LocalDate getDate() {
        return date;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
    //TODO 1: Add Function to add more TransactionItem into "items" list
    
    //TODO 2: Add functions to change order's status (ex: complete(), cancel())
}
    
