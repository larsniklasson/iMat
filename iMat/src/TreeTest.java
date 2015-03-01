import imat.IMatView;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.tree.*;
 
public class TreeTest
{
    private JTree getTree()
    {
        String[] birds = {
            // branches |<-- child leaf nodes -->|
            "hawks", "gray", "red-tailed", "rough-legged",
            "falcons", "harrier", "kestrel", "kite",
            "owls", "barred", "saw-whet", "snowy"
        };
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("birds");
        DefaultMutableTreeNode[] nodes = new DefaultMutableTreeNode[birds.length];
        for(int j = 0; j < nodes.length; j++)
            nodes[j] = new DefaultMutableTreeNode(birds[j]);
        for(int j = 0; j < 9; j += 4)
        {
            root.insert(nodes[j], j % 3);
            for(int k = j + 1; k < j + 4; k++)
                nodes[j].insert(nodes[k], k - j - 1);
        }
        DefaultTreeModel model = new DefaultTreeModel(root);
        JTree tree = new JTree(model);
        tree.addMouseMotionListener(new TreeScanner());
        return tree;
    }
 
    public static void main(String[] args)
    {
        
        UIManager.put("nimbusSelectedText", Color.black);
        UIManager.put("nimbusSelectionBackground", new Color(178, 255, 186));
        
        
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    try {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(TreeTest.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                        Logger.getLogger(TreeTest.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(TreeTest.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(TreeTest.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
            }
        
        
        
        TreeTest test = new TreeTest();
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(new JScrollPane(test.getTree()));
        f.setSize(400,400);
        f.setLocation(200,200);
        f.setVisible(true);
    }
}
 
class TreeScanner extends MouseMotionAdapter
{
    static int lastSelected=-1;
 
    
    public void mouseExited(MouseEvent e){
       JTree tree=(JTree) e.getSource();
       lastSelected=-1;
       tree.clearSelection();
    }
 
    @Override
    public void mouseMoved(MouseEvent e){
       JTree tree=(JTree) e.getSource();
       int selRow=tree.getRowForLocation(e.getX(), e.getY());
       if(selRow==-1){
           tree.clearSelection();
           lastSelected=-1;
       }
       else if(selRow!=lastSelected){
           tree.setSelectionRow(selRow);
           lastSelected=selRow;
       }
    }
}