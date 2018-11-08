
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class dibujo extends JPanel{
    
    int x =0, y=0;
    
    @Override
    public void paintComponent(Graphics g)
    {   g.setColor(Color.ORANGE);
        g.fillRect(x, y, 100, 100);
    
    }
}