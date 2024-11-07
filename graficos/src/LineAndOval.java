import javax.swing.*;
import java.awt.*;

public class LineAndOval extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Draw a line
        g.drawLine(50, 50, 200, 50);
        
        // Draw an oval
        g.drawOval(100, 100, 150, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        LineAndOval panel = new LineAndOval();
        
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}