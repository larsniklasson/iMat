/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.border.MatteBorder;

/**
 *
 * @author Lasse
 */
public class MyCellRenderer extends DefaultListCellRenderer{
    int myindex = -1;
    
    
    public MyCellRenderer(JList list){
        list.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
                myindex = -1;
                list.repaint();
            }
        });
        
        list.addMouseMotionListener(new MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent e) {
                
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                myindex = list.locationToIndex(e.getPoint());
                list.repaint();
            }
        });
        
        
    }
    
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus){
        
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

        
        
        Color bg = Color.red;
        if(isSelected){
            setBackground(new Color(240,255,240));
            setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(230,230,230)), BorderFactory.createEmptyBorder(0, 5, 0, 5)));

        } else {
            setBackground(Color.white);
            

        }
        
        if(index == myindex){
            setText("<html><u>" + value.toString() + "</u></html>");
        }
        
        setOpaque(true); // otherwise, it's transparent
        return this;  // DefaultListCellRenderer derived from JLabel, DefaultListCellRenderer.getListCellRendererComponent returns this as well.
    }
}