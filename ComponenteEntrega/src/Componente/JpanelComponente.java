/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componente;

import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;
import javax.swing.JPanel;

/**
 *
 * @author Requejo
 */
public class JpanelComponente extends JPanel implements Serializable
{
    
    private String color;
    
    
    public JpanelComponente()
    {
    
        
        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void paint(Graphics grphcs) 
    {
        
        super.paint(grphcs); 
        
        if(color=="amarillo")
        {
        
            grphcs.setColor(Color.yellow);
            
        }else if(color=="azul")
        {
        
            grphcs.setColor(Color.blue);
            
        }else if(color=="rojo")
        {
        
            grphcs.setColor(Color.red);
            
        }
        
        grphcs.drawOval(20, 20, 20, 20);
        
        
    }

    
    
    
    
}
