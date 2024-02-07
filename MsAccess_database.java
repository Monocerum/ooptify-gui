package msaccess_database;

import java.sql.*;  
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.time.*;
import java.time.format.*;
public class multiuser extends JFrame implements ActionListener, ItemListener
{
    String[] names = {"Duncan", "Abram", "John Glay", "Roxanne", "Kevin", "Bao"};
    String[] options = {"Duncan", "Abram", "John Glay", "Roxanne", "Kevin", "Bao"};
    Object selected = JOptionPane.showInputDialog(null, "Choose User:", "Usernames", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
    
    JPanel pnlLeft, pnlRight, pnlInRight;
    JLabel lblImage, lblIcon, lblTitle, lblPage;
    JButton btnHome;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem icon, title;
    ImageIcon logo = new ImageIcon("C:\\Users\\Abram\\Documents\\1st Sem (2nd Year College)\\Object Oriented Programming\\Group Presentation\\pics\\Spotify_logo.png");
    ImageIcon logoBlk = new ImageIcon("C:\\Users\\Abram\\Documents\\1st Sem (2nd Year College)\\Object Oriented Programming\\Group Presentation\\pics\\Spotify.png");
    Image resizedIcon = logoBlk.getImage().getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
    ImageIcon menuLogo = new ImageIcon(resizedIcon);

    JLabel lblUser = new JLabel("USERNAME");
    JLabel lblDate = new JLabel("02/08/2024");
    JLabel lblCat = new JLabel("Category");
    JLabel lblYr = new JLabel("Year");
        
    //Justin Part (Leaked Constructor Moment)
    JRadioButton YB0, YB1, YB2, YB3; //LENB1, LENB2;
    JComboBox<String> ComBCat;
    JLabel[] lblRank = {new JLabel("1"),
                        new JLabel("2"),
                        new JLabel("3"),
                        new JLabel("4"),
                        new JLabel("5"),
                        new JLabel("6"),
                        new JLabel("7"),
                        new JLabel("8"),
                        new JLabel("9"),
                        new JLabel("10")};
    JLabel[] lblSong = {new JLabel("Song Title"),
                new JLabel("Song Title"),
                new JLabel("Song Title"),
                new JLabel("Song Title"),
                new JLabel("Song Title"),
                new JLabel("Song Title"),
                new JLabel("Song Title"),
                new JLabel("Song Title"),
                new JLabel("Song Title"),
                new JLabel("Song Title")};
    JLabel[] lblArtist = {new JLabel("Name of the Artist", JLabel.RIGHT),
                new JLabel("Name of the Artist", JLabel.RIGHT),
                new JLabel("Name of the Artist", JLabel.RIGHT),
                new JLabel("Name of the Artist", JLabel.RIGHT),
                new JLabel("Name of the Artist", JLabel.RIGHT),
                new JLabel("Name of the Artist", JLabel.RIGHT),
                new JLabel("Name of the Artist", JLabel.RIGHT),
                new JLabel("Name of the Artist", JLabel.RIGHT),
                new JLabel("Name of the Artist", JLabel.RIGHT),
                new JLabel("Name of the Artist", JLabel.RIGHT)};
            JLabel[] lblPlays = {new JLabel("0000", JLabel.RIGHT),
                new JLabel("0000", JLabel.RIGHT),
                new JLabel("0000", JLabel.RIGHT),
                new JLabel("0000", JLabel.RIGHT),
                new JLabel("0000", JLabel.RIGHT),
                new JLabel("0000", JLabel.RIGHT),
                new JLabel("0000", JLabel.RIGHT),
                new JLabel("0000", JLabel.RIGHT),
                new JLabel("0000", JLabel.RIGHT),
                new JLabel("0000", JLabel.RIGHT)};
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        // white line
        g.setColor(Color.GRAY);
        g.drawLine(60, 385, getWidth() - 60, 385);
        
        g.setColor(Color.GRAY);
        g.drawLine(60, 425, getWidth() - 60, 425); 
    }
            
