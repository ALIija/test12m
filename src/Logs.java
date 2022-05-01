import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.tools.Tool;

public class Logs {
    JFrame f;
    ImageIcon image;
    JLabel displayField;
    
    public static void main(String[] args) throws Exception {
        JFrame f = new JFrame("Veikals");
        ImageIcon image;
        JLabel displayField;
        
        image = new ImageIcon("loader_gif_1.gif");
        displayField = new JLabel(image);
        f.add(displayField);
       
        f.setSize(880, 450);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



   
}
