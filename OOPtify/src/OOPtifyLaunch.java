import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.IOException;

public class OOPtifyLaunch extends JFrame implements ActionListener {
    JPanel pnlCenter;
    JLabel lblImage, lblIcon, lblTitle, lblHome;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem icon, title;
    ImageIcon logo = new ImageIcon("images/Spotify_logo.png");
    ImageIcon logoBlk = new ImageIcon("images/Spotify.png");
    Image resizedIcon = logoBlk.getImage().getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
    ImageIcon menuLogo = new ImageIcon(resizedIcon);

    OOPtifyLaunch()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900, 800);
        this.setIconImage(logo.getImage());
        this.getContentPane().setBackground(new Color(33, 33, 33));
        this.setTitle("OOPtify");
        this.setResizable(false);

        this.setLayout(new BorderLayout());

        menuBar = new JMenuBar();
        menuBar.setPreferredSize(new Dimension(800, 60));
        menuBar.setBackground(new Color(29, 185, 84));
        menuBar.setBorderPainted(false);
        menu = new JMenu();
        icon = new JMenuItem();

        menuBar.setLayout(new FlowLayout(FlowLayout.LEADING, 18, 10));

        lblIcon = new JLabel(menuLogo);
        lblTitle = new JLabel("OOPtify");
        lblTitle.setForeground(Color.black);
        lblTitle.setFont(new Font("Gotham-Black", Font.PLAIN, 15));

        icon.setIcon(menuLogo);

        menuBar.add(lblIcon);
        menuBar.add(lblTitle);

        this.setJMenuBar(menuBar);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

    }

    public static void main(String[] args) throws IOException {
        
        new OOPtifyLaunch();

    }
}
