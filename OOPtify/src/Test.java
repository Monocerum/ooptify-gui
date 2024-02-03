import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

class Test extends JButton {
    public Test(String label) {
        super(label);
        setContentAreaFilled(false);
    }

    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(Color.lightGray);
        } else {
            g.setColor(getBackground());
        }
        g.fillRoundRect(0, 0, getSize().width - 1, getSize().height - 1, 20, 20);

        super.paintComponent(g);
    }

    protected void paintBorder(Graphics g) {
        g.setColor(getForeground());
        g.drawRoundRect(0, 0, getSize().width - 1, getSize().height - 1, 20, 20);
    }

    Shape shape;

    public boolean contains(int x, int y) {
        if (shape == null || !shape.getBounds().equals(getBounds())) {
            shape = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
        }
        return shape.contains(x, y);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Round Button Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Test roundButton = new Test("Click me!");
            roundButton.setPreferredSize(new Dimension(150, 50));

            frame.getContentPane().setLayout(new FlowLayout());
            frame.getContentPane().add(roundButton);

            frame.setSize(200, 100);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
