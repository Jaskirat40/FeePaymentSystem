import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Login_Select extends JFrame implements ActionListener {
    JButton b1,b2,b3;
    JLabel l1;
    Login_Select(){
        l1 = new JLabel("FEE PORTAL");
        l1.setBounds(80,20,700,30);
        l1.setFont(new Font("Times New Roman", Font.BOLD, 36));
        l1.setForeground(Color.RED);
        add(l1);
        b2 = new JButton("Student Login");
        b2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(80, 90, 230, 30);
        add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Login().setVisible(true);
            }
        });
        b1 = new JButton("Administrator Login");
        b1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(80, 140, 230, 30);
        add(b1);
        b1.addActionListener(this);
        b3 = new JButton("Exit");
        b3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(145, 190, 100, 30);
        add(b3);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        setLayout(null);
        setSize(400, 280);
        setLocation(450, 90);
        getContentPane().setBackground(Color.BLACK);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login1().setVisible(true);
    }
    public static void main(String[] args) {
        new Login_Select().setVisible(true);
    }
}
