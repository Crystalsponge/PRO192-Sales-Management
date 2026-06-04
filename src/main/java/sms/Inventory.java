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
    //Add/delete feature
    //Customer
    public boolean addCustomer(Customer customer) {
        if(!utils.notNull(customer)) {
            System.out.println("Customer cannot be null!");
            return false;
        }
        customers.add(customer);
        return true;
    }
    public boolean deleteCustomer(Customer customer) {
        if(!utils.notNull(customer)) {
            System.out.println("Cannot delete null customer");
            return false;
        }
        String target = customer.getPhone();
        if (target == null) {
            System.out.println("Customer has empty phone number. Cannot delete");
            return false;
        }
        return customers.removeIf(c -> c.getPhone() != null && c.getPhone().equals(target));
    }
    public Customer getCustomerByPhone(String phone) {
        if(!utils.validatePhone(phone)) {return null;}
        
        for(Customer c : customers) {
            if(c.getPhone() != null && c.getPhone().equals(phone)) {return c;}
        }
        System.out.println("Customer not found.");
        return null;
    }
    public boolean customerExists(String p) {
        return getCustomerByPhone(p) != null;
    }
    //TODO: IDK WHAT TO SHOW YET -> LAZY TO DESIGN UI
    public void showAllCustomer() {
    }
    /*
    @param 
    */
    public boolean updateCustomer(String oldPhone, Customer updatedCustomer) {
        if(!utils.notNull(updatedCustomer)) return false;
        Customer existing = getCustomerByPhone(oldPhone);
        if (existing == null) return false;
        
        existing.setAddress(updatedCustomer.getAddress());
        existing.setName(updatedCustomer.getName());
        existing.setPhone(updatedCustomer.getPhone());
        
    }
    
    
}