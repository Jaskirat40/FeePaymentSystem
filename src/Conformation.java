import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
public class Conformation extends JFrame implements ActionListener {
    int max = 10000000;
    int min = 80000000;
    int a = (int) (Math.random()*(max-min+1)+min);
   JLabel l1,l2,l3,l21,l22,l23,l24,l25;
   JButton b;
   Conformation() {
       l21 = new JLabel();
       l22 = new JLabel();
       l23 = new JLabel();
       l24 = new JLabel();
       l25 = new JLabel();
       l1 = new JLabel("FEES OF ");
       l1.setBounds(210,50,500,100);
       l1.setForeground(Color.BLACK);
       l1.setFont(new Font("Times New Roman",Font.BOLD,40));
       add(l1);
       l2 = new JLabel();
       l2.setBounds(385,50,300,100);
       l2.setForeground(Color.BLUE);
       l2.setFont(new Font("Times New Roman",Font.BOLD,40));
       add(l2);
       l3 = new JLabel("HAS BEEN PAID SUCCESSFULLY");
       l3.setBounds(50,100,800,100);
       l3.setForeground(Color.BLACK);
       l3.setFont(new Font("Times New Roman",Font.BOLD,40));
       add(l3);
       b = new JButton("Get Receipt");
       b.setFont(new Font("Times New Roman", Font.BOLD, 22));
       b.setBackground(Color.BLACK);
       b.setForeground(Color.WHITE);
       b.setBounds(280, 220, 150, 50);
       add(b);
       b.addActionListener(this);
       setLayout(null);
       setSize(750, 400);
       setLocation(450, 90);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       getContentPane().setBackground(Color.ORANGE);
       setVisible(false);
   }
    public void actionPerformed(ActionEvent e){
        Reciept  r = new Reciept();
        r.l2.setText(l21.getText());
        r.l3.setText(l22.getText());
        r.l4.setText(l23.getText());
        r.l5.setText(l24.getText());
        r.l6.setText(l25.getText());
        r.l13.setText(l2.getText());
        r.l14.setText(String.valueOf(a));
        conn c1 = new conn();
        String q1 = "insert into fee_record values('"+l21.getText()+"','"+l22.getText()+"','"+l23.getText()+"','"+"B.tech 3rd Year 6th Semester"+"','"+l24.getText()+"','"+l25.getText()+"','"+l2.getText()+"','"+"Paid"+"','"+String.valueOf(a)+"')";
        try {
            c1.s.execute(q1);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        r.setVisible(true);
       setVisible(false);
    }

}