    multiuser()
    {
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
        lblTitle.setFont(new Font("Aptos", Font.PLAIN, 18));

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
        btnHome.setFont(new Font("Aptos", Font.BOLD, 18));

        btnHome.addActionListener(this);

        pnlRight.setPreferredSize(new Dimension(900 / 6, 60));
        pnlRight.add(pnlInRight, BorderLayout.CENTER);
        pnlRight.setOpaque(false);

        menuBar.add(pnlRight, rgbc);

        this.setJMenuBar(menuBar);

        setLayout(null);

        // JUSTIN PART
        /*ImageIcon Icon = new ImageIcon("C:\\Users\\Abram\\Documents\\1st Sem (2nd Year College)\\Object Oriented Programming\\Group Presentation\\pics\\OOP user.jpg");
        Image resizedUserIcon = Icon.getImage().getScaledInstance(240, 240, java.awt.Image.SCALE_SMOOTH); 
        ImageIcon UserIcon = new ImageIcon(resizedUserIcon);
        JLabel lblUserIcon = new JLabel(UserIcon);*/
        
  
        ComBCat = new JComboBox<>();
        ComBCat.addItem("(Select Category)");
        ComBCat.addItem("Top 10 Tracks");
        ComBCat.addItem("Top 10 Artists");
        
        ButtonGroup Year = new ButtonGroup();
        ButtonGroup Length = new ButtonGroup();
        
        YB0 = new JRadioButton("", true);
        YB1 = new JRadioButton("2023", false);
        YB2 = new JRadioButton("2022", false);
        YB3 = new JRadioButton("All Time", false);
        
        
        lblUser.setText(String.valueOf(selected));
        //Labelling
        //add(lblUserIcon);
        add(lblUser);
        add(lblDate);
        add(lblCat);
        add(lblYr);
        //add(lblLength);
        
        lblUser.setFont(new Font("Aptos", Font.BOLD, 64));
        lblDate.setFont(new Font("Aptos", Font.BOLD, 24));
        lblCat.setFont(new Font("Aptos", Font.BOLD, 17));
        lblYr.setFont(new Font("Aptos", Font.BOLD, 17));
       

        //lblUserIcon.setBounds(125, 45, 200, 200);
        lblUser.setBounds(345, 25, 750, 100);
        lblDate.setBounds(350, 80, 200, 100);
        lblCat.setBounds(350, 170, 100, 40);
        lblYr.setBounds(575, 170, 100, 40);
       
        
        //Radio Buttons
        Year.add(YB0);
        Year.add(YB1);
        Year.add(YB2);
        Year.add(YB3);
       
        
        add(YB1);
        add(YB2);
        add(YB3);
       
        
        YB1.setForeground(java.awt.Color.WHITE);
        YB1.setContentAreaFilled(false);
        YB2.setForeground(java.awt.Color.WHITE);
        YB2.setContentAreaFilled(false);
        YB3.setForeground(java.awt.Color.WHITE);
        YB3.setContentAreaFilled(false);
        
        
        YB1.setFont(new Font("Aptos", Font.PLAIN, 15));    
        YB2.setFont(new Font("Aptos", Font.PLAIN, 15));
        YB3.setFont(new Font("Aptos", Font.PLAIN, 15));
        
        YB1.setBounds(570, 200, 70, 45);
        YB2.setBounds(645, 200, 70, 45);
        YB3.setBounds(720, 200, 90, 45);
        

        YB1.setFocusable(false);
        YB2.setFocusable(false);
        YB3.setFocusable(false);
        
    
        YB1.addActionListener(this); YB1.addItemListener(this);
        YB2.addActionListener(this); YB2.addItemListener(this);
        YB3.addActionListener(this);
        
                
        YB1.setSelected(true);
        
        YB1.doClick();
        
        //ComboBox
        add(ComBCat); ComBCat.addActionListener(this);
        
        ComBCat.setFont(new Font("Aptos", Font.PLAIN, 15));
        ComBCat.setBounds(350, 210, 170, 25);

        ComBCat.setSelectedItem("Top Tracks");
        
        // JOHN GLAY PART
        JLabel lblNum = new JLabel("#");
        JLabel lblSongTitle = new JLabel("TITLE");
        JLabel lblArtists = new JLabel("ARTIST", JLabel.RIGHT);
        JLabel lblDuration = new JLabel("PLAYTIME HOURS", JLabel.RIGHT);

        add(lblNum);
        add(lblSongTitle);
        add(lblArtists);
        add(lblDuration);

        lblNum.setFont(new Font("Aptos", Font.BOLD, 16));
        lblSongTitle.setFont(new Font("Aptos", Font.BOLD, 16));
        lblArtists.setFont(new Font("Aptos", Font.BOLD, 16));
        lblDuration.setFont(new Font("Aptos", Font.BOLD, 16));

        lblNum.setBounds(63, 295, 60, 40);
        lblSongTitle.setBounds(150, 295, 200, 40);
        lblArtists.setBounds(290, 295, 220, 40);
        lblDuration.setBounds(590, 295, 255, 40);

        int yOffset = 345; // Initial y-coordinate
        int topLen = 10;

        for (int i = 0; i < topLen; i++) {
            
            add(lblRank[i]);
            add(lblSong[i]);
            add(lblArtist[i]);
            add(lblPlays[i]);

            lblRank[i].setBounds(60, yOffset, 60, 40);
            lblSong[i].setBounds(150, yOffset, 200, 40);
            lblArtist[i].setBounds(340, yOffset, 220, 40);
            lblPlays[i].setBounds(570, yOffset, 254, 40);

            lblRank[i].setFont(new Font("Aptos", Font.BOLD, 14));
            lblSong[i].setFont(new Font("Aptos", Font.BOLD, 14));
            lblArtist[i].setFont(new Font("Aptos", Font.PLAIN, 14));
            lblPlays[i].setFont(new Font("Aptos", Font.PLAIN, 14));

            yOffset += 45; // Increase y-coordinate for the next set of labels
        }
        getContentPane().setBackground(Color.decode("#212121"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblPage.setFont(new Font("Aptos", Font.PLAIN, 15));
        lblPage.setBounds(1095, 842, 100, 50);

        this.add(lblPage);

        this.repaint();
        this.setVisible(true);
    }
    

    public static void main(String[] args) throws Exception
    {
        UIManager.put("Label.foreground", Color.WHITE); // To make the text color white
        SwingUtilities.invokeLater(() -> {
            multiuser frame = new multiuser();
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
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\Abram\\Documents\\1st Sem (2nd Year College)\\Object Oriented Programming\\Group Presentation\\oop-spotify.accdb");
            
        // JUSTIN PART
        
        String selectedValue = ComBCat.getSelectedItem().toString();
        String username = String.valueOf(selected);
        //Still having issues with not updating unless a radio button is pressed
        if ("Top 10 Tracks".equals(selectedValue)) {
            repaint();
            
            Statement statement;
            ResultSet result;
            
            int i = 0;
            
            //For Top Tracks arguments
            if (YB1.isSelected()){
            /*add arguments for when 2023 is selected*/
            String sql3 = "SELECT TOP 10 song_name, artist_name, (SUM(ms_played) / 1000 / 60 / 60) AS song_playtime_hours\n" +
                "FROM test\n" +
                "WHERE ts >= #01/01/2023# AND username = '" + username + "'\n" +
                "GROUP BY song_name, artist_name\n" +
                "ORDER BY 3 DESC";
            statement = con.createStatement();
            result = statement.executeQuery(sql3);
            
            i = 0;
            
            while(result.next())
            {
                String name = result.getString("artist_name");
                String song = result.getString("song_name");
                String playtime = result.getString("song_playtime_hours");
                //String user = result.getString("username");
                
                //lblUser.setText(user);
                lblSong[i].setText(song);
                lblArtist[i].setText(name);
                lblPlays[i].setText(playtime);
                i++;
            }
        }
        
        if (YB2.isSelected()){
            /*add arguments for when 2022 is selected*/
            String sql4 = "SELECT TOP 10 song_name, artist_name, (SUM(ms_played) / 1000 / 60 / 60) AS song_playtime_hours\n" +
                "FROM test\n" +
                "WHERE ts <= #01/01/2023# AND ts >= #01/01/2022# AND username = '" + username + "'\n" +
                "GROUP BY song_name, artist_name\n" +
                "ORDER BY 3 DESC";
            statement = con.createStatement();
            result = statement.executeQuery(sql4);
            
            i = 0;
            
            while(result.next())
            {
                String name = result.getString("artist_name");
                String song = result.getString("song_name");
                String playtime = result.getString("song_playtime_hours");
                //String user = result.getString("username");
                
                //lblUser.setText(user);
                lblSong[i].setText(song);
                lblArtist[i].setText(name);
                lblPlays[i].setText(playtime);
                i++;
            }
        }
                  
        if (YB3.isSelected()){
            /*add arguments for when All Time is selected*/
            String sql5 = "SELECT TOP 10 song_name, artist_name, (SUM(ms_played) / 1000 / 60 / 60) AS song_playtime_hours\n" +
                "FROM test\n" +
                "WHERE username = '" + username + "'\n" + 
                "GROUP BY song_name, artist_name\n" +
                "ORDER BY 3 DESC";
            statement = con.createStatement();
            result = statement.executeQuery(sql5);
            
            i = 0;
            
            while(result.next())
            {
                String name = result.getString("artist_name");
                String song = result.getString("song_name");
                String playtime = result.getString("song_playtime_hours");
                //String user = result.getString("username");
                
                //lblUser.setText(user);
                lblSong[i].setText(song);
                lblArtist[i].setText(name);
                lblPlays[i].setText(playtime);
                i++;
            }
        }
        } 
        
        else if ("Top 10 Artists".equals(selectedValue)) {
            repaint();
            
            
            Statement statement;
            ResultSet result;
            int i;
            
            if (YB1.isSelected()){
            /*add arguments for when 2023 is selected*/
            String sql3 = "SELECT TOP 10 artist_name, (SUM(ms_played) / 1000 / 60 / 60) AS artist_playtime_hours\n" +
                "FROM test\n" +
                "WHERE ts >= #01/01/2023# AND username = '" + username + "'\n" +
                "GROUP BY artist_name\n" +
                "ORDER BY 2 DESC;";
            statement = con.createStatement();
            result = statement.executeQuery(sql3);
            
            i = 0;
            
            while(result.next())
            {
                String name = result.getString("artist_name");
                //String song = result.getString("song_name");
                String playtime = result.getString("artist_playtime_hours");
                //String user = result.getString("username");
                
                //lblUser.setText(user);
                //lblSong[i].setText(song);
                lblSong[i].setText("");
                lblArtist[i].setText(name);
                lblPlays[i].setText(playtime);
                i++;
            }
        }
        
        if (YB2.isSelected()){
            /*add arguments for when 2022 is selected*/
            String sql4 = "SELECT TOP 10 artist_name, (SUM(ms_played) / 1000 / 60 / 60) AS artist_playtime_hours\n" +
                "FROM test\n" +
                "WHERE ts <= #01/01/2023# AND ts >= #01/01/2022# AND username = '" + username + "'\n" +
                "GROUP BY artist_name\n" +
                "ORDER BY 2 DESC;";
            statement = con.createStatement();
            result = statement.executeQuery(sql4);
            
            i = 0;
            
            while(result.next())
            {
                String name = result.getString("artist_name");
                //String song = result.getString("song_name");
                String playtime = result.getString("artist_playtime_hours");
                //String user = result.getString("username");
                
                //lblUser.setText(user);
                //lblSong[i].setText(song);
                lblSong[i].setText("");
                lblArtist[i].setText(name);
                lblPlays[i].setText(playtime);
                i++;
            }
         }
                  
        if (YB3.isSelected()){
            /*add arguments for when All Time is selected*/
            String sql5 = "SELECT TOP 10 artist_name, (SUM(ms_played) / 1000 / 60 / 60) AS artist_playtime_hours\n" +
                "FROM test\n" +
                "WHERE username = '" + username + "'\n" + 
                "GROUP BY artist_name\n" +
                "ORDER BY 2 DESC;";
            statement = con.createStatement();
            result = statement.executeQuery(sql5);
            
            i = 0;
            
            while(result.next())
            {
                String name = result.getString("artist_name");
                //String song = result.getString("song_name");
                String playtime = result.getString("artist_playtime_hours");
                //String user = result.getString("username");
                
                //lblUser.setText(user);
                //lblSong[i].setText(song);
                lblSong[i].setText("");
                lblArtist[i].setText(name);
                lblPlays[i].setText(playtime);
                i++;
            }
        }
        

        }
        else
        {
            repaint();
            for(int i = 0; i < 10; i++)
            {
                lblSong[i].setText("");
                lblArtist[i].setText("");
                lblPlays[i].setText("");
            }
        }
        // JOHN GLAY PART

        if (e.getSource() == btnHome) {
            new launchProgram();
            dispose();
        }
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MsAccess_database.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (SQLException ex) {
            Logger.getLogger(MsAccess_database.class.getName()).log(Level.SEVERE, null, ex);   
        }
        
    }
}

