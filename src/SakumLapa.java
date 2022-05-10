
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

public class SakumLapa {
    Registracija f = new Registracija();
    JMenu menu, submenu;
    JMenuItem i1, i2;
    JMenu menu1, submenu1;
    JMenuItem k1, k2, k3, k4, k5, k6;
    JPanel p = new JPanel();
    JLabel welcomLabel = new JLabel(new ImageIcon("src//logo1.png"));
    JLabel welcomLabel1 = new JLabel( new ImageIcon("src//leaf.png"));

    SakumLapa(String userID) {
        JFrame frame = new JFrame("Sākumlapa");
        JMenuBar mb = new JMenuBar();
     

        menu = new JMenu("Darbinieki");
        submenu = new JMenu("visi");
        i1 = new JMenuItem("Jaunie ");
        i2 = new JMenuItem("Esošie ");
        menu1 = new JMenu("Produkti");
        submenu1 = new JMenu("Sadzīves tehnika");
        k1 = new JMenuItem("Augļi");
        k2 = new JMenuItem("Dārzeņi");
        k3 = new JMenuItem("Gaļa");
        k4 = new JMenuItem("Zivis");
        k5 = new JMenuItem("Panna");
        k6 = new JMenuItem("Sadzīves ķīmija");

        

        

        menu.add(i1);
        menu.add(i2);
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
        // i1.addActionListener(new ActionListener());
        
        frame.setJMenuBar(mb);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocation(600, 400);
        welcomLabel.setBounds(-50,70, 500, 200);
        frame.add(welcomLabel);
        welcomLabel1.setBounds(140,20, 310, 370);
        frame.add(welcomLabel1);
        frame.setLayout(new BorderLayout());
        p.setBackground(Color.ORANGE);
        p.setPreferredSize(new DimensionUIResource(170, 600));
        frame.add(p, BorderLayout.NORTH);
        ;

        // public void actionPerformed(ActionEvent e){  
            
        //     Registracija f = new Registracija();
        //     frame.dispose(); 
        // } ;
    
    }
      
    // public void actionPerformed(ActionEvent e) {
    //     if (e.getSource() == i1) {
    //        f.getClass();
    //     }
    
    

}
