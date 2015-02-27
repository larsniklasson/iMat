/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author Lasse
 */
public class ProductSummaryView extends javax.swing.JPanel {

    IMatDataHandler dh = IMatDataHandler.getInstance();

    private Product p;
    private int amountToBuy = 1;
    

    /**
     * Creates new form ProductSummaryView
     */
    public ProductSummaryView(Product p) {
        this.p = p;
        initComponents();
        favoriteButton.setVisible(false);
        listButton.setVisible(false);
        amountSpinner.setVisible(false);
        amountkgSpinner.setVisible(false);

        // amountSpinner.setVisible(false);
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
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        amountSpinner = new javax.swing.JSpinner();
        favoriteButton = new javax.swing.JButton();
        listButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        antalLabel = new javax.swing.JLabel();
        amountkgSpinner = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        //System.out.println(jLabel1.getHeight());

        jLabel1.setIcon(dh.getImageIcon(p, 140, 100));
        jLabel1.setLabelFor(this);
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 160, 120));

        jLabel3.setText(String.format( "%.2f", p.getPrice()) + " " + p.getUnit());
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 20));

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setText("Köp");
        jButton1.setBorderPainted(false);
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
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 60, -1));

        amountSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        amountSpinner.setToolTipText("Välj hur mycket du vill lägga i kundvagnen");
        amountSpinner.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        amountSpinner.setValue(1);
        amountSpinner.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                amountSpinnerAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        amountSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                amountSpinnerStateChanged(evt);
            }
        });
        amountSpinner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                amountSpinnerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                amountSpinnerMouseExited(evt);
            }
        });
        add(amountSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 50, -1));

        favoriteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/bilder/heartInteFyllt.jpg"))); // NOI18N
        favoriteButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        favoriteButton.setBorderPainted(false);
        favoriteButton.setContentAreaFilled(false);
        favoriteButton.setFocusPainted(false);
        favoriteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                favoriteButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                favoriteButtonMouseExited(evt);
            }
        });
        favoriteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favoriteButtonActionPerformed(evt);
            }
        });
        add(favoriteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 40, 28));

        listButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imat/resources/bilder/note.jpg"))); // NOI18N
        listButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        listButton.setBorderPainted(false);
        listButton.setContentAreaFilled(false);
        listButton.setFocusPainted(false);
        listButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listButtonMouseExited(evt);
            }
        });
        add(listButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 40, 40));

        nameLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nameLabel.setText(p.getName());
        add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 110, 22));
        add(antalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 50, 20));

        amountkgSpinner.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(0.2d), Double.valueOf(0.2d), null, Double.valueOf(0.2d)));
        amountkgSpinner.setToolTipText("Välj hur mycket du vill lägga i kundvagnen");
        amountkgSpinner.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        amountkgSpinner.setValue(0.2);
        amountkgSpinner.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                amountkgSpinnerAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        amountkgSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                amountkgSpinnerStateChanged(evt);
            }
        });
        amountkgSpinner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                amountkgSpinnerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                amountkgSpinnerMouseExited(evt);
            }
        });
        add(amountkgSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 50, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void amountSpinnerAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_amountSpinnerAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_amountSpinnerAncestorAdded

    private void amountSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_amountSpinnerStateChanged

// TODO add your handling code here:
    }//GEN-LAST:event_amountSpinnerStateChanged

    private void favoriteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favoriteButtonActionPerformed
        /* if(!filled){
         File sourceimage = new File("src\\imat\\resources\\bilder\\heartFyllt.jpg");
         try {
         Image image = ImageIO.read(sourceimage);
         favoriteButton.setIcon(new ImageIcon(image));
         } catch (IOException ex) {
         Logger.getLogger(ProductSummaryView.class.getName()).log(Level.SEVERE, null, ex);
         }
         filled = true;
         }
         else{
         File sourceimage = new File("src\\imat\\resources\\bilder\\HeartInteFyllt.jpg");
         try {
         Image image = ImageIO.read(sourceimage);
         favoriteButton.setIcon(new ImageIcon(image));
         } catch (IOException ex) {
         Logger.getLogger(ProductSummaryView.class.getName()).log(Level.SEVERE, null, ex);
         }
         filled = false;
         }*/

