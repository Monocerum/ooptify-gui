import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OOPtifyMain extends JFrame implements ActionListener, ItemListener {

    public OOPtifyMain() {
        setLayout(null);

        // JUSTIN PART

        
        // JOHN GLAY PART
        JLabel lblNum = new JLabel("#");
        JLabel lblTitle = new JLabel("Title");
        JLabel lblArtists = new JLabel("Artist");
        JLabel lblDuration = new JLabel("Duration");

        add(lblNum);
        add(lblTitle);
        add(lblArtists);
        add(lblDuration);

        lblNum.setFont(new Font("Gotham-Black", Font.BOLD, 18));
        lblTitle.setFont(new Font("Gotham-Black", Font.BOLD, 18));
        lblArtists.setFont(new Font("Gotham-Black", Font.BOLD, 18));
        lblDuration.setFont(new Font("Gotham-Black", Font.BOLD, 18));

        lblNum.setBounds(60, 60, 195, 50);
        lblTitle.setBounds(255, 60, 195, 50);
        lblArtists.setBounds(450, 60, 195, 50);
        lblDuration.setBounds(755, 60, 195, 50);

        JLabel lblRank = new JLabel("01");
        JLabel lblSong = new JLabel("Song 01");
        JLabel lblArtist = new JLabel("Song 01");
        JLabel lblPlays = new JLabel("0000");

        add(lblRank);
        add(lblSong);
        add(lblArtist);
        add(lblPlays);

        lblRank.setBounds(60, 120, 195, 50);
        lblSong.setBounds(255, 120, 195, 50);
        lblArtist.setBounds(450, 120, 195, 50);
        lblPlays.setBounds(755, 120, 195, 50);

        lblRank.setFont(new Font("Gotham-Black", Font.PLAIN, 14));
        lblSong.setFont(new Font("Gotham-Black", Font.PLAIN, 14));
        lblArtist.setFont(new Font("Gotham-Black", Font.PLAIN, 14));
        lblPlays.setFont(new Font("Gotham-Black", Font.PLAIN, 14));

        getContentPane().setBackground(Color.decode("#212121"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws Exception {
        UIManager.put("Label.foreground", Color.WHITE); // To make the text color white
        SwingUtilities.invokeLater(() -> {
            OOPtifyMain frame = new OOPtifyMain();
            frame.setSize(900, 800); // Set an initial size
            frame.setLocationRelativeTo(null); // Center the frame on the screen
            frame.setVisible(true);
        });
    }

    public void itemStateChanged(ItemEvent e) {
        // JUSTIN PART

        // JOHN GLAY PART

    }

    public void actionPerformed(ActionEvent e) {
        // JUSTIN PART

        // JOHN GLAY PART

    }

    @Override // white line
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.WHITE);
        g.drawLine(60, 60, getWidth() - 60, 60);
    }
}