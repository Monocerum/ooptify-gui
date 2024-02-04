import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;

public class OOPtifyMain extends JFrame implements ActionListener, ItemListener {
    JPanel pnlLeft, pnlRight, pnlInRight;
    JLabel lblImage, lblIcon, lblTitle, lblPage;
    JButton btnHome;
    RoundButton btnPrevious, btnNext;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem icon, title;
    ImageIcon logo = new ImageIcon("images/Spotify_logo.png");
    ImageIcon logoBlk = new ImageIcon("images/Spotify.png");
    Image resizedIcon = logoBlk.getImage().getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
    ImageIcon menuLogo = new ImageIcon(resizedIcon);

    //Justin Part (Leaked Constructor Moment)
    JRadioButton YB1, YB2, YB3, LENB1, LENB2;
    JComboBox<String> ComBCat;
        
    public OOPtifyMain() {
        // MENU BAR
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200, 1000);
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

        lblPage = new JLabel("1/1");

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

        setLayout(null);

        // JUSTIN PART
        ImageIcon UserIcon = new ImageIcon("images/user.png");
                
        JLabel lblUserIcon = new JLabel(UserIcon);
        JLabel lblUser = new JLabel("USERNAME");
        JLabel lblDate = new JLabel("mm/dd/yyyy");
        JLabel lblCat = new JLabel("Category");
        JLabel lblYr = new JLabel("Year");
        JLabel lblLength = new JLabel("Length");
  
        ComBCat = new JComboBox<>();
        ComBCat.addItem("Top Tracks");
        ComBCat.addItem("Top Artists");
        
        ButtonGroup Year = new ButtonGroup();
        ButtonGroup Length = new ButtonGroup();
        
        YB1 = new JRadioButton("2023");
        YB2 = new JRadioButton("2022");
        YB3 = new JRadioButton("All Time");
        
        LENB1 = new JRadioButton("Top 10");
        LENB2 = new JRadioButton("Top 50");
        
        //Labelling
        add(lblUserIcon);
        add(lblUser);
        add(lblDate);
        add(lblCat);
        add(lblYr);
        add(lblLength);
        
        lblUser.setFont(new Font("Gotham-BLACK", Font.PLAIN, 64));
        lblDate.setFont(new Font("Gotham", Font.BOLD, 24));
        lblCat.setFont(new Font("Gotham", Font.BOLD, 17));
        lblYr.setFont(new Font("Gotham", Font.BOLD, 17));
        lblLength.setFont(new Font("Gotham", Font.BOLD, 17));

        lblUserIcon.setBounds(125, 45, 200, 200);
        lblUser.setBounds(345, 25, 750, 100);
        lblDate.setBounds(350, 80, 200, 100);
        lblCat.setBounds(350, 170, 100, 40);
        lblYr.setBounds(575, 170, 100, 40);
        lblLength.setBounds(840, 170, 100, 40);
        
        //Radio Buttons
        Year.add(YB1);
        Year.add(YB2);
        Year.add(YB3);
        Length.add(LENB1);
        Length.add(LENB2);
        
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
        
        YB1.setBounds(570, 200, 70, 45);
        YB2.setBounds(645, 200, 70, 45);
        YB3.setBounds(720, 200, 90, 45);
        LENB1.setBounds(835, 200, 90, 45);
        LENB2.setBounds(930, 200, 90, 45);

        YB1.setFocusable(false);
        YB2.setFocusable(false);
        YB3.setFocusable(false);
        LENB1.setFocusable(false);
        LENB2.setFocusable(false);
    
        YB1.addActionListener(this);
        YB2.addActionListener(this);
        YB3.addActionListener(this);
        LENB1.addActionListener(this);
        LENB2.addActionListener(this);
                
        YB1.setSelected(true);
        LENB1.setSelected(true);
        
        YB1.doClick();
        LENB1.doClick();
        
        //ComboBox
        add(ComBCat);
        
        ComBCat.setFont(new Font("Gotham-Light", Font.PLAIN, 15));
        ComBCat.setBounds(350, 210, 170, 25);

        ComBCat.setSelectedItem("Top Tracks");
        
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
        lblSongTitle.setBounds(150, 295, 200, 40);
        lblArtists.setBounds(290, 295, 220, 40);
        lblDuration.setBounds(590, 295, 255, 40);

