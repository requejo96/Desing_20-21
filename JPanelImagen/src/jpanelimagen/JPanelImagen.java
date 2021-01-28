package jpanelimagen;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JPanelImagen extends JPanel implements Serializable {
    
    private ImagenFondo imagenFondo;
       
    public JPanelImagen() {
        
       
                
    }
    
    public ImagenFondo getImagenFondo() {
        return imagenFondo;
    }

    public void setImagenFondo(ImagenFondo imagenFondo) {
        this.imagenFondo = imagenFondo;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics grphcs){
        super.paintComponent(grphcs); 
        if (imagenFondo!=null) {
            if (imagenFondo.getRutaImagen()!=null && imagenFondo.getRutaImagen().exists()) {
                ImageIcon imageIcon = new ImageIcon(imagenFondo.getRutaImagen().getAbsolutePath()); 
                Graphics2D g2d = (Graphics2D)grphcs;
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, imagenFondo.getOpacidad()));
                grphcs.drawImage(imageIcon.getImage(), 0,0,null);
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));
           }
        }
    }

}
