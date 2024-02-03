import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OOPtifyMain extends JFrame implements ActionListener {

    public OOPtifyMain() {
        setLayout(null);

        // JUSTIN PART

        // JOHN GLAY PART

        getContentPane().setBackground(Color.decode("#212121"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(() -> {
            OOPtifyMain frame = new OOPtifyMain();
            frame.setSize(900, 800); // Set an initial size
            frame.setLocationRelativeTo(null); // Center the frame on the screen
            frame.setVisible(true);
        });
    }

    public void itemStateChanged(ActionEvent e) {

    }

    public void actionPerformed(ActionEvent e) {

    }
}