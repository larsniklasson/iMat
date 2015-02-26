/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author jesper
 */
public class DefaultBagPanel extends javax.swing.JPanel {

    List<ShoppingItem> list = new ArrayList<ShoppingItem>();

    IMatView view;

    Map<String, String> map;

    IMatDataHandler dh = IMatDataHandler.getInstance();
    DefaultListModel<String> listModel;

    private Double totalPrice;

    private BufferedImage image;

    /**
     * Creates new form defaultBadPanel
     */
    public DefaultBagPanel(IMatView view) {
        this.view = view;
        initComponents();
        update();

        addBackground();
    }

    public void update() {

        map = new TreeMap<String, String>();

        int index = jList1.getSelectedIndex();
        if (index == -1) {
            index = 0;
        }

        listModel = new DefaultListModel<String>();

        File folder = new File(dh.imatDirectory() + "/Recept");

        File[] listOfFiles = folder.listFiles();

        if (listOfFiles.length == 0) {
            jPanel1.removeAll();
            jPanel1.revalidate();
            jPanel1.repaint();

            totalLabel.setText("Totalt: ");
            jLabel2.setText("");
        }

        Scanner sc = null;
        for (File f : listOfFiles) {
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

        totalLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(235, 235, 235));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalLabel.setText("jLabel1");
        add(totalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 110, 31));

        jButton2.setText("lägg till i kundvagnen");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, 140, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Recept");
        jLabel2.setFocusable(false);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 41, 294, 26));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 80, 101, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setOpaque(false);
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 280, 297));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        for (ShoppingItem si : list) {
            view.addToKundVagn(si.getProduct(), si.getAmount());
        }
        view.updateKundVagn();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jList1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MousePressed

    }//GEN-LAST:event_jList1MousePressed

    private void jList1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList1KeyPressed

    }//GEN-LAST:event_jList1KeyPressed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        if (jList1.getSelectedIndex() == -1) {
            return;
        }
        if (!evt.getValueIsAdjusting()) {//This line prevents double events
            String s = (String) jList1.getSelectedValue();

            updateVarorList(s);

        }
    }//GEN-LAST:event_jList1ValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables

    private void updateVarorList(final String s) {
        jLabel2.setText(s);

        list.clear();

        jPanel1.removeAll();
        jPanel1.revalidate();
        jPanel1.repaint();

        totalPrice = 0.0;

        File f = new File(dh.imatDirectory() + "/Recept/" + map.get(s));

        String fileContent = "";
        Scanner sc;
        if (f.exists()) {

            sc = null;
            try {
                sc = new Scanner(f);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ListorPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (sc.hasNextLine()) {
                fileContent = sc.nextLine();
            } else {
                return;
            }
        } else {
            return;

        }

        sc.close();

        String[] arr = fileContent.split(";");
        int counter = 0;
        for (String x : arr) {
            counter++;
            final int c = counter; // for listeners

            if (counter == 1) {
                continue;
            }
            String[] y = x.split(":");

            ShoppingItem si = new ShoppingItem(dh.getProduct(Integer.parseInt(y[0])), Double.parseDouble(y[1]));
            list.add(si);

            totalPrice += si.getProduct().getPrice() * si.getAmount();

            //jPanel1.add(new JLabel("hej"));
            ProductInRecipeList pil = new ProductInRecipeList(si);
            pil.getDeleteButton().addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    pil.setVisible(false);
                    list.remove(si);
                    totalPrice -= si.getProduct().getPrice() * si.getAmount();
                    totalLabel.setText("Totalt: " + String.format("%.2f", totalPrice) + " kr");
                }
            });

            jPanel1.add(pil);
        }

        totalLabel.setText("Totalt: " + String.format("%.2f", totalPrice) + " kr");

        jPanel1.repaint();
        this.repaint();

    }

    public void addBackground() {
        try {
            image = ImageIO.read(new File("src/imat/resources/bilder/recept1.jpg"));
        } catch (IOException ex) {
            // handle exception...
        }
    }

    public void lowerPrice() {

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null); // see javadoc for more info on the parameters            
    }

    public void initializeDefaultBag(String s) {
        switch (s) {
            case "Recept1":
                try {
                    image = ImageIO.read(new File("src/imat/resources/bilder/recept1.jpg"));
                    updateVarorList(s);
                } catch (IOException ex) {
                    // handle exception...
                }
                break;
            case "Recept2":
                try {
                    image = ImageIO.read(new File("src/imat/resources/bilder/star.jpg"));
                    updateVarorList(s);
                } catch (IOException ex) {
                    // handle exception...
                }
                break;
        }

    }

}