// TODO add your handling code here:
    }//GEN-LAST:event_favoriteButtonActionPerformed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        showFavoriteAndListButtons();
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        hideFavoriteAndListButtons();
    }//GEN-LAST:event_formMouseExited

    private void favoriteButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favoriteButtonMouseEntered
        showFavoriteAndListButtons();
    }//GEN-LAST:event_favoriteButtonMouseEntered

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        showFavoriteAndListButtons();
    }//GEN-LAST:event_jButton1MouseEntered

    private void amountSpinnerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amountSpinnerMouseEntered
        showFavoriteAndListButtons();
    }//GEN-LAST:event_amountSpinnerMouseEntered

    private void listButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listButtonMouseEntered
        showFavoriteAndListButtons();
    }//GEN-LAST:event_listButtonMouseEntered

    private void favoriteButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favoriteButtonMouseExited
        hideFavoriteAndListButtons();
    }//GEN-LAST:event_favoriteButtonMouseExited

    private void listButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listButtonMouseExited
        hideFavoriteAndListButtons();
    }//GEN-LAST:event_listButtonMouseExited

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        hideFavoriteAndListButtons();
        }//GEN-LAST:event_jButton1MouseExited

    private void amountSpinnerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amountSpinnerMouseExited
        showFavoriteAndListButtons();
    }//GEN-LAST:event_amountSpinnerMouseExited

    private void amountkgSpinnerAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_amountkgSpinnerAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_amountkgSpinnerAncestorAdded

    private void amountkgSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_amountkgSpinnerStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_amountkgSpinnerStateChanged

    private void amountkgSpinnerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amountkgSpinnerMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_amountkgSpinnerMouseEntered

    private void amountkgSpinnerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amountkgSpinnerMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_amountkgSpinnerMouseExited

    public JButton getButton() {
        return jButton1;
    }

    public double getAmount() {
        if (p.getUnit().equals("kr/kg")) {
            return (double) amountkgSpinner.getValue();
        } else {
            return (double) (int) amountSpinner.getValue();
        }
    }

    public void resetAmount() {
        amountSpinner.setValue(1);
        amountkgSpinner.setValue(0.2);
    }

    public Product getProduct(){
        return this.p;
    }
    
    public JButton getFavoriteButton() {
        return favoriteButton;
    }

    public JButton getListButton() {
        return listButton;
    }

    public void showFavoriteAndListButtons() {
        listButton.setVisible(true);
        favoriteButton.setVisible(true);
        //amountSpinner.setVisible(true);
    }

    protected void hideFavoriteAndListButtons() {
        listButton.setVisible(false);
        favoriteButton.setVisible(false);
        //amountSpinner.setVisible(false);
    }

    public void setFavorite() {
        File sourceimage = new File("src/imat/resources/bilder/heartFyllt.jpg");
        try {
            Image image = ImageIO.read(sourceimage);
            favoriteButton.setIcon(new ImageIcon(image));
        } catch (IOException ex) {
            Logger.getLogger(ProductSummaryView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setAntalLabel() {
        if (p.getUnit().equals("kr/kg")) {
            antalLabel.setText("Antal kg:");
            amountkgSpinner.setVisible(true);
            //amountSpinner.NumberEditor;
        } else {
            antalLabel.setText("Antal:");
            amountSpinner.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner amountSpinner;
    private javax.swing.JSpinner amountkgSpinner;
    private javax.swing.JLabel antalLabel;
    public javax.swing.JButton favoriteButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JButton listButton;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables
    public boolean filled = false;
}
