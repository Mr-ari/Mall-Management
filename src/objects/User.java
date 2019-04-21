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
public class User {
    private final String user_name,fullname;
    private final int user_id,isActive;
    
    public User(int user_id,String user_name,String fullname,int isActive){
        this.user_id = user_id;
        this.user_name = user_name;
        this.fullname = fullname;
        this.isActive = isActive;
    }
    
    public int getUser_id(){
        return this.user_id;
    }
    public String getUser_name(){
        return this.user_name;
    }
    public String getFullname(){
        return this.fullname;
    }
    public int getIsActive(){
        return this.isActive;
    }
}
