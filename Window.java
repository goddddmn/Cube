import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Cube cube;
    public Window (Cube cube){
        this.cube=cube;
        this.setTitle("Cube");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    @Override
    public void paint(Graphics graphics){
        graphics.translate(250,250);
        graphics.drawLine(-250,0,250,0);
        graphics.drawLine(0,250,0,250);
        cube.draw(graphics);
    }
}
