
package sms;

import java.time.LocalDate;
/**
 *
 * @author Admin
 */
public class Organic extends Product {
    //field
    private LocalDate expireDate;
    
    //constructor

    public Organic(String name, String category, double price, int stockQuantity, LocalDate expireDate) {
        super(name, category, price, stockQuantity);
        this.expireDate = expireDate;
    }

    //getter/setter

    public LocalDate getExpireDate() {
        return expireDate; 
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }
    
    //method
    @Override
    public String toString() {
        return String.format("%-20s %-20s %-10.2f %-16d %-15s",
                name, category, price, stockQuantity,expireDate);
    }
    
    
}
