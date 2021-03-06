/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author Lasse
 */
public class ProductInList extends javax.swing.JPanel {
    
    ShoppingItem si;
    /**
     * Creates new form ProductInList
     */
    public ProductInList(ShoppingItem si) {
        this.si = si;
        initComponents();
        
        
        
        
        //extraInfo.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(223, 223, 223)));
        setMinimumSize(new java.awt.Dimension(240, 30));
        setPreferredSize(new java.awt.Dimension(230, 30));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(si.getProduct().getName());
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 90, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/bilder/removesmall2.png"))); // NOI18N
        jButton1.setToolTipText("Ta bort varan från kundvagnen");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 0, 28, 30));

        plusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/bilder/plussmall.png"))); // NOI18N
        plusButton.setToolTipText("Lägg till en vara");
        plusButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        plusButton.setBorderPainted(false);
        plusButton.setContentAreaFilled(false);
        plusButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plusButton.setFocusPainted(false);
        plusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                plusButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                plusButtonMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                plusButtonMouseReleased(evt);
            }
        });
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });
        add(plusButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 0, 28, 30));

        minusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/bilder/minussmall.png"))); // NOI18N
        minusButton.setToolTipText("Tag bort en vara");
        minusButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        minusButton.setBorderPainted(false);
        minusButton.setContentAreaFilled(false);
        minusButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minusButton.setFocusPainted(false);
        minusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minusButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minusButtonMouseExited(evt);
            }
        });
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });
        add(minusButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 28, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText(String.format("%.1f", (si.getProduct().getPrice() * si.getAmount())) + " kr");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 60, 30));

        String suf = si.getProduct().getUnitSuffix();

        if(suf.equals("kg")){
            jLabel3.setText(String.format("%.1f", si.getAmount()) + " " + si.getProduct().getUnitSuffix());

        } else {
            jLabel3.setText(((int)si.getAmount()) + " " +  si.getProduct().getUnitSuffix());
        }
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 40, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusButtonActionPerformed
     
    }//GEN-LAST:event_plusButtonActionPerformed

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed
       
    }//GEN-LAST:event_minusButtonActionPerformed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        JLabel jl = new JLabel("extraInfo");
        
        //this.extraInfo.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        //this.extraInfo.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseExited

    private void minusButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusButtonMouseEntered
        minusButton.setIcon(new ImageIcon("src/imat/resources/bilder/minussmallfocus.png"));
    }//GEN-LAST:event_minusButtonMouseEntered

    private void minusButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusButtonMouseExited
        minusButton.setIcon(new ImageIcon("src/imat/resources/bilder/minussmall.png"));
    }//GEN-LAST:event_minusButtonMouseExited

    private void plusButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusButtonMouseEntered
        plusButton.setIcon(new ImageIcon("src/imat/resources/bilder/plussmallfocus.png"));
    }//GEN-LAST:event_plusButtonMouseEntered

    private void plusButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusButtonMouseExited
                          
        plusButton.setIcon(new ImageIcon("src/imat/resources/bilder/plussmall.png"));
    }//GEN-LAST:event_plusButtonMouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setIcon(new ImageIcon("src/imat/resources/bilder/removesmall3.png"));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setIcon(new ImageIcon("src/imat/resources/bilder/removesmall2.png"));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void plusButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusButtonMouseReleased
        
    }//GEN-LAST:event_plusButtonMouseReleased

    public ShoppingItem getShoppingItem(){
        return si;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton plusButton;
    // End of variables declaration//GEN-END:variables
    
    public JButton getButton(){
        return jButton1;
    }
    public JButton getplusButton(){
     return plusButton;   
    }
    public JButton getminusButton(){
     return minusButton;   
    }
    public boolean isKgItem(){
        if (si.getProduct().getUnit().equals("kr/kg")) {
            return true;
        } else {
            return false;
        }
    }
}
