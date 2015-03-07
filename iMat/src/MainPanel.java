/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lasse
 */
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.*;

public final class MainPanel extends JPanel {
    public MainPanel() {
        super(new BorderLayout());
        JTextField textField01 = new JTextField(20) {
            //Unleash Your Creativity with Swing and the Java 2D API!
            //http://java.sun.com/products/jfc/tsc/articles/swing2d/index.html
            @Override protected void paintComponent(Graphics g) {
                if (!isOpaque()) {
                    int w = getWidth();
                    int h = getHeight();
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    g2.setColor(UIManager.getColor("TextField.background"));
                    g2.fillRoundRect(0, 0, w - 1, h - 1, h, h);
                    g2.setColor(Color.GRAY);
                    g2.drawRoundRect(0, 0, w - 1, h - 1, h, h);
                    g2.dispose();
                }
                super.paintComponent(g);
            }
        };
        textField01.setOpaque(false);
        textField01.setBackground(new Color(0, 0, 0, 0));
        textField01.setBorder(BorderFactory.createEmptyBorder(4, 8, 4, 8));
        textField01.setText("aaaaaaaaaaa");

        JTextField textField02 = new JTextField(20);
        
        System.out.println(textField02.getPreferredSize());
        textField02.setBorder(new RoundedCornerBorder());
        textField02.setText("bbbbbbbbbbbb");

        JPanel p = new JPanel(new GridLayout(2, 1, 5, 5));
        
        
        p.add(makeTitlePanel(textField01, "Override: JTextField#paintComponent(...)"));
        p.add(makeTitlePanel(textField02, "setBorder(new RoundedCornerBorder())"));
        add(p);
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        setPreferredSize(new Dimension(320, 200));
    }
    private JComponent makeTitlePanel(JComponent cmp, String title) {
        JPanel p = new JPanel(new GridBagLayout());
        
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1d;
        c.fill    = GridBagConstraints.HORIZONTAL;
        c.insets  = new Insets(5, 5, 5, 5);
        p.add(cmp, c);
        p.setBorder(BorderFactory.createTitledBorder(title));
        return p;
    }
    public static void main(String... args) {
        try {
    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
            UIManager.setLookAndFeel(info.getClassName());
            break;
        }
    }
} catch (Exception e) {
    // If Nimbus is not available, you can set the GUI to another look and feel.
}
        
        EventQueue.invokeLater(new Runnable() {
            @Override public void run() {
                createAndShowGUI();
            }
        });
    }
    public static void createAndShowGUI() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException
               | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        JFrame frame = new JFrame("@title@");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(new MainPanel());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

class RoundedCornerBorder extends AbstractBorder {
    @Override public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int r = height - 1;
        RoundRectangle2D round = new RoundRectangle2D.Float(x, y, width - 1, height - 1, r, r);
        Container parent = c.getParent();
        if (parent != null) {
            g2.setColor(parent.getBackground());
            Area corner = new Area(new Rectangle2D.Float(x, y, width, height));
            corner.subtract(new Area(round));
            g2.fill(corner);
        }
        g2.setColor(Color.GRAY);
        g2.draw(round);
        g2.dispose();
    }
    @Override public Insets getBorderInsets(Component c) {
        return new Insets(4, 8, 4, 8);
    }
    @Override public Insets getBorderInsets(Component c, Insets insets) {
        insets.set(4, 8, 4, 8);
        return insets;
    }
}