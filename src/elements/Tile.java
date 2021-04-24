package elements;

import main.Config;
import javax.swing.*;
import java.awt.*;

public class Tile extends JComponent {
    int x,y;
    public Tile(int x, int y) {
        this.x = x;
        this.y = y;
        setBounds(Config.getTile_Size()*x,Config.getTile_Size()*y,Config.getTile_Size(),Config.getTile_Size());
        if((x+y)%2==0)
            setBackground(new Color(128, 0, 255, 190));
        else
            setBackground(new Color(2, 114, 0, 174));
    }
//    @Override
//    public void paint(Graphics g) {
//        super.paint(g);
//    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
