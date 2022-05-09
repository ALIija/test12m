import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;

public class LoginLapa implements ActionListener {

    JFrame frame = new JFrame("Loginlapa SEll");
    JLabel welcomLabel = new JLabel( new ImageIcon("src//leaf.png"));
    JLabel welcomLabel1 = new JLabel(new ImageIcon("src//logo.png"));
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("userID:");
    JLabel userPasswordLabel = new JLabel("password:");
    JLabel messageLabel = new JLabel("");
    JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();
    
    


    HashMap<String, String> logininfo = new HashMap<String, String>();

    LoginLapa(HashMap<String, String> loginInfoOriginal) {
        logininfo = loginInfoOriginal;

        userIDLabel.setBounds(50, 125, 75, 25); // x, y, weith, height
        userPasswordLabel.setBounds(50, 175, 75, 25);

        messageLabel.setBounds(125, 275, 250, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 25));

        userIDField.setBounds(125, 125, 200, 25);
        userPasswordField.setBounds(125, 175, 200, 25);

        loginButton.setBounds(125, 225, 100, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(225, 225, 100, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        welcomLabel.setBounds(140,50, 310, 370);
        welcomLabel1.setBounds(90,20, 250, 100);
        // welcomLabel.setFont(new Font(null,Font.PLAIN,25));
        // welcomLabel.setForeground(Color.magenta);

        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(welcomLabel);
        frame.add(welcomLabel1);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 500);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        frame.setLocation(600, 400);
        panel.setBackground(Color.orange);
        panel.setPreferredSize(new DimensionUIResource(170, 150));
        panel1.setBackground(Color.pink);
        panel1.setPreferredSize(new DimensionUIResource(100, 200));
        frame.add(panel, BorderLayout.NORTH);
        frame.add(panel1, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) {
            userIDField.setText("");
            userPasswordField.setText("");
        }
        if (e.getSource() == loginButton) {
            String userID = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            if (logininfo.containsKey(userID)) {
                if (logininfo.get(userID).equals(password)) {
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login successful");
                    frame.dispose();// pazūd login lapa
                    SakumLapa sakumLapa = new SakumLapa(userID);
                } else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Wrong password");
                }
            } else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Username not found");
            }
        }

    }
}
