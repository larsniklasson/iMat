import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Random;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

public class TreeExample extends JPanel
{
    Random random = new Random(314159);

    public void populateTree(DefaultMutableTreeNode parent, int level)
    {
        if (level > 0)
        {
            int count = 2 + random.nextInt(7);
            for (int i = 0; i < count; i++)
            {
                DefaultMutableTreeNode childNode = new DefaultMutableTreeNode(" Node (" + level + ", " + i + ")");
                populateTree(childNode, level - 1);
                parent.add(childNode);
            }
        }
    }

    /**
     * Cell renderer that knows the currently highlighted cell
     */
    static private class LocalCellRenderer extends DefaultTreeCellRenderer
    {
        private TreePath oldSelectedPath = null;

        private LocalCellRenderer(final JTree tree)
        {
            tree.addMouseMotionListener(new MouseMotionListener()
            {
                public void mouseDragged(MouseEvent mouseEvent)
                {
                    // Nothing to do
                }

                public void mouseMoved(MouseEvent mouseEvent)
                {
                    DefaultTreeModel treeModel = (DefaultTreeModel) tree.getModel();
                    int selRow = tree.getRowForLocation(mouseEvent.getX(), mouseEvent.getY());
                    if (selRow < 0)
                    {
                        TreePath currentSelected = oldSelectedPath;
                        oldSelectedPath = null;
                        if (currentSelected != null)
                            treeModel.nodeChanged((TreeNode) currentSelected.getLastPathComponent());
                    } else
                    {
                        TreePath selectedPath = tree.getPathForLocation(mouseEvent.getX(), mouseEvent.getY());
                        if ((oldSelectedPath == null) || !selectedPath.equals(oldSelectedPath))
                        {
                            oldSelectedPath = selectedPath;
                            treeModel.nodeChanged((TreeNode) oldSelectedPath.getLastPathComponent());
                        }
                    }
                    tree.repaint();
                }
            });
        }

        @Override
        public Component getTreeCellRendererComponent(
                JTree tree,
                Object value,
                boolean selected,
                boolean expanded,
                boolean leaf,
                int row,
                boolean hasFocus)
        {
            JComponent comp = (JComponent) super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);
            comp.setOpaque(true);
            boolean highlight = (oldSelectedPath != null) && (value == oldSelectedPath.getLastPathComponent());
            comp.setBackground(highlight ? Color.red : tree.getBackground());
            return comp;
        }
    }

    public TreeExample()
    {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        populateTree(root, 5);
        DefaultTreeModel model = new DefaultTreeModel(root);

        JTree tree = new JTree(model);
        tree.setBackground(Color.yellow);
        LocalCellRenderer renderer = new LocalCellRenderer(tree);
        tree.setCellRenderer(renderer);
        add(tree);
    }

    public static void main(String[] args) throws Exception
    {
        final JFrame frame = new JFrame("Funny Tree Highlight Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new TreeExample());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}