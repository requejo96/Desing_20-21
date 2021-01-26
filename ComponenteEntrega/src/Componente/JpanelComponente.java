/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componente;

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
    
}
