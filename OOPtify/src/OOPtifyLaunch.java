import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;
import javax.swing.border.*;

public class OOPtifyLaunch extends JFrame implements ActionListener {
    JPanel pnlCenter;
    JLabel lblImage, lblIcon, lblTitle, lblWelcome, lblMainTitle;
    RoundButton btnLaunch;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem icon, title;
    ImageIcon logo = new ImageIcon("images/Spotify_logo.png");
    ImageIcon logoBlk = new ImageIcon("images/Spotify.png");
    Image resizedIcon = logoBlk.getImage().getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
    Image resizedLogo = logo.getImage().getScaledInstance(240, 240, java.awt.Image.SCALE_SMOOTH);
    ImageIcon mainLogo = new ImageIcon(resizedLogo);
    ImageIcon menuLogo = new ImageIcon(resizedIcon);

    OOPtifyLaunch()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900, 800);
        this.setIconImage(logo.getImage());
        this.getContentPane().setBackground(new Color(33, 33, 33));
        this.setTitle("OOPtify");
        this.setResizable(false);

        setLocationRelativeTo(null);

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

        // Logo
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;

        pnlCenter = new JPanel();
        pnlCenter.setLayout(new BoxLayout(pnlCenter, BoxLayout.Y_AXIS));
        pnlCenter.setOpaque(false);

        lblImage = new JLabel(mainLogo);

        JPanel pnlTtl;
        pnlTtl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        lblMainTitle = new JLabel("OOPtify");
        lblMainTitle.setFont(new Font("Gotham-Bold", Font.PLAIN, 70));
        lblMainTitle.setForeground(Color.white);

        pnlTtl.setBorder(new EmptyBorder(0, 0, 20, 0));
        pnlTtl.setOpaque(false);
        pnlTtl.add(lblMainTitle);

        JPanel pnlLbl;
        pnlLbl = new JPanel(new FlowLayout(FlowLayout.LEADING, 10, 2));
        lblWelcome = new JLabel("welcome to");
        lblWelcome.setFont(new Font("Gotham-Light", Font.PLAIN, 30));
        lblWelcome.setForeground(Color.white);

        pnlLbl.setBorder(new EmptyBorder(20, 0, -5, 0));
        pnlLbl.setOpaque(false);
        pnlLbl.add(lblWelcome);

        btnLaunch = new RoundButton("Launch");
        btnLaunch.setFont(new Font("Gotham", Font.BOLD, 18));
        btnLaunch.setPreferredSize(new Dimension(250, 50));
        btnLaunch.setBackground(new Color(29, 185, 84));
        btnLaunch.setForeground(Color.black);
        btnLaunch.setBorderPainted(false);
        btnLaunch.setFocusable(false);
        btnLaunch.addActionListener(this);

        btnLaunch.setBorder(new EmptyBorder(20, 20, 20, 20));

        pnlCenter.add(lblImage);
        pnlCenter.add(pnlLbl);
        pnlCenter.add(pnlTtl);
        pnlCenter.add(btnLaunch);

        lblImage.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblWelcome.setAlignmentX(Component.RIGHT_ALIGNMENT);
        lblMainTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnLaunch.setAlignmentX(Component.CENTER_ALIGNMENT);

        this.setJMenuBar(menuBar);
        this.add(pnlCenter, gbc);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String[] names = {"Placeholder 1", "Placeholder 2", "Placeholder 3"};

        if (e.getSource() == btnLaunch)
        {
            String[] options = {"Placeholder 1", "Placeholder 2", "Placeholder 3"};
            Object selected = JOptionPane.showInputDialog(null, "Choose User:", "Title", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (names[0].equals(selected))
            {
                new OOPtifyMain();
                dispose();
            }
            else if (names[1].equals(selected))
            {
                new OOPtifyMain();
                dispose();
            }
            else if (names[2].equals(selected))
            {
                new OOPtifyMain();
                dispose();
            }
        }
    }

    public static void main(String[] args) {
        UIManager.put("Label.foreground", Color.WHITE); // To make the text color white
        new OOPtifyLaunch();
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
