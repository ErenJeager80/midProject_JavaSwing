package elements;

import main.Config;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Bead extends JComponent{
    int x, y;

    public Bead(int x, int y) {
        this.x = x;
        this.y = y;
        setBounds(Config.getTile_Size()*x + 5,Config.getTile_Size()*y + 5,Config.getTile_Size(),Config.getTile_Size());
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        Ellipse2D[] ellipse2D = new Ellipse2D[Config.getBeadCount()];
        ellipse2D[0] = new Ellipse2D.Double(x, y, 30, 30);
        graphics2D.setPaint(new Color(10*x, 6*y, 255));
        graphics2D.fill(ellipse2D[0]);
        graphics2D.draw(ellipse2D[0]);
        super.paint(g);
    }

    @Override
    public Dimension getPreferredSize() {
        return super.getPreferredSize();
    }
}
