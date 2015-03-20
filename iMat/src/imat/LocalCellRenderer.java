/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

/**
 *
 * @author Lasse
 */
public class LocalCellRenderer extends DefaultTreeCellRenderer {

    int oldSelectedRow = -1;

    public LocalCellRenderer(final JTree tree) {
        tree.addMouseListener(new MouseAdapter() {
        
        public void mouseExited(MouseEvent e){
            System.out.println("exit");
            oldSelectedRow = -1;
            tree.repaint();
        }
            
        });
        
        tree.addMouseMotionListener(new MouseMotionListener() {
            public void mouseDragged(MouseEvent mouseEvent) {
                // Nothing to do
            }

            public void mouseMoved(MouseEvent evt) {
                DefaultTreeModel treeModel = (DefaultTreeModel) tree.getModel();
                oldSelectedRow = tree.getClosestRowForLocation(evt.getX(), evt.getY());
                //System.out.println(oldSelectedRow);
                
                /*int selRow = tree.getClosestRowForLocation(mouseEvent.getX(), mouseEvent.getY());
                if (selRow < 0) {
                    TreePath currentSelected = oldSelectedPath;
                    oldSelectedPath = null;
                    if (currentSelected != null) {
                        treeModel.nodeChanged((TreeNode) currentSelected.getLastPathComponent());
                    }
                    
                } else {
                    TreePath selectedPath = tree.getClosestPathForLocation(mouseEvent.getX(), mouseEvent.getY());
                    if ((oldSelectedPath == null) || !selectedPath.equals(oldSelectedPath)) {
                        oldSelectedPath = selectedPath;
                        treeModel.nodeChanged((TreeNode) oldSelectedPath.getLastPathComponent());
                    }
                }*/
                //System.out.println("hej");
                tree.repaint();
            }
        });
        
        setLeafIcon(null);
        setClosedIcon(null);
        setOpenIcon(null);
        setTextSelectionColor(Color.white);
        
        
        
    }

    @Override
    public Component getTreeCellRendererComponent(
            JTree tree,
            Object value,
            boolean selected,
            boolean expanded,
            boolean leaf,
            int row,
            boolean hasFocus) {
        
        
        JComponent comp = (JComponent) super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);
        
        //comp.setOpaque(true);
        
        boolean highlight = (oldSelectedRow != -1 && row == oldSelectedRow);
        
        LocalCellRenderer r = (LocalCellRenderer) comp;
        
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
        String name = node.getUserObject().toString();
        
        switch(name){
            case "Favoriter":
                r.setIcon(new ImageIcon("src/imat/resources/bilder/favoriter.png"));
                break;
             
            case "Färdiga Kassar":
                r.setIcon(new ImageIcon("src/imat/resources/bilder/kasse.png"));
                break;
             
            case "Inköpslistor":
                r.setIcon(new ImageIcon("src/imat/resources/bilder/inkopslista.png"));
                break;
             
            case "Dagens Erbjudande":
                //r.setIcon(new ImageIcon("src/imat/resources/bilder/erbjudande.png"));
                if(selected){
                    r.setForeground(Color.white);
                } else {
                    r.setForeground(new Color(155,0,0));
                }
                
                break;
            default:
                r.setIcon(null);
        }
        
        Dimension size = r.getPreferredSize();
        
        if (highlight) {
            //r.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
            
            if(!tree.isRowSelected(row)){
                r.setText("<html><u>" + name  + "</u></html>");
            }
            
                
            
        } else {
            r.setBorder(BorderFactory.createEmptyBorder());
            
        }

        return r;

    }
}
