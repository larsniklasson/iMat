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
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import se.chalmers.ait.dat215.project.*;
import se.chalmers.ait.dat215.project.util.*;

/**
 *
 * @author Lasse
 */
public class Test {
    
    IMatDataHandler dh;
    
    public Test(){
        dh = IMatDataHandler.getInstance();
        ShoppingCart sc = dh.getShoppingCart();
        sc.addProduct(dh.getProduct(1), 2);
        sc.addProduct(dh.getProduct(7), 5);
        sc.addProduct(dh.getProduct(8), 9);
        
        saveShoppingCartAsList("lista 1");
        
        /*
        List<Order> orders = dh.getOrders();
        orders.sort(new Comparator<Order>() {

            @Override
            public int compare(Order o1, Order o2) {
                return o1.getOrderNumber() - o2.getOrderNumber();
            }
        });
        
        for(Order o : orders){
            
            System.out.println(o.getOrderNumber());
        }
        */
        /*ShoppingCart sc = dh.getShoppingCart();
        sc.addProduct(dh.getProduct(2));
        sc.addProduct(dh.getProduct(1));
        sc.addProduct(dh.getProduct(5));
        sc.addProduct(dh.getProduct(6));
        dh.placeOrder();
        dh.shutDown();
        
        Order o = dh.getOrders().get(dh.getOrders().size()-1);
        
        try{
            File f = new File(dh.imatDirectory() + "\\orders\\order_" + o.getOrderNumber() + ".txt");
            
            if(f.delete()){
                System.out.println("file was deleted");
            } else {
                System.out.println("file was not deleted");
            }
            
        } catch(Exception e){
            e.printStackTrace();
        }
        
        o.setOrderNumber(-4);
        dh.shutDown();*/
        
        
        
        
        
        
    }
    
    public void saveShoppingCartAsList(String name){
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
    
    
    
    public static void main(String[] args) {
        IMatDataHandler dh = IMatDataHandler.getInstance();
        //System.out.println(dh.imatDirectory());
        File f = new File(dh.imatDirectory() + "\\inköpslistor");
        
        f.mkdirs();
        
        
    }
}
