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
import javax.swing.BorderFactory;
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
        
        //System.out.println("där");
        JComponent comp = (JComponent) super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);
        
        //comp.setOpaque(true);
        
        boolean highlight = (oldSelectedRow != -1 && row == oldSelectedRow);
        
        LocalCellRenderer r = (LocalCellRenderer) comp;
        
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
        String name = node.getUserObject().toString();
        
        Dimension size = r.getPreferredSize();
        
        if (highlight) {
            //r.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
            
            int[] selRows = tree.getSelectionRows();
            if(selRows.length != 0 && tree.getSelectionRows()[0] != row){
                r.setText("<html><u>" + name  + "</u></html>");
            }
            
                
            
        } else {
            r.setBorder(BorderFactory.createEmptyBorder());
            
        }

        return r;

    }
}
