
package sms;

import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class Inorganic extends Product {
    private LocalDate warrantyDate;
    
    //construcstor

    public Inorganic(String name, String category, double price, int stockQuantity, LocalDate warrantyDate) {
        super(name, category, price, stockQuantity);
        this.warrantyDate = warrantyDate;
    }
    //getter/setter

    public LocalDate getWarrantyDate() {
        return warrantyDate;
    }

    public void setWarrantyDate(LocalDate warrantyDate) {
        this.warrantyDate = warrantyDate;
    }
    
    //method
    @Override
    public String toString() {
        return String.format("%-20s %-20s %-10.2f %-16d %-15s",
                name, category, price, stockQuantity, warrantyDate);
    }
}
