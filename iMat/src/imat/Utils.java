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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author Lasse
 */
public class Utils {
    
    public static void makeLoginTextFile(){
        IMatDataHandler dh = IMatDataHandler.getInstance();
        String path = dh.imatDirectory();
        File f = new File(path + "/login.txt");
        if(!f.exists()){
            try {
                f.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
            }
            PrintWriter pw = null;
            try {
                pw = new PrintWriter(f);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
            }
            pw.print("0");
            pw.close();
        }
    }
    
    public static void makeInköpslistaDir(){
        IMatDataHandler dh = IMatDataHandler.getInstance();
        String path = dh.imatDirectory() + "/inköpslistor";
        File dir = new File(path);
        if(!dir.exists()){
            dir.mkdirs();
        }
    }
    public static void makeRecipeListDir(){
        IMatDataHandler dh = IMatDataHandler.getInstance();
        String path = dh.imatDirectory() + "/Recept";
        File dir = new File(path);
        if(!dir.exists()){
            dir.mkdirs();
    }
    }
    
    public static void saveShoppingCartAsList(String name){
        IMatDataHandler dh = IMatDataHandler.getInstance();
        
        String path = dh.imatDirectory() + "/inköpslistor/";
        
        File f;
        int counter = 1;
        while(true){
            f = new File(path + counter + ".txt");
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
        
        
        
        
        
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(f);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        if(isNameOK(name)){
            pw.print(name + ";");
        } else {
            counter = 2;
            while(true){
                
                if(isNameOK(name + " (" + counter + ")")){
                    pw.print(name + " (" + counter + ")" + ";");
                    break;
                }
                counter ++;
            }
        }
        
        
        for(ShoppingItem si : dh.getShoppingCart().getItems()){
            pw.print(si.getProduct().getProductId() + ":" + si.getAmount() + ";");
        }
        
        
        pw.close();
    }
    
    
    private static boolean isNameOK(String name){
        File folder = new File(IMatDataHandler.getInstance().imatDirectory() + "/inköpslistor");
        
        File[] listOfFiles = folder.listFiles();
        
        Scanner sc = null;
        for(File f : listOfFiles){
            try {
                sc = new Scanner(f);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ListorPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            String listName;
            try{
                listName = sc.nextLine().split(";")[0];
            } catch (Exception e){
                sc.close();
                continue;
            }
            
            
            
            if(name.equals(listName)){
                sc.close();
                return false;
            } else {
                sc.close();
            }
        }
        sc.close();
        return true;

    }
    
    public static void addProductToList(Product p, String listName){
        File folder = new File(IMatDataHandler.getInstance().imatDirectory() + "/inköpslistor");
        
        File[] listOfFiles = folder.listFiles();
        
        Scanner sc = null;
        for(File f : listOfFiles){
            try {
                sc = new Scanner(f);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ListorPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try{
                if(listName.equals(sc.nextLine().split(";")[0])){
                    
                    sc.close();
                    sc = new Scanner(f);
                    
                    String newString = "";
                    
                    String[] arr = sc.nextLine().split(";");
                    newString += arr[0] + ";";
                    
                    boolean wasInList = false;
                    
                    int counter = 0;
                    for(String s : arr){
                        counter ++;
                        if(counter == 1){
                            continue;
                        }
                        
                        String[] x = s.split(":");
                        
                        if(Integer.parseInt(x[0]) == p.getProductId()){
                            wasInList = true;
                            if(p.getUnit().equals("kr/kg")){
                                newString += x[0] + ":" + (Double.parseDouble(x[1]) + 0.2) + ";";
                            } else {
                                newString += x[0] + ":" + (Double.parseDouble(x[1]) + 1.0) + ";";
                            }
                        } else {
                            newString += s + ";";
                        }
                        System.out.println("newstring = " + newString);
                        
                        
                    }
                    
                    if(!wasInList){
                        if(p.getUnit().equals("kr/kg")){
                            newString += p.getProductId() + ":" + 0.2 + ";";
                        } else {
                            newString += p.getProductId() + ":" + 1.0 + ";";
                        }
                    }
                    
                    sc.close();
                    PrintWriter pw = null;
                    try {
                        pw = new PrintWriter(f);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(ListorPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    pw.print(newString);
                    pw.close();
                    
                    
                    
                    
                    
                    
                } else {
                    sc.close();
                    continue;
                }
            } catch (Exception e){
                sc.close();
                continue;
            }
        }
    }
    
    public static List<String> getListor(){
        List<String> list = new ArrayList<String>();
        
        File folder = new File(IMatDataHandler.getInstance().imatDirectory() + "/inköpslistor");
        
        File[] listOfFiles = folder.listFiles();
        Scanner sc = null;
        for(File f: listOfFiles){
            try {
                sc = new Scanner(f);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            list.add(sc.nextLine().split(";")[0]);
            sc.close();
        }
        
        
        return list;
    }
    
    
    public static void createEmptyList(String name){
        IMatDataHandler dh = IMatDataHandler.getInstance();
        
        String path = dh.imatDirectory() + "/inköpslistor/";
        
        File f;
        int counter = 1;
        while(true){
            f = new File(path + counter + ".txt");
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
        
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(f);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        if(isNameOK(name)){
            pw.print(name + ";");
        } else {
            counter = 2;
            while(true){
                
                if(isNameOK(name + " (" + counter + ")")){
                    pw.print(name + " (" + counter + ")" + ";");
                    break;
                }
                counter ++;
            }
        }
        pw.close();
        
        
        
    }
    
}
