import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.*;

public class Student extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l7, l9, l10, l11;
    JTextField t1, t2, t3, t4, t6;
    JButton b,c;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate now = LocalDate.now();
    Student()
    {
        setTitle("ENTER DETAILS FORM");
        l1 = new JLabel("ENTER DETAILS");
        l1.setFont(new Font("Times New Roman", Font.ITALIC, 48));
        l1.setBounds(220, 40, 500, 40);
        l1.setForeground(Color.BLACK);
        add(l1);

        l2 = new JLabel("Date: "+dtf.format(now));
        l2.setFont(new Font("Times New Roman", Font.BOLD, 16));
        l2.setBounds(630, 2, 160, 30);
        l2.setForeground(Color.BLACK);
        add(l2);

        l3 = new JLabel("Student's Name:");
        l3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l3.setBounds(100, 140, 160, 30);
        l3.setForeground(Color.BLACK);
        add(l3);

        l4 = new JLabel("Father's Name:");
        l4.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l4.setBounds(100, 190, 200, 30);
        l4.setForeground(Color.BLACK);
        add(l4);

        l5 = new JLabel("Roll No.");
        l5.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l5.setBounds(100, 240, 200, 30);
        l5.setForeground(Color.BLACK);
        add(l5);

        l7 = new JLabel("Email Address:");
        l7.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l7.setBounds(100, 290, 200, 30);
        l7.setForeground(Color.BLACK);
        add(l7);

        l9 = new JLabel("Contact No:");
        l9.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l9.setBounds(100, 340, 200, 30);
        l9.setForeground(Color.BLACK);
        add(l9);

        l10 = new JLabel("Amount:");
        l10.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l10.setBounds(100, 390, 200, 30);
        l10.setForeground(Color.BLACK);
        add(l10);

        t1 = new JTextField();
        t1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        t1.setBounds(300, 140, 400, 30);
        add(t1);

        t2 = new JTextField();
        t2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        t2.setBounds(300, 190, 400, 30);
        add(t2);

        t6 = new JTextField();
        t6.setFont(new Font("Times New Roman", Font.BOLD, 14));
        t6.setBounds(300, 240, 400, 30);
        add(t6);

        t3 = new JTextField();
        t3.setFont(new Font("Times New Roman", Font.BOLD, 14));
        t3.setBounds(300, 290, 400, 30);
        add(t3);

        t4 = new JTextField();
        t4.setFont(new Font("Times New Roman", Font.BOLD, 14));
        t4.setBounds(300, 340, 400, 30);
        add(t4);

        l11 = new JLabel("30000/-");
        l11.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l11.setBounds(300, 390, 400, 30);
        l11.setForeground(Color.BLACK);
        add(l11);

        b = new JButton("Next");
        b.setFont(new Font("Times New Roman", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        setLayout(null);
        b.setBounds(548, 450, 100, 30);
        add(b);
        b.addActionListener(this);

        c = new JButton("Back");
        c.setFont(new Font("Times New Roman", Font.BOLD, 14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setBounds(400,450,100,30);
        add(c);
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StartPage().setVisible(true);
                setVisible(false);
            }
        });
        getContentPane().setBackground(Color.ORANGE);
        setSize(800, 550);
        setLocation(450, 90);
        setVisible(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae) {
        try {
            if (t1.getText().equals("") || t2.getText().equals("") || t6.getText().equals("") ||
                    t3.getText().equals("") || t4.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill all the required fields","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
                {
                Fine f = new Fine();
                f.l21.setText(t1.getText());
                f.l22.setText(t2.getText());
                f.l23.setText(t6.getText());
                f.l24.setText(t3.getText());
                f.l25.setText(t4.getText());
                setVisible(false);
                f.setVisible(true);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}