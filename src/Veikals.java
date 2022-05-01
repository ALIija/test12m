import java.io.ObjectInputStream.GetField;

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

        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800,500);
        f.setVisible(true);
        f.add(label);
    }
}
