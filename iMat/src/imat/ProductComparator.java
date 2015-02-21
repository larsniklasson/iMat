/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;


import se.chalmers.ait.dat215.project.Product;
import java.util.Comparator;

/**
 *
 * @author Lasse
 */
public class ProductComparator implements Comparator<Product>{
    
    String s;
    
    public ProductComparator(String s){
        this.s = s;
        
    }
    
    @Override
    public int compare(Product o1, Product o2) {
        if(s.equals("Popularitet")){
            return 0; //ej implementerat
        }
        if(s.equals("Pris lågt-högt")){
            double diff = o1.getPrice()-o2.getPrice();
            if(diff == 0){
                return 0;
            }
            
            if(diff > 0){
                return 1;
            }
            return -1;
        }
        
        if(s.equals("Pris högt-lågt")){
            double diff = o1.getPrice()-o2.getPrice();
            if(diff == 0){
                return 0;
            }
            
            if(diff > 0){
                return -1;
            }
            return 1;
        } 
        
        if(s.equals("Bokstavsordning A-Ö")){
            return o1.getName().compareTo(o2.getName());
        }
        if(s.equals("Bokstavsordning Ö-A")){
            return o2.getName().compareTo(o1.getName());
        }
        
        //System.out.println("ingen sortering");
        return 0;


    }

   

    
    
}
