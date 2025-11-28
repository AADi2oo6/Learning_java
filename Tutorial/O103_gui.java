import javax.naming.Name;
import javax.swing.*;

public class O103_gui {
    public static void main(String[] args) {
        JFrame f = new JFrame("Student Registration");

        JLabel l1 = new JLabel("Student Name:");
        l1.setBounds(50, 50, 100, 30);
        JTextField tf = new JTextField();
        tf.setBounds(150, 50, 150, 30);

        JLabel l2 = new JLabel("Mail ID:");
        l2.setBounds(50, 100, 100, 30);
        JTextField tfMail = new JTextField();
        tfMail.setBounds(150, 100, 150, 30);

        JLabel l3 = new JLabel("Password:");
        l3.setBounds(50, 150, 100, 30);
        JPasswordField pf = new JPasswordField();
        pf.setBounds(150, 150, 150, 30);

        JButton b = new JButton("Register");
        b.setBounds(100, 220, 100, 30);

        f.add(l1); f.add(tf);
        f.add(l2); f.add(tfMail);
        f.add(l3); f.add(pf);
        f.add(b);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
