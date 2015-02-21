/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author Lasse
 */
public class Utils {
    public static void saveShoppingCartAsList(String name){
        IMatDataHandler dh = IMatDataHandler.getInstance();
        
        String path = dh.imatDirectory() + "\\inköpslistor";
        File dir = new File(path);
        if(!dir.exists()){
            dir.mkdirs();
        }
        
        
        File f = new File(path + "\\" + name + ".txt");
        
        
        
        
        if(!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            int counter = 1;
            while(true){
                f = new File(path + "\\" + name + " (" + counter + ")" + ".txt");
                if(!f.exists()){
                    try {
                        f.createNewFile();
                    } catch (IOException ex) {
                        Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                counter ++;
            }
            
        
        }
        
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(f);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(ShoppingItem si : dh.getShoppingCart().getItems()){
            pw.print(si.getProduct().getProductId() + ":" + si.getAmount() + ";");
        }
        
        
        pw.close();
    }
}
