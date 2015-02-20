/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.tree.DefaultMutableTreeNode;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author Lasse
 */
public class IMatView extends javax.swing.JFrame {
    
    
    private ShoppingCart shoppingCart;
    private IMatDataHandler dh = IMatDataHandler.getInstance();
    
    List<Product> varorViewList = dh.getProducts();
    
    /**
     * Creates new form IMatView
     */
    public IMatView() {
        shoppingCart = dh.getShoppingCart();
        
        
        initComponents();
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        updateKundVagn();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        selectedLabel = new javax.swing.JLabel();
        searchTextFIeld = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        leftPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        favoritesButton = new javax.swing.JButton();
        listorButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        kassarButton = new javax.swing.JButton();
        rightPanel = new javax.swing.JPanel();
        kundvagnPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        totalPris = new javax.swing.JLabel();
        centerPanel = new javax.swing.JPanel();
        cardPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        varorPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        mainPanel.setPreferredSize(new java.awt.Dimension(900, 750));
        mainPanel.setLayout(new java.awt.BorderLayout());

        topPanel.setBackground(new java.awt.Color(51, 255, 102));
        topPanel.setPreferredSize(new java.awt.Dimension(800, 60));

        selectedLabel.setText("IMAT");

        searchButton.setText("Sök");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jButton5.setText("Login/registrera");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selectedLabel)
                .addGap(258, 258, 258)
                .addComponent(searchTextFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selectedLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(topPanel, java.awt.BorderLayout.PAGE_START);

        leftPanel.setBackground(new java.awt.Color(153, 0, 204));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Visa Alla");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Grönsaker");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Rotfrukter");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Kål");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Grönsaksfrukter");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Ärtor, Linser & Bönor");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Kött");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Fisk");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Frukt & Bär");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Stenfrukter");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Meloner");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Citrusfrukter");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Exotiska Frukter");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Bär");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Bröd");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Drycker");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Varma Drycker");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Kalla Drycker");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Mejeriprodukter");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Mjöl, Socker & Salt");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Nötter & Frön");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Pasta, Potatis & Ris");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Pasta");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Potatis");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Ris");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Sötsaker");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Kryddor");
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.setToggleClickCount(1);
        jTree1.setRootVisible(false);
        jTree1.setToggleClickCount(1);
        jTree1.addTreeExpansionListener(new javax.swing.event.TreeExpansionListener() {
            public void treeCollapsed(javax.swing.event.TreeExpansionEvent evt) {
                jTree1TreeCollapsed(evt);
            }
            public void treeExpanded(javax.swing.event.TreeExpansionEvent evt) {
            }
        });
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jTree1.addTreeWillExpandListener(new javax.swing.event.TreeWillExpandListener() {
            public void treeWillCollapse(javax.swing.event.TreeExpansionEvent evt)throws javax.swing.tree.ExpandVetoException {
                jTree1TreeWillCollapse(evt);
            }
            public void treeWillExpand(javax.swing.event.TreeExpansionEvent evt)throws javax.swing.tree.ExpandVetoException {
            }
        });
        jTree1.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTree1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        favoritesButton.setText("favoriter");
        favoritesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favoritesButtonActionPerformed(evt);
            }
        });

        listorButton.setText("inköpslistor");

        settingsButton.setText("inställningar");

        kassarButton.setText("färdiga kassar");

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(settingsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listorButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(favoritesButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kassarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(favoritesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listorButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kassarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mainPanel.add(leftPanel, java.awt.BorderLayout.LINE_START);

        rightPanel.setBackground(new java.awt.Color(0, 204, 255));
        rightPanel.setPreferredSize(new java.awt.Dimension(250, 550));

        kundvagnPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kundvagnPanel.setPreferredSize(new java.awt.Dimension(230, 5));
        kundvagnPanel.setLayout(new java.awt.GridLayout(1, 0));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Kundvagn");

        jButton1.setText("Till Kassan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ink.lista");

        jButton3.setText("Töm");

        totalPris.setText("Totalt" + shoppingCart.getTotal() + " kr");

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kundvagnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addComponent(totalPris, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kundvagnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(57, 57, 57)
                .addComponent(totalPris, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(511, 511, 511))
        );

        mainPanel.add(rightPanel, java.awt.BorderLayout.LINE_END);

        centerPanel.setBackground(new java.awt.Color(255, 255, 255));
        centerPanel.setLayout(new java.awt.BorderLayout());

        cardPanel.setBackground(new java.awt.Color(0, 102, 102));
        cardPanel.setLayout(new java.awt.CardLayout());

        jScrollPane2.getVerticalScrollBar().setUnitIncrement(8);

        updateVarorView();

        varorPanel.setLayout(new ModifiedFlowLayout());

        jScrollPane2.setViewportView(varorPanel);

        cardPanel.add(jScrollPane2, "card3");

        centerPanel.add(cardPanel, java.awt.BorderLayout.CENTER);

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 35));

        TitleLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Title");

        jLabel2.setText("Sortering: ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Popularitet", "Pris lågt-högt", "Pris högt-lågt", "Bokstavsordning A-Ö", "Bokstavsordning Ö-A" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        centerPanel.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        mainPanel.add(centerPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        varorViewList = dh.findProducts(searchTextFIeld.getText().toLowerCase());
        TitleLabel.setText("<html>Sökresultat för: <i>" + searchTextFIeld.getText() + "</i></html>");
        updateVarorView();
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
      
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        dh.shutDown();
        System.exit(1);
    }//GEN-LAST:event_formWindowClosing

    private void jTree1ValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTree1ValueChanged
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();
        String s = selectedNode.getUserObject().toString();
        
        
        
        switch(s){
            case "Visa Alla":
                varorViewList = dh.getProducts();
                break;
            case "Grönsaker":
                varorViewList = dh.getProducts(ProductCategory.POD);
                varorViewList.addAll(dh.getProducts(ProductCategory.CABBAGE));
                varorViewList.addAll(dh.getProducts(ProductCategory.ROOT_VEGETABLE));
                varorViewList.addAll(dh.getProducts(ProductCategory.VEGETABLE_FRUIT));
                break;
            
            case "Kål":
                varorViewList = dh.getProducts(ProductCategory.CABBAGE);
                break;
            case "Rotfrukter":
                varorViewList = dh.getProducts(ProductCategory.ROOT_VEGETABLE);
                break;
            case "Grönsaksfrukter":
                varorViewList = dh.getProducts(ProductCategory.VEGETABLE_FRUIT);
                break;
            case "Ärtor, Linser & Bönor":
                varorViewList = dh.getProducts(ProductCategory.POD);
                break;
            
            case "Kött":
                varorViewList = dh.getProducts(ProductCategory.MEAT);
                break;
            case "Fisk":
                varorViewList = dh.getProducts(ProductCategory.FISH);
                break;
            case "Frukt & Bär":
                varorViewList = dh.getProducts(ProductCategory.BERRY);
                varorViewList.addAll(dh.getProducts(ProductCategory.MELONS));
                varorViewList.addAll(dh.getProducts(ProductCategory.CITRUS_FRUIT));
                varorViewList.addAll(dh.getProducts(ProductCategory.EXOTIC_FRUIT));
                varorViewList.addAll(dh.getProducts(ProductCategory.FRUIT));
                break;
            
            case "Stenfrukter":
                varorViewList = dh.getProducts(ProductCategory.FRUIT);
                break;    
            case "Meloner":
                varorViewList = dh.getProducts(ProductCategory.MELONS);
                break;    
            case "Citrusfrukter":
                varorViewList = dh.getProducts(ProductCategory.CITRUS_FRUIT);
                break;    
            case "Exotiska Frukter":
                varorViewList = dh.getProducts(ProductCategory.EXOTIC_FRUIT);
                break;    
            case "Bär":
                varorViewList = dh.getProducts(ProductCategory.BERRY);
                break;    
            
            case "Bröd":
                varorViewList = dh.getProducts(ProductCategory.BREAD);
                break;    
            case "Drycker":
                varorViewList = dh.getProducts(ProductCategory.COLD_DRINKS);
                varorViewList.addAll(dh.getProducts(ProductCategory.HOT_DRINKS));
                break;   
            case "Varma Drycker":
                varorViewList = dh.getProducts(ProductCategory.HOT_DRINKS);
                break;   
            case "Kalla Drycker":
                varorViewList = dh.getProducts(ProductCategory.COLD_DRINKS);
                break;   
            case "Mejeriprodukter":
                varorViewList = dh.getProducts(ProductCategory.DAIRIES);
                break;   
            case "Mjöl, Socker & Salt":
                varorViewList = dh.getProducts(ProductCategory.FLOUR_SUGAR_SALT);
                break;   
            case "Nötter & Frön":
                varorViewList = dh.getProducts(ProductCategory.NUTS_AND_SEEDS);
                break;
            
            case "Pasta, Potatis & Ris":
                varorViewList = dh.getProducts(ProductCategory.PASTA);
                varorViewList.addAll(dh.getProducts(ProductCategory.POTATO_RICE));
                break; 
            case "Pasta":
                varorViewList = dh.getProducts(ProductCategory.PASTA);
                break; 
            case "Potatis":
                varorViewList = dh.findProducts("potatis");
                break; 
            case "Ris":
                varorViewList = dh.findProducts("ris");
                break;   
            case "Sötsaker":
                varorViewList = dh.getProducts(ProductCategory.SWEET);
                break;
            case "Kryddor":
                varorViewList = dh.getProducts(ProductCategory.HERB);
                break;
                
        }
        
        
        TitleLabel.setText(s);
        jTree1.repaint();

        updateVarorView();

    }//GEN-LAST:event_jTree1ValueChanged

    private void jTree1TreeWillCollapse(javax.swing.event.TreeExpansionEvent evt)throws javax.swing.tree.ExpandVetoException {//GEN-FIRST:event_jTree1TreeWillCollapse

    }//GEN-LAST:event_jTree1TreeWillCollapse

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        
        int row = jTree1.getClosestRowForLocation(evt.getX(), evt.getY());

        jTree1.setSelectionRow(row);

    }//GEN-LAST:event_jTree1MouseClicked

    private void jTree1TreeCollapsed(javax.swing.event.TreeExpansionEvent evt) {//GEN-FIRST:event_jTree1TreeCollapsed
        

    }//GEN-LAST:event_jTree1TreeCollapsed

    private void favoritesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favoritesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_favoritesButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.setProperty("sun.java2d.noddraw", Boolean.TRUE.toString());
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IMatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IMatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IMatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IMatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IMatView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JPanel centerPanel;
    private javax.swing.JButton favoritesButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree jTree1;
    private javax.swing.JButton kassarButton;
    private javax.swing.JPanel kundvagnPanel;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton listorButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextFIeld;
    private javax.swing.JLabel selectedLabel;
    private javax.swing.JButton settingsButton;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel totalPris;
    private javax.swing.JPanel varorPanel;
    // End of variables declaration//GEN-END:variables

    private void updateVarorView() {
        varorPanel.removeAll();
        varorPanel.revalidate();
        varorPanel.repaint();
        for(Product p : varorViewList){
            try{
                
                ProductSummaryView psv = new ProductSummaryView(p);
                psv.getButton().addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        shoppingCart.addProduct(p);
                        updateKundVagn();
                    }
                });
                varorPanel.add(psv);
            } catch(Exception e){}
        }
    }
    
    private void updateKundVagn(){
        kundvagnPanel.removeAll();
        kundvagnPanel.revalidate();
        //System.out.println("total " + shoppingCart.getItems().size());
        kundvagnPanel.setLayout(new GridLayout((int)shoppingCart.getItems().size(),1));
        int counter = 0;
        
        if (shoppingCart.getItems().size() == 0){
            JLabel label = new JLabel("Kundvagnen tom");
            //System.out.println(label.getFont().toString());
            kundvagnPanel.add(label);
        }
        
        for(ShoppingItem si : shoppingCart.getItems()){
            final int c = counter;
            ProductInList pil = new ProductInList(si);
            pil.getButton().addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    shoppingCart.removeItem(c);
                    updateKundVagn();
                }
            });
            kundvagnPanel.add(pil);
            counter ++;
        }
        kundvagnPanel.repaint();
        totalPris.setText("Totalt" + shoppingCart.getTotal() + " kr");
    }
    
    
    
}
