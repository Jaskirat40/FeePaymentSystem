import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reciept extends JFrame implements ActionListener {
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
JButton a,b;
    Reciept(){
        l12 = new JLabel("Transaction id:");
        l12.setBounds(360,50,800,50);
        l12.setForeground(Color.BLACK);
        l12.setFont(new Font("Times New Roman",Font.PLAIN,14));
        add(l12);
        l14 = new JLabel();
        l14.setBounds(450,50,800,50);
        l14.setForeground(Color.BLACK);
        l14.setFont(new Font("Times New Roman",Font.PLAIN,14));
        add(l14);
        l1 = new JLabel("FEES RECEIPT");
        l1.setBounds(150,20,800,50);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Times New Roman",Font.BOLD,40));
        add(l1);
        l2 = new JLabel("1");
        l2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l2.setBounds(240, 90, 400, 30);
        l2.setForeground(Color.BLACK);
        add(l2);
        l3 = new JLabel("2");
        l3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l3.setBounds(240, 140, 400, 30);
        l3.setForeground(Color.BLACK);
        add(l3);
        l4 = new JLabel("3");
        l4.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l4.setBounds(240, 190, 400, 30);
        l4.setForeground(Color.BLACK);
        add(l4);
        l17 = new JLabel("B.tech 3rd Year 6th Semester");
        l17.setFont(new Font("Times new Roman",Font.BOLD,20));
        l17.setBounds(240,240,300,30);
        l17.setForeground(Color.BLACK);
        add(l17);
        l5 = new JLabel("4");
        l5.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l5.setBounds(240, 290, 400, 30);
        l5.setForeground(Color.BLACK);
        add(l5);
        l6 = new JLabel("5");
        l6.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l6.setBounds(240, 340, 400, 30);
        l6.setForeground(Color.BLACK);
        add(l6);
        l7 = new JLabel("Student's Name:");
        l7.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l7.setBounds(70, 90, 200, 30);
        l7.setForeground(Color.BLACK);
        add(l7);
        l8 = new JLabel("Father's Name:");
        l8.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l8.setBounds(70, 140, 200, 30);
        l8.setForeground(Color.BLACK);
        add(l8);
        l9 = new JLabel("Roll No:");
        l9.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l9.setBounds(70, 190, 200, 30);
        l9.setForeground(Color.BLACK);
        add(l9);
        l16 = new JLabel("Course:");
        l16.setFont(new Font("Times new Roman",Font.BOLD,20));
        l16.setBounds(70,240,200,30);
        l16.setForeground(Color.BLACK);
        add(l16);
        l10 = new JLabel("Email Address:");
        l10.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l10.setBounds(70, 290, 200, 30);
        l10.setForeground(Color.BLACK);
        add(l10);
        l11 = new JLabel("Contact No:");
        l11.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l11.setBounds(70, 340, 200, 30);
        l11.setForeground(Color.BLACK);
        add(l11);
        l13 = new JLabel();
        l13.setFont(new Font("Times New Roman", Font.BOLD, 30));
        l13.setBounds(240, 390, 200, 30);
        l13.setForeground(Color.blue);
        add(l13);
        l15 = new JLabel("Amount:");
        l15.setFont(new Font("Times New Roman", Font.BOLD, 30));
        l15.setBounds(70, 390, 200, 30);
        l15.setForeground(Color.BLACK);
        add(l15);
        a = new JButton("Exit");
        a.setFont(new Font("Times New Roman", Font.BOLD, 20));
        a.setBackground(Color.BLACK);
        a.setForeground(Color.WHITE);
        a.setBounds(600, 200, 150, 50);
        add(a);
        a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        b = new JButton("Logout");
        b.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(600, 110, 150, 50);
        add(b);
        b.addActionListener(this);
        setLayout(null);
        setSize(800, 500);
        setLocation(450, 90);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
    }
    public void actionPerformed(ActionEvent ae) {
            setVisible(false);
            new Login().setVisible(true);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.drawRoundRect(50,50,500,420,30,30);
    }
}