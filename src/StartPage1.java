import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import javax.swing.*;
public class StartPage1 extends JFrame implements ActionListener {
    JButton a,c;
    JLabel l1,l2;
    StartPage1(){
        l1 = new JLabel("Administrator Fee");
        l1.setFont(new Font("Times New Roman", Font.ITALIC, 72));
        l1.setBounds(40,50,800,100);
        l1.setForeground(Color.RED);
        add(l1);
        l2 = new JLabel("Portal");
        l2.setFont(new Font("Times New Roman", Font.ITALIC, 72));
        l2.setBounds(205,150,650,100);
        l2.setForeground(Color.RED);
        add(l2);
        a = new JButton("Logout");
        a.setFont(new Font("Times New Roman", Font.BOLD, 16));
        a.setBackground(Color.BLACK);
        a.setForeground(Color.WHITE);
        a.setBounds(356, 270, 100, 50);
        add(a);
        a.addActionListener(this);
        setLayout(null);
        c = new JButton("Export Student Data");
        c.setFont(new Font("Times New Roman", Font.BOLD, 16));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setBounds(150,270,180,50);
        add(c);
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conn c1 = new conn();
                String q1 = "select * from fee_record into outfile 'c:/wamp64/tmp/fee_record.csv' FIELDS TERMINATED BY ',' ENCLOSED BY '\"' LINES TERMINATED BY '\n' ;";
                try {
                    c1.s.execute(q1);
                }
                catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
        setSize(650, 400);
        setLocation(450, 90);
        setVisible(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);
    }
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Login_Select().setVisible(true);
    }
}