import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class SakumLapa {
    // JLabel welcomLabel = new JLabel("Hello");
    JMenu menu, submenu;
    JMenuItem i1, i2, i3, i4, i5;
    JMenu menu1, submenu1;
    JMenuItem k1, k2, k3, k4, k5, k6;

    SakumLapa(String userID) {
        JFrame frame = new JFrame("Sākumlapa");
        JMenuBar mb = new JMenuBar();
        
        menu = new JMenu("Pārdevēji");
        submenu = new JMenu("Sub Menu");
        i1 = new JMenuItem("Item 1");
        i2 = new JMenuItem("Item 2");
        i3 = new JMenuItem("Item 3");
        i4 = new JMenuItem("Item 4");
        i5 = new JMenuItem("Item 5");
        menu1 = new JMenu("Kategorijas");
        submenu1 = new JMenu("Sadzīves tehnika");
        k1 = new JMenuItem("Augļi");
        k2 = new JMenuItem("Dārzeņi");
        k3 = new JMenuItem("Gaļa");
        k4 = new JMenuItem("Zivis");
        k5 = new JMenuItem("Panna");
        k6 = new JMenuItem("Sadzīves ķīmija");
        // welcomLabel.setBounds(0,0,200,35);
        // welcomLabel.setFont(new Font(null,Font.PLAIN,25));
        // welcomLabel.setText("Hello "+userID);

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);
        mb.add(menu);
        frame.setJMenuBar(mb);
        menu1.add(k1);
        menu1.add(k2);
        menu1.add(k3);
        menu1.add(k4);
        menu1.add(k5);
        menu1.add(k5);
        submenu1.add(k5);
        menu1.add(submenu1);
        mb.add(menu1);
        frame.setJMenuBar(mb);
        // frame.add(welcomLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}
