import javax.swing.*;
import java.awt.event.*;
//import java.awt.event.ActionListener;

interface check{
    void isEvan(int x);}
public class Temp {
    public static void main(String[] args) {
        JFrame f = new JFrame("Buttion");
        f.setSize(300,300);
        JButton b = new JButton("Click It!!");
        b.setBounds(100, 100, 80, 30);
        f.add(b);
        f.setLayout(null);

        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicked");
            }
        });



    }

}
