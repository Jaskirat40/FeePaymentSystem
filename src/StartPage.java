import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import javax.swing.*;

public class StartPage extends JFrame implements ActionListener {
    JButton a,b;
    JLabel l1,l2,l3;
    StartPage(){
        l1 = new JLabel("STUDENT FEE RECEIPT");
        l1.setFont(new Font("Times New Roman", Font.ITALIC, 72));
        l1.setBounds(35,30,800,100);
        l1.setForeground(Color.BLACK);
        add(l1);

        l2 = new JLabel("SYSTEM");
        l2.setFont(new Font("Times New Roman", Font.ITALIC, 72));
        l2.setBounds(295,120,650,100);
        l2.setForeground(Color.BLACK);
        add(l2);

        l3 = new JLabel("(B.Tech 3rd Year 6th semester)");
        l3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l3.setBounds(285,170,650,100);
        l3.setForeground(Color.BLACK);
        add(l3);

        a = new JButton("Logout");
        a.setFont(new Font("Times New Roman", Font.BOLD, 16));
        a.setBackground(Color.BLACK);
        a.setForeground(Color.WHITE);
        a.setBounds(250,270, 100, 50);
        add(a);

        a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Login().setVisible(true);
            }
        });

        b = new JButton("Enter your details");
        b.setFont(new Font("Times New Roman", Font.BOLD, 16));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(400, 270, 200, 50);
        add(b);
        b.addActionListener(this);

        setLayout(null);
        setSize(850, 550);
        setLocation(450, 90);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        getContentPane().setBackground(Color.ORANGE);
    }
    public void actionPerformed(ActionEvent e) {
        new Student().setVisible(true);
        setVisible(false);
    }
}