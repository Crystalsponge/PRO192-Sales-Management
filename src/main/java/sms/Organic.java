
package sms;

import java.time.LocalDate;
/**
 *
 * @author Admin
 */
public class Organic extends Product {
    //field
    //thêm ngày nhập sản phẩm
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
    
    //method organic
    @Override
    public String toString() {
        return String.format("%s %-15s", super.toString(),
                expireDate);
    }
    
    
}
