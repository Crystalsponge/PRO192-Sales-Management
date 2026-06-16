
package sms;

import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class Inorganic extends Product {
    //thêm ngày nhập sản phẩm
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
    
    //method inorganic
    @Override
    public String toString() {
        return String.format("%s %-15s", super.toString(),
                warrantyDate);
    }
}
