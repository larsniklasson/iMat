/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.plaf.metal.MetalScrollBarUI;

/**
 *
 * @author Lasse
 */
public class MyScrollbarUI2 extends BasicScrollBarUI{
    
      boolean isPressed = false;
      
      
    public MyScrollbarUI2() {
        
        
    }

    @Override
    protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {        
        
        
        c.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                isPressed = true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                isPressed = false;
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                c.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                c.repaint();
            }
        });
        
        Point ls = c.getLocationOnScreen();
        Rectangle scrollbar = new Rectangle(ls.x, ls.y, c.getBounds().width, c.getBounds().height);
        Point mouse = MouseInfo.getPointerInfo().getLocation();
        
        
        if(scrollbar.contains(mouse) || isPressed){
            g.setColor(new Color(200, 200, 200));
            
        } else {
            g.setColor(new Color(220,220,220));
        }
        
        
        g.fillRect(thumbBounds.x, thumbBounds.y, thumbBounds.width, thumbBounds.height);
        
    }

    @Override
    protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {        
        
        
        g.setColor(new Color(245,245,245));
        g.fillRect(trackBounds.x, trackBounds.y, trackBounds.width, trackBounds.height);
    }
    
    
    @Override
    protected JButton createDecreaseButton(int orientation) {
        JButton b = new JButton();
        Icon i = new ImageIcon("src/imat/resources/bilder/scrollbarup.png");
        Icon ii = new ImageIcon("src/imat/resources/bilder/scrollbaruphover.png");
        
        b.setIcon(i);
        b.setRolloverIcon(ii);
        b.setSelectedIcon(ii);
        
        b.setBorderPainted(false);
        b.setBorder(null);
        b.setContentAreaFilled(false);
        b.setPreferredSize(new Dimension(13,17));
        
        return b;
    }

    @Override
    protected JButton createIncreaseButton(int orientation) {
        JButton b = new JButton();
        Icon i = new ImageIcon("src/imat/resources/bilder/scrollbardown.png");
        Icon ii = new ImageIcon("src/imat/resources/bilder/scrollbardownhover.png");
        
        b.setIcon(i);
        b.setRolloverIcon(ii);
        b.setSelectedIcon(ii);
        
        b.setBorderPainted(false);
        b.setBorder(null);
        b.setContentAreaFilled(false);
        b.setPreferredSize(new Dimension(13,17));
        
        return b;
    }
    

  }
  
  