/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sms;

/**
 *
 * @author LEGION
 */
public final class Product {

    //Fields

    private String name;
    private String category;
    private double price;
    private int stockQuantity;
    
    //Constructor
    Product(String name, String category, double price, int stockQuantity) {

        this.name = name;
        this.category = category;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
    
    //Setter

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()) {
            System.out.println("Name cannot be empty");
            return;
        }
        this.name = name;
    }
    public void setCategory(String category) {
        if(category == null || category.trim().isEmpty()) {
            System.out.println("Category cannot be empty");
            return;
        }
        this.category = category;
    }
    public void setPrice(double price) {
        if(price < 0) {
            System.out.println("Price cannot be negative");
            return;
        }
        this.price = price;
    }
    public void setStock(int stockQuantity) {
        if(stockQuantity < 0) {
            System.out.println("Stock quantity cannot be negative");
            return;
        }
        this.stockQuantity = stockQuantity;
    }
    //Getter
    public String getName() {
        return name;
    }
    public String getCategory() {
        return category;
    }
    public double getPrice() {
        return price;
    }
    public int getStock() {
        return stockQuantity;
    }
    
}
