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
        this.setSize(1200, 1100);
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
        
        ImageIcon User = new ImageIcon("images/user.png");
        
        
        JLabel lblUser = new JLabel("USERNAME");
        JLabel lblDate = new JLabel("mm/dd/yyyy");
        JLabel lblCat = new JLabel("Category");
        JLabel lblYr = new JLabel("Year");
        JLabel lblLength = new JLabel("Length");
        
        JComboBox<String> ComBCat = new JComboBox<>();
        ComBCat.addItem("Top Tracks");
        ComBCat.addItem("Top Artists");
        
        JRadioButton YB1 = new JRadioButton("2023");
        JRadioButton YB2 = new JRadioButton("2022");
        JRadioButton YB3 = new JRadioButton("All Time");
        
        JRadioButton LENB1 = new JRadioButton("Top 10");
        JRadioButton LENB2 = new JRadioButton("Top 50");
        
        //Labelling
        add(lblUser);
        add(lblDate);
        add(lblCat);
        add(lblYr);
        add(lblLength);
        
        lblUser.setFont(new Font("Gotham-Black", Font.BOLD, 64));
        lblDate.setFont(new Font("Gotham-Black", Font.BOLD, 32));
        lblCat.setFont(new Font("Gotham-Black", Font.BOLD, 18));
        lblYr.setFont(new Font("Gotham-Black", Font.BOLD, 18));
        lblLength.setFont(new Font("Gotham-Black", Font.BOLD, 18));

        lblUser.setBounds(345, 25, 750, 100);
        lblDate.setBounds(350, 80, 200, 100);
        lblCat.setBounds(350, 170, 100, 40);
        lblYr.setBounds(575, 170, 100, 40);
        lblLength.setBounds(840, 170, 100, 40);
        
        //Radio Buttons
        add(YB1);
        add(YB2);
        add(YB3);
        add(LENB1);
        add(LENB2);
        
        YB1.setForeground(java.awt.Color.WHITE);
        YB1.setContentAreaFilled(false);
        YB2.setForeground(java.awt.Color.WHITE);
        YB2.setContentAreaFilled(false);
        YB3.setForeground(java.awt.Color.WHITE);
        YB3.setContentAreaFilled(false);
        LENB1.setForeground(java.awt.Color.WHITE);
        LENB1.setContentAreaFilled(false);
        LENB2.setForeground(java.awt.Color.WHITE);
        LENB2.setContentAreaFilled(false);
        
        YB1.setFont(new Font("Gotham-Light", Font.PLAIN, 15));    
        YB2.setFont(new Font("Gotham-Light", Font.PLAIN, 15));
        YB3.setFont(new Font("Gotham-Light", Font.PLAIN, 15));
        LENB1.setFont(new Font("Gotham-Light", Font.PLAIN, 15));
        LENB2.setFont(new Font("Gotham-Light", Font.PLAIN, 15));
        
        YB1.setBounds(570, 200, 100, 45);
        YB2.setBounds(645, 200, 100, 45);
        YB3.setBounds(720, 200, 100, 45);
        LENB1.setBounds(835, 200, 100, 45);
        LENB2.setBounds(910, 200, 100, 45);
      
        
        //ComboBox
        add(ComBCat);
        
        ComBCat.setFont(new Font("Gotham-Light", Font.PLAIN, 15));
        ComBCat.setBounds(350, 210, 170, 25);

        
        // JOHN GLAY PART
        JLabel lblNum = new JLabel("#");
        JLabel lblSongTitle = new JLabel("TITLE");
        JLabel lblArtists = new JLabel("ARTIST", JLabel.RIGHT);
        JLabel lblDuration = new JLabel("PLAYS", JLabel.RIGHT);

        add(lblNum);
        add(lblSongTitle);
        add(lblArtists);
        add(lblDuration);

        lblNum.setFont(new Font("Gotham-Black", Font.BOLD, 16));
        lblSongTitle.setFont(new Font("Gotham-Black", Font.BOLD, 16));
        lblArtists.setFont(new Font("Gotham-Black", Font.BOLD, 16));
        lblDuration.setFont(new Font("Gotham-Black", Font.BOLD, 16));

        lblNum.setBounds(63, 295, 60, 40);
        lblSongTitle.setBounds(120, 295, 200, 40);
        lblArtists.setBounds(290, 295, 220, 40);
        lblDuration.setBounds(590, 295, 255, 40);

        int yOffset = 345; // Initial y-coordinate
        int topLen = 50;

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
            frame.setSize(1200, 1100); // Set an initial size
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
        g.drawLine(60, 385, getWidth() - 60, 385);
        
        g.setColor(Color.GRAY);
        g.drawLine(60, 425, getWidth() - 60, 425);   
    }
}