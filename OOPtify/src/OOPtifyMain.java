import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OOPtifyMain extends JFrame implements ActionListener {
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

        pnlRight.setPreferredSize(new Dimension(900/6,60));
        pnlRight.add(pnlInRight, BorderLayout.CENTER);
        pnlRight.setOpaque(false);

        menuBar.add(pnlRight, rgbc);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
        
        setLayout(null);

        // JUSTIN PART

        // JOHN GLAY PART
        JLabel lblNum = new JLabel("#");
        JLabel lblTitle = new JLabel("Title");
        JLabel lblArtist= new JLabel("Artist");
        JLabel lblDuration= new JLabel("Duration", JLabel.LEFT);

        add(lblNum);
        add(lblTitle);
        add(lblArtist);
        add(lblDuration);

        lblNum.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitle.setFont(new Font("Arial", Font.BOLD, 18));
        lblArtist.setFont(new Font("Arial", Font.BOLD, 18));
        lblDuration.setFont(new Font("Arial", Font.BOLD, 18));

        lblNum.setBounds(60, 60, 195, 50);
        lblTitle.setBounds(255, 60, 195, 50);
        lblArtist.setBounds(450, 60, 195, 50);
        lblDuration.setBounds(755, 60, 195, 50);

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

    public void itemStateChanged(ActionEvent e) {
        // JUSTIN PART

        // JOHN GLAY PART

    }

    public void actionPerformed(ActionEvent e) {
        // JUSTIN PART

        // JOHN GLAY PART

        if (e.getSource() == btnHome)
        {
            new OOPtifyLaunch();
            dispose();
        }

    }

    @Override // white line
    public void paint(Graphics g) {
    super.paint(g);
    g.setColor(Color.WHITE);
    g.drawLine(60, 60, getWidth() - 60, 60);
    }
}