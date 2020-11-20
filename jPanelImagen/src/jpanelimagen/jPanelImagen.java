/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanelimagen;

import java.io.Serializable;
import javax.swing.JPanel;

/**
 *
 * @author Requejo
 */
public class jPanelImagen extends JPanel implements Serializable 
{
    
    private String rutaImagen;
    
    public jPanelImagen()
    {
    
        
    
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
    
}
