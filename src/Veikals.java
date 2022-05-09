

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Veikals {
    public static void main(String[] args) throws Exception {
        IDparoles idparoles = new IDparoles();
        

        LoginLapa loginLapa = new LoginLapa(idparoles.getLogininfo());

        ImageIcon image = new ImageIcon("src//loader_gif_1.gif");

        JLabel label = new JLabel();
        label.setIcon(image);
        // JButton OkButton = new JButton("Okey");
        // OkButton.setBounds(125, 200, 100, 25);
        // // OkButton.setFocusable(false);
        // // OkButton.addActionListener(this);

        JFrame f = new JFrame();

        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setSize(800, 500);
        f.setVisible(true);
        f.add(label);
        f.setLocation(400, 400);
        // f.add(OkButton);

    }
}
