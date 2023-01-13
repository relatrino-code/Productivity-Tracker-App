/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

/**
 *
 * @author QAISER AFTAB
 */
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;

/**
 *
 * @author QAISER AFTAB
 */
public class Cell extends JButton{
    public Cell(){
        setContentAreaFilled(false);
        setBorder(BorderFactory.createMatteBorder(1,1, 1, 1, Color.black));
        
}
}