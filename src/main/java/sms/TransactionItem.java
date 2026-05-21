package sms;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LEGION
 */

//This class is for storing product items inside a transaction
public class TransactionItem {
    private Product product;
    private int quantity;
    private double unitPrice;

    public TransactionItem(int quantity,Product product){
        setProduct(product);
        setQuantity(quantity);
        
        //tranh truong hop user quen input product
        if(product != null){
            this.unitPrice = product.getPrice();
            //tra lai gia tri product o class product
        }
    }

    //Total amount of a product
    public double getLineTotal(){
        return this.unitPrice * this.quantity;
    }

    //GETTER

    public Product getProduct(){
        return this.product;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public double getUnitPrice(){
        return this.unitPrice;
    }

    //SETTER 

    public void setProduct(Product product){
        if(product == null){
            System.out.println("The product is Invalid! (none)");
        }
        else{
            this.product = product;
        }
    }

    public void setQuantity(int quantity){
        if(quantity < 0){
            System.out.println("Quantity is Invalid! (<0)");
        }
        else{
            this.quantity = quantity;
        }
    }

    public void setUnitPrice(double unitPrice){
        if(unitPrice < 0){
            System.out.println("Unit price is Invalid! (<0)");
        }
        else{
            this.unitPrice = unitPrice;
        }
    }
    
}
