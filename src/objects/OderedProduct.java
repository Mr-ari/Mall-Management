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
public class OderedProduct {
    public String id;
    public String name;
    public double rate;
    public int quantity;
    public double discount;
    double ammount;
    
    public OderedProduct(String id,String name,double rate,int quantity,double discount){
    
        this.rate=rate;
        this.name = name;
        this.quantity = quantity;
        this.id = id;
        this.discount= discount;
        this.ammount = (rate*(100-this.discount))/100;
        this.ammount = this.ammount*this.quantity;
    }
    
    public double getAmmount(){
        return this.ammount;
    }
}
