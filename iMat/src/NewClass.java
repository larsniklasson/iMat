
import javax.swing.JFrame;
import oracle.jrockit.jfr.JFR;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lasse
 */
public class NewClass extends JFrame{
    public NewClass(){
        this.setSize(400,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new NewClass();
    }
}
