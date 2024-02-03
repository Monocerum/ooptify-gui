import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OOPtifyMain extends JFrame implements ActionListener, ItemListener {
    JPanel pnlLeft, pnlRight, pnlInRight;
    JLabel lblImage, lblIcon, lblTitle;
    JButton btnHome;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem icon, title;
    ImageIcon logo = new ImageIcon("images/Spotify_logo.png");
    ImageIcon logoBlk = new ImageIcon("images/Spotify.png");
    Image resizedIcon = logoBlk.getImage().getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
    ImageIcon menuLogo = new ImageIcon(resizedIcon);

    public OOPtifyMain() {
        // MENU BAR
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900, 800);
        this.setIconImage(logo.getImage());
        this.getContentPane().setBackground(new Color(33, 33, 33));
        this.setTitle("OOPtify");
        this.setResizable(false);

        menuBar = new JMenuBar();
        menuBar.setPreferredSize(new Dimension(800, 60));
        menuBar.setBackground(new Color(29, 185, 84));
        menuBar.setBorderPainted(false);
        menu = new JMenu();
        icon = new JMenuItem();

        menuBar.setLayout(new GridBagLayout());
        GridBagConstraints lgbc = new GridBagConstraints();
        lgbc.fill = GridBagConstraints.HORIZONTAL;
        lgbc.anchor = GridBagConstraints.WEST;
        lgbc.insets = new Insets(5, 5, 5, 5);
        lgbc.weightx = 1.0;

        pnlLeft = new JPanel(new FlowLayout(FlowLayout.LEADING, 18, 10));
        pnlInRight = new JPanel(new FlowLayout(FlowLayout.TRAILING, 18, 15));
        pnlRight = new JPanel(new FlowLayout(FlowLayout.TRAILING, 0, 0));

        btnHome = new JButton("Home");
        lblIcon = new JLabel(menuLogo);
        lblTitle = new JLabel("OOPtify");
        lblTitle.setForeground(Color.black);
        lblTitle.setFont(new Font("Gotham-Black", Font.PLAIN, 18));

        icon.setIcon(menuLogo);

        pnlLeft.add(lblIcon);
        pnlLeft.add(lblTitle);
        pnlLeft.setBackground(new Color(29, 185, 84));

        menuBar.add(pnlLeft, lgbc);
        lgbc.gridx = 0;
        lgbc.gridy = 0;
        lgbc.gridwidth = 2;

        GridBagConstraints rgbc = new GridBagConstraints();
        rgbc.fill = GridBagConstraints.HORIZONTAL;
        rgbc.anchor = GridBagConstraints.EAST;
        rgbc.insets = new Insets(5, 5, 5, 5);

        pnlInRight.setBackground(new Color(29, 167, 78));
        pnlInRight.add(btnHome);

        btnHome.setBorderPainted(false);
        btnHome.setContentAreaFilled(false);
        btnHome.setFocusable(false);
        btnHome.setOpaque(false);
        btnHome.setFont(new Font("Gotham-Bold", Font.PLAIN, 18));

        btnHome.addActionListener(this);

        pnlRight.setPreferredSize(new Dimension(900 / 6, 60));
        pnlRight.add(pnlInRight, BorderLayout.CENTER);
        pnlRight.setOpaque(false);

        menuBar.add(pnlRight, rgbc);

        this.setJMenuBar(menuBar);
        this.setVisible(true);

        setLayout(null);

        // JUSTIN PART
        
        JLabel lblUser = new JLabel("USERNAME");
        JLabel lblDate = new JLabel("--/--/----");
        JLabel lblCat = new JLabel("Category");
        JLabel lblTimeP = new JLabel("Time Period");
        JLabel lblLength = new JLabel("Length");
        
        JComboBox<String> ComBCat = new JComboBox<>();
        ComBCat.addItem("Top Tracks");
        ComBCat.addItem("Top Artists");
        ComBCat.addItem("Top Genres");
        
        JCheckBox TP1 = new JCheckBox("Last Month");
        JCheckBox TP2 = new JCheckBox("Last 6 Months");
        JCheckBox TP3 = new JCheckBox("Last Year");
        
        JCheckBox Len1 = new JCheckBox("Top 10");
        JCheckBox Len2 = new JCheckBox("Top 50");
        
        
        // JOHN GLAY PART
        JLabel lblNum = new JLabel("#");
        JLabel lblTitle = new JLabel("TITLE");
        JLabel lblArtists = new JLabel("ARTIST", JLabel.RIGHT);
        JLabel lblDuration = new JLabel("PLAYS", JLabel.RIGHT);

        add(lblNum);
        add(lblTitle);
        add(lblArtists);
        add(lblDuration);

        lblNum.setFont(new Font("Gotham-Black", Font.BOLD, 16));
        lblTitle.setFont(new Font("Gotham-Black", Font.BOLD, 16));
        lblArtists.setFont(new Font("Gotham-Black", Font.BOLD, 16));
        lblDuration.setFont(new Font("Gotham-Black", Font.BOLD, 16));

        lblNum.setBounds(63, 40, 60, 40);
        lblTitle.setBounds(120, 40, 200, 40);
        lblArtists.setBounds(340, 40, 220, 40);
        lblDuration.setBounds(570, 40, 255, 40);

        int yOffset = 100; // Initial y-coordinate
        int topLen = 10;

        for (int i = 1; i <= topLen; i++) {
            JLabel lblRank = new JLabel(String.format("%02d", i));
            JLabel lblSong = new JLabel("Song Title " + String.format("%02d", i));
            JLabel lblArtist = new JLabel("Name of the Artist", JLabel.RIGHT);
            JLabel lblPlays = new JLabel("0000", JLabel.RIGHT);

            add(lblRank);
            add(lblSong);
            add(lblArtist);
            add(lblPlays);

            lblRank.setBounds(60, yOffset, 60, 40);
            lblSong.setBounds(120, yOffset, 200, 40);
            lblArtist.setBounds(340, yOffset, 220, 40);
            lblPlays.setBounds(570, yOffset, 254, 40);

            lblRank.setFont(new Font("Gotham-Black", Font.PLAIN, 14));
            lblSong.setFont(new Font("Gotham-Black", Font.PLAIN, 14));
            lblArtist.setFont(new Font("Gotham-Black", Font.PLAIN, 14));
            lblPlays.setFont(new Font("Gotham-Black", Font.PLAIN, 14));

            yOffset += 45; // Increase y-coordinate for the next set of labels
        }

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

        if (e.getSource() == btnHome) {
            new OOPtifyLaunch();
            dispose();
        }

    }

    @Override // white line
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.GRAY);
        g.drawLine(60, 131, getWidth() - 60, 131);

        g.setColor(Color.GRAY);
        g.drawLine(60, 170, getWidth() - 60, 170);
    }
}