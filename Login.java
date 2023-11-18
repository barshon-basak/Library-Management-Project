package javaapplication70;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Login {

    private JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login window = new Login();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Login() {
        LoginGUI();
    }

    public void LoginGUI() {
        frame = new JFrame("Welcome to Library Management System");

        // Set the frame size to fullscreen
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int width = gd.getDisplayMode().getWidth();
        int height = gd.getDisplayMode().getHeight();
        frame.setBounds(0, 0, width, height);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel WelcomeToLibrary = new JLabel("Welcome To Library Management System");
        WelcomeToLibrary.setHorizontalAlignment(SwingConstants.CENTER);
        WelcomeToLibrary.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        WelcomeToLibrary.setBounds(20, 27, width - 40, 29);
        frame.getContentPane().add(WelcomeToLibrary);

        JButton Librarian = new JButton("Librarian");
        Librarian.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LibrarianLogin.main(new String[]{});
                frame.dispose();
            }
        });
        Librarian.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        Librarian.setBounds(width / 4, height / 4, width / 2, 29);
        frame.getContentPane().add(Librarian);

        JLabel LoginPage = new JLabel("Login Page");
        LoginPage.setHorizontalAlignment(SwingConstants.CENTER);
        LoginPage.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        LoginPage.setBounds(width / 3, height / 6, width / 3, 29);
        frame.getContentPane().add(LoginPage);

        JButton RegisteredUser = new JButton("Registered User");
        RegisteredUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserLogin.main(new String[]{});
                frame.dispose();
            }
        });
        RegisteredUser.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        RegisteredUser.setBounds(width / 4, height / 2, width / 2, 29);
        frame.getContentPane().add(RegisteredUser);
    }
}