        int yOffset = 345; // Initial y-coordinate
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
            lblSong.setBounds(150, yOffset, 200, 40);
            lblArtist.setBounds(340, yOffset, 220, 40);
            lblPlays.setBounds(570, yOffset, 254, 40);

            lblRank.setFont(new Font("Gotham", Font.BOLD, 14));
            lblSong.setFont(new Font("Gotham", Font.BOLD, 14));
            lblArtist.setFont(new Font("Gotham", Font.PLAIN, 14));
            lblPlays.setFont(new Font("Gotham", Font.PLAIN, 14));

            yOffset += 45; // Increase y-coordinate for the next set of labels
        }

        getContentPane().setBackground(Color.decode("#212121"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnPrevious = new RoundButton("Previous");
        btnNext = new RoundButton("Next");

        btnPrevious.setBounds(900, 800, 100, 50);
        btnPrevious.setFont(new Font("Gotham", Font.BOLD, 17));
        btnNext.setBounds(1020, 800, 100, 50);
        btnNext.setFont(new Font("Gotham", Font.BOLD, 17));

        btnPrevious.addActionListener(this);
        btnNext.addActionListener(this);

        
        lblPage.setFont(new Font("Gotham", Font.PLAIN, 15));
        lblPage.setBounds(1095, 842, 100, 50);

        this.add(btnPrevious);
        this.add(btnNext);
        this.add(lblPage);

        this.repaint();
        this.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        UIManager.put("Label.foreground", Color.WHITE); // To make the text color white
        SwingUtilities.invokeLater(() -> {
            OOPtifyMain frame = new OOPtifyMain();
            frame.setSize(1200, 1000); // Set an initial size
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
        
        if (YB1.isSelected()){
            /*add arguments for when 2023 is selected*/
         }
        
        if (YB2.isSelected()){
            /*add arguments for when 2022 is selected*/
         }
                  
        if (YB3.isSelected()){
            /*add arguments for when All Time is selected*/
         }
        
        if (LENB1.isSelected()){
            // disable btnPrevious and btnNext if selected
            lblPage.setText("1/1");
            /*add arguments for when Top 10 is selected*/
         }
        
        if (LENB2.isSelected()){
            // enable btnPrevious and btnNext depending on current page if selected
            // set lblPaget to n/5
            lblPage.setText("n/5");
            /*add arguments for when Top 50 is selected*/
         }
        
        String selectedValue = ComBCat.getSelectedItem().toString();
        
        //Still having issues with not updating unless a radio button is pressed
        if ("Top Tracks".equals(selectedValue)) {
        
            //For Top Tracks arguments
            
        } 
        
        else if ("Top Artists".equals(selectedValue)) {
        
            //For Top Artists arguments
        }
        // JOHN GLAY PART

        if (e.getSource() == btnPrevious) {
            // If page 1, disable
        }

        if (e.getSource() == btnNext) {
            // If page 5, disable
        }

        if (e.getSource() == btnHome) {
            new OOPtifyLaunch();
            dispose();
        }

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        // white line
        g.setColor(Color.GRAY);
        g.drawLine(60, 385, getWidth() - 60, 385);
        
        g.setColor(Color.GRAY);
        g.drawLine(60, 425, getWidth() - 60, 425); 
    }
    
    class RoundButton extends JButton {
    
        public RoundButton(String text) 
        {
            super(text); // Invoke superclass (JButton)
            setContentAreaFilled(false);
            setFocusPainted(false);
            setBorderPainted(false);
        }
    
        @Override
        public void paint(Graphics btn) 
        {
            Graphics2D btn1 = (Graphics2D) btn.create();
            btn1.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            
            btn1.setColor(new Color(29, 185, 84));
            btn1.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 25, 25);

            RoundRectangle2D btnRound = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 25, 25);

            btn1.draw(btnRound);

            btn1.setColor(getForeground());
            btn1.drawString(getText(), (getWidth() - btn1.getFontMetrics().stringWidth(getText())) / 2, (getHeight() + btn1.getFontMetrics().getAscent() - btn1.getFontMetrics().getDescent()) / 2);
    
            btn1.dispose();
        }
    }
}