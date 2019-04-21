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
public class Vendor {
    
    private final int vendor_id;
    private final String vendor_name,contact_no,address,account_no;
    
    public Vendor(int id,String vendor_name,String contact_no,String address,String account_no){
        this.vendor_id = id;
        this.vendor_name = vendor_name;
        this.contact_no = contact_no;
        this.address = address;
        this.account_no = account_no;
    }
    
    
    public int getVendor_id(){
        return this.vendor_id;
    }
    
    public String getVendor_name(){
        return this.vendor_name;
    }
    
    public String getContact_no(){
        return this.contact_no;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public String getAccount_no(){
        return this.account_no;
    }
    
}
