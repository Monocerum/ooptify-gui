import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.UIManager.LookAndFeelInfo;

public class OOPtifyLaunch extends JFrame implements ActionListener {
    JPanel pnlCenter;
    JLabel lblImage, lblIcon, lblTitle, lblWelcome, lblMainTitle;
    JButton btnLaunch;
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

        EmptyBorder margin = new EmptyBorder(20, 0, 0, 0);

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
        
        lblMainTitle = new JLabel("OOPtify");
        lblMainTitle.setFont(new Font("Gotham-Bold", Font.PLAIN, 70));
        lblMainTitle.setForeground(Color.white);

        JPanel pnlLbl;
        pnlLbl = new JPanel(new FlowLayout(FlowLayout.LEADING, 10, 2));
        lblWelcome = new JLabel("welcome to");
        lblWelcome.setFont(new Font("Gotham-Light", Font.PLAIN, 30));
        lblWelcome.setForeground(Color.white);

        pnlLbl.setBorder(margin);
        pnlLbl.setOpaque(false);
        pnlLbl.add(lblWelcome);

        btnLaunch = new JButton("Launch");
        btnLaunch.setFont(new Font("Gotham", Font.BOLD, 18));
        btnLaunch.setPreferredSize(new Dimension(180, 50));
        btnLaunch.setBackground(new Color(29, 185, 84));
        btnLaunch.setForeground(Color.black);
        btnLaunch.setBorderPainted(false);
        btnLaunch.setFocusable(false);
        btnLaunch.addActionListener(this);

        pnlCenter.add(lblImage);
        pnlCenter.add(pnlLbl);
        pnlCenter.add(lblMainTitle);
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
            Object selected = JOptionPane.showInputDialog(null, "Message", "Title", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

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

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException {
        
        try 
        {
            // Here you can select the selected theme class name in JTatt
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        } 
        catch (InstantiationException ex) 
        {
            Logger.getLogger(OOPtifyLaunch.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IllegalAccessException ex) 
        {
            Logger.getLogger(OOPtifyLaunch.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(OOPtifyLaunch.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (UnsupportedLookAndFeelException ex)
        {
            Logger.getLogger(OOPtifyLaunch.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() { 
            @Override
            public void run() { 
                new OOPtifyLaunch();
            } 
        });

        

    }
}
