/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author Lasse
 */
public class listorPanel extends javax.swing.JPanel {
    Map<String,String> map = new TreeMap<String,String>();
    
    IMatDataHandler dh = IMatDataHandler.getInstance();
    DefaultListModel<String> listModel;
    /**
     * Creates new form listorPanel
     */
    public listorPanel() {
        initComponents();
        
    }
    
    public void update(){
        listModel = new DefaultListModel<String>();
        
        File folder = new File(dh.imatDirectory() + "\\inköpslistor");
        
        File[] listOfFiles = folder.listFiles();
        
        Scanner sc = null;
        for(File f : listOfFiles){
            try {
                sc = new Scanner(f);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(listorPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            String listName = sc.nextLine().split(";")[0];
            listModel.addElement(listName);
            map.put(listName, f.getName());
        }
        
        
        jList1.setModel(listModel);
        this.repaint();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jList1MousePressed(evt);
            }
        });
        jList1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jList1KeyPressed(evt);
            }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        if (!evt.getValueIsAdjusting()) {//This line prevents double events
            String s = (String) jList1.getSelectedValue();
            
            
            updateVarorList(s);

        }
    }//GEN-LAST:event_jList1ValueChanged

    private void jList1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList1KeyPressed
    
    }//GEN-LAST:event_jList1KeyPressed

    private void jList1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MousePressed
        
    }//GEN-LAST:event_jList1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void updateVarorList(String s) {
        
        
        jPanel1.removeAll();
        jPanel1.revalidate();
        jPanel1.repaint();
        
        File f = new File(dh.imatDirectory() + "\\inköpslistor\\" + map.get(s));
        
        String fileContent = "";
        
        if(f.exists()){
            
            Scanner sc = null;
            try {
                sc = new Scanner(f);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(listorPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(sc.hasNextLine()){
                fileContent = sc.nextLine();
            } else {
                return;
            }
        } else {
            return;
        }
        
        String [] arr = fileContent.split(";");
        int counter = 0;
        for(String x : arr){
            counter ++;
            if(counter == 1){
                continue;
            }
            String[] y = x.split(":");
            
            
            ShoppingItem si = new ShoppingItem(dh.getProduct(Integer.parseInt(y[0])), Double.parseDouble(y[1]));
            //jPanel1.add(new JLabel("hej"));
            jPanel1.add(new ProductInList(si));
        }
        
        jPanel1.repaint();
        this.repaint();
        
    }
}
