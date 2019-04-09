/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import objects.OderedProduct;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author ari
 */
public class BillPrint {
    public static void printBillInFile(int orderId,List <OderedProduct> o) throws IOException{
        
        File file = new File(String.valueOf(orderId)+".csv");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bfw = new BufferedWriter(fw);
        int i=0;
        for(OderedProduct x : o){
            i++;
            bfw.write(String.valueOf(i)+","+x.id+","+x.name+","+String.valueOf(x.quantity)+","+String.valueOf(x.rate)+","+String.valueOf(x.getAmmount())+"\n");
        }
        bfw.close();
    }
    
    
    
}
