package sms;
import java.util.List;
import java.util.ArrayList;

public class Inventory {
    private List<Product> products;
    private List<Transaction> transactions;
    private List<Customer> customers;
    
    // Constructor
    public Inventory() {
        this.products = new ArrayList<>();
        this.transactions = new ArrayList<>();
        this.customers = new ArrayList<>();
    }
    
    // Getters
    public List<Product> getProducts() {
        return products;
    }
    public List<Transaction> getTransactions() {
        return transactions;
    }
    public List<Customer> getCustomers() {
        return customers;
    }
    
    // Setters
    public void setProducts(List<Product> products) {
        if (products == null) {
            System.out.println("Products list cannot be null");
            return;
        }
        this.products = products;
    }
    public void setTransactions(List<Transaction> transactions) {
        if (transactions == null) {
            System.out.println("Transactions list cannot be null");
            return;
        }
        this.transactions = transactions;
    }
    public void setCustomers(List<Customer> customers) {
        if (customers == null) {
            System.out.println("Customers list cannot be null");
            return;
        }
        this.customers = customers;
    }
}