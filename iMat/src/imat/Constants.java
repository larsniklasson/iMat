/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author Lasse
 */
public class Constants {
    public static final Color NICE_GREEN = new Color(0,153,75);
    
    public static final Color BACKGROUND = new Color(239,239,239);
    
    public static final Color TOP_PANEL_BACKGROUND = NICE_GREEN;
    public static final Color TREE_SELECTION_BACKGROUND = NICE_GREEN;
    public static final Color BUY_BUTTON_COLOR = NICE_GREEN;
    public static final Color CHECK_OUT_BUTTON_COLOR = NICE_GREEN; //till kassan
    
    public static final Color MAIN_PANEL_INSIDE_BORDER_COLOR = new Color(153,153,153);
    public static final Color MAIN_PANEL_OUTSIDE_BORDER_COLOR = new Color(230,230,230);
    
    public static final Border MAIN_PANEL_INSIDE_BORDER = BorderFactory.createLineBorder(MAIN_PANEL_INSIDE_BORDER_COLOR);
    public static final Border MAIN_PANEL_OUTSIDE_BORDER = BorderFactory.createLineBorder(MAIN_PANEL_OUTSIDE_BORDER_COLOR,2);
    
    public static final Border MAIN_PANEL_BORDER = BorderFactory.createCompoundBorder(MAIN_PANEL_OUTSIDE_BORDER, MAIN_PANEL_INSIDE_BORDER);
    
}
