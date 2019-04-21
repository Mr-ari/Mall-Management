/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author ari
 */
public class Product {
    private final int product_id;
    private final String product_name;
    private final int available_qty;
    private final double price;
    private final int return_period;
    private double discount;
    private int threshold_qty;
    
    public Product(int product_id,String product_name,int available_qty,double price,int return_period){
        
        this.product_id = product_id;
        this.product_name = product_name;
        this.available_qty = available_qty;
        this.price = price;
        this.return_period = return_period;
    }
    public Product(int product_id,String product_name,int available_qty,double price,int return_period,double discount,int threshold){
        
        this(product_id,product_name,available_qty,price,return_period);
        this.discount = discount;
        this.threshold_qty = threshold;
    }
    
    
    public int getProduct_id(){
        return this.product_id;
    }
    
    public String getProduct_name(){
        return this.product_name;
    }
    
    public int getAvailable_qty(){
        return this.available_qty;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public int getReturn_period(){
        return this.return_period;
    }
    
    public double getDiscount(){
        return this.discount;
    }
    
    public int getThreshold_qty(){
        return this.threshold_qty;
    }
    
}
