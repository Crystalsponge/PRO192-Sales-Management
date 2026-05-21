/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sms;

/**
 *
 * @author LEGION
 */
public class Customer {
    private static int counter = 0;
    private String customerID;
    private String name;
    private String phone;
    private String address;
    private double totalPurchase;
    
    //Constructor
    public Customer(String customerID, String name, String phone, String address) {
        this.customerID = "C" + String.format("%03d", ++counter);
        setName(name);
        setPhone(phone);
        setAddress(address);
        this.totalPurchase = 0;
    }

    //Get total value for the (a) product
    public double itemTotal(){
        return this.unitPrice * this.quantity;
    } 
    
    //Setter
    public static void setCounter(int lastIndex) {
        counter = lastIndex;
    }
    public void setName(String name) {
        if(name == null || name.trim().isEmpty()) {
            System.out.println("Name cannot be empty");
            return;
        }
        this.name = name;
    }
    public void setPhone(String phone) {
        if (phone == null || phone.trim().isEmpty()) {
        System.out.println("Phone cannot be empty");
        return;
        }
        if (!phone.matches("\\d{10,11}")) {
        System.out.println("Phone must contain 10-11 digits only");
        return;
        }
        this.phone = phone;
    }
    public void setAddress(String address) {
        if(address == null || address.trim().isEmpty()) {
            System.out.println("Address cannot be empty");
            return;
        }
        this.address = address;
    }
    public void setTotalPurchase(double totalPurchase) {
        if(totalPurchase < 0) {
            System.out.println("Total purchase cannot be negative");
            return;
        }
        this.totalPurchase = totalPurchase;
    }
    //Getter
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }
    public double getTotalPurchase() {
        return totalPurchase;
    }
    
}
