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
public class OrderedProduct {
    
    Product p;
    int orderQty;
    double ammount;
    public OrderedProduct(Product p,int orderQty){
        this.p = p;
        this.orderQty = orderQty;
        this.ammount = p.getPrice()*this.orderQty;
    }

    public Product getP() {
        return p;
    }

    public int getOrderQty() {
        return orderQty;
    }
    
    public double getAmmount(){
        return this.ammount;
    }
    
}
    
