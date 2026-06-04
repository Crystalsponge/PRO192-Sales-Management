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

    private String name;
    private String phone;
    private String address;
    private double totalPurchase;

    //Constructor - go through setters so data is validated on creation
    public Customer(String name, String phone, String address) {
        setName(name);
        setPhone(phone);
        setAddress(address);
        this.totalPurchase = 0;
    }

    //Setter

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()) {
            System.out.println("Name cannot be empty");
            return;
        }
        this.name = name;
    }
    public void setPhone(String phone) {
        // Use the shared validation rule so Customer and utils stay consistent
        if (!utils.validatePhone(phone)) {
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
    // I/O removed: the menu reads the amount and passes it in
    public void addTotalPurchase(double amount) {
        if (amount < 0) {
            System.out.println("Amount cannot be less than 0");
            return;
        }
        this.totalPurchase += amount;
    }
    public void reduceTotalPurchase(double amount) {
        if (amount < 0) {
            System.out.println("Amount cannot be less than 0");
            return;
        }
        if (this.totalPurchase - amount < 0) {
            System.out.println("Total purchase cannot go below 0");
            return;
        }
        this.totalPurchase -= amount;
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
