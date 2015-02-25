/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
public class ListorPanel extends javax.swing.JPanel {
    List<ShoppingItem> list = new ArrayList<ShoppingItem>();
    
    IMatView view;
    
    Map<String,String> map;
    
    IMatDataHandler dh = IMatDataHandler.getInstance();
    DefaultListModel<String> listModel;
    /**
     * Creates new form listorPanel
     */
    public ListorPanel(IMatView view) {
        this.view = view;
        initComponents();
        update();
        
    }
    
    public void update(){
        
        map = new TreeMap<String,String>();
        
        int index = jList1.getSelectedIndex();
        if(index == -1){
            index = 0;
        }
        
        listModel = new DefaultListModel<String>();
        
        File folder = new File(dh.imatDirectory() + "/inköpslistor");
        
        File[] listOfFiles = folder.listFiles();
        
        if(listOfFiles.length == 0){
            jPanel1.removeAll();
            jPanel1.revalidate();
            jPanel1.repaint();
            
            jLabel1.setText("Totalt: ");
            jLabel2.setText("");
        }
        
        Scanner sc = null;
        for(File f : listOfFiles){
            try {
                sc = new Scanner(f);
            } catch (FileNotFoundException ex) {
                System.out.println("catch block");
                Logger.getLogger(ListorPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            String listName = sc.nextLine().split(";")[0];
            sc.close();
            listModel.addElement(listName);
            map.put(listName, f.getName());
        }
        
        
        jList1.setModel(listModel);
        jList1.setSelectedIndex(index);
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

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

        jLabel1.setText("jLabel1");

        jButton1.setText("Ta Bort");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("lägg till i kundvagnen");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("jLabel2");
        jLabel2.setFocusable(false);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2))
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(65, 65, 65))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        if(jList1.getSelectedIndex() == -1){
            return;
        }
        if (!evt.getValueIsAdjusting()) {//This line prevents double events
            String s = (String) jList1.getSelectedValue();
            
            
            updateVarorList(s);

        }
    }//GEN-LAST:event_jList1ValueChanged

    private void jList1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList1KeyPressed
    
    }//GEN-LAST:event_jList1KeyPressed

    private void jList1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MousePressed
        
    }//GEN-LAST:event_jList1MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String s = (String) jList1.getSelectedValue();
        File f = new File(dh.imatDirectory() + "/inköpslistor/" + map.get(s));
        
        System.out.println(f.getName());
        
        
        if(f.delete()){
            System.out.println("list was deleted successfully");
            
        } else {
            System.out.println("failed deletion");
        }
        
        jList1.setSelectedIndex(jList1.getSelectedIndex()-1);
        
        this.update();
        //this.updateVarorList(s);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        for(ShoppingItem si : list){
            view.addToKundVagn(si.getProduct(), si.getAmount());
        }
        view.updateKundVagn();
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void updateVarorList(final String s) {
        jLabel2.setText(s);
        
        list.clear();
        
        
        jPanel1.removeAll();
        jPanel1.revalidate();
        jPanel1.repaint();
        
        Double totalPrice = 0.0;
        
        File f = new File(dh.imatDirectory() + "/inköpslistor/" + map.get(s));
        
        String fileContent = "";
        Scanner sc;
        if(f.exists()){
            
            sc = null;
            try {
                sc = new Scanner(f);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ListorPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(sc.hasNextLine()){
                fileContent = sc.nextLine();
            } else {
                return;
            }
        } else {
            return;
            
        }
        
        sc.close();
        
        String [] arr = fileContent.split(";");
        int counter = 0;
        for(String x : arr){
            counter ++;
            final int c = counter; // for listeners
            
            if(counter == 1){
                continue;
            }
            String[] y = x.split(":");
            
            
            ShoppingItem si = new ShoppingItem(dh.getProduct(Integer.parseInt(y[0])), Double.parseDouble(y[1]));
            list.add(si);
            
            
            totalPrice += si.getProduct().getPrice() * si.getAmount();
            
            //jPanel1.add(new JLabel("hej"));
            ProductInList pil = new ProductInList(si);
            pil.getButton().addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    Scanner sc = null;
                    try {
                        sc = new Scanner(f);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(ListorPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    String newString = "";
                    
                    String ss = sc.nextLine();
                    String[] arr = ss.split(";");
                    
                    for(int i = 0; i < arr.length; i ++){
                        if(i != c-1){
                            newString += arr[i] + ";";
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
                    
                    updateVarorList(s);
                    
                }
            });
            
            pil.getplusButton().addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    Scanner sc = null;
                    try {
                        sc = new Scanner(f);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(ListorPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    String newString = "";
                    
                    String ss = sc.nextLine();
                    String[] arr = ss.split(";");
                    
                    for(int i = 0; i < arr.length; i ++){
                        if(i == c-1){
                            String aShoppingItem = arr[i];
                            String[] xx = aShoppingItem.split(":");
                            
                            Double newAmount = Double.parseDouble(xx[1]);
                            if(pil.isKgItem()){
                                newAmount += 0.2;
                            } else {
                                newAmount += 1;
                            }
                            
                            newString += xx[0] + ":" + newAmount + ";";
                        } else {
                            newString += arr[i] + ";";
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
                    
                    updateVarorList(s);
                }
            });
            
            pil.getminusButton().addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    Scanner sc = null;
                    try {
                        sc = new Scanner(f);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(ListorPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    String newString = "";
                    
                    String ss = sc.nextLine();
                    String[] arr = ss.split(";");
                    
                    for(int i = 0; i < arr.length; i ++){
                        if(i == c-1){
                            String aShoppingItem = arr[i];
                            String[] xx = aShoppingItem.split(":");
                            
                            Double newAmount = Double.parseDouble(xx[1]);
                            if(pil.isKgItem()){
                                newAmount = Math.max(0, newAmount-0.2);
                            } else {
                                newAmount = Math.max(0, newAmount-1);
                            }
                            
                            newString += xx[0] + ":" + newAmount + ";";
                        } else {
                            newString += arr[i] + ";";
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
                    
                    updateVarorList(s);
                }
            });
            
            jPanel1.add(pil);
        }
        
        jLabel1.setText("Totalt: " + String.format("%.2f", totalPrice) + " kr");
        
        jPanel1.repaint();
        this.repaint();
        
    }
}
