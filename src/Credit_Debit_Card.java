import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Credit_Debit_Card extends JFrame implements ActionListener {
JLabel l1,l2,l3,l4,l5,l21,l22,l23,l24,l25,l26;
JButton b1;
JTextField t1,t2,t3,t4,t5,t6;
JPasswordField p1;
Credit_Debit_Card(){
    l21 = new JLabel();
    l22 = new JLabel();
    l23 = new JLabel();
    l24 = new JLabel();
    l25 = new JLabel();
    l26 = new JLabel();
    l1 = new JLabel("Enter your Credit/Debit card details:");
    l1.setFont(new Font("Times New Roman",Font.BOLD,36));
    l1.setBounds(30,10,600,50);
    l1.setForeground(Color.BLUE);
    add(l1);
    l2 = new JLabel("Card number:");
    l2.setFont(new Font("Times New Roman",Font.BOLD,22));
    l2.setBounds(100,100,200,50);
    add(l2);
    l3 = new JLabel("Expiry Date:");
    l3.setFont(new Font("Times New Roman",Font.BOLD,22));
    l3.setBounds(130,150,180,50);
    add(l3);
    l4 = new JLabel("CVV:");
    l4.setFont(new Font("Times New Roman",Font.BOLD,22));
    l4.setBounds(370,150,100,50);
    add(l4);
    l5 = new JLabel("-");
    l5.setFont(new Font("Times New Roman",Font.PLAIN,30));
    l5.setBounds(305,95,100,50);
    add(l5);
    l5 = new JLabel("-");
    l5.setFont(new Font("Times New Roman",Font.PLAIN,30));
    l5.setBounds(376,95,100,50);
    add(l5);
    l5 = new JLabel("-");
    l5.setFont(new Font("Times New Roman",Font.PLAIN,30));
    l5.setBounds(446,95,100,50);
    add(l5);
    l5 = new JLabel("/");
    l5.setFont(new Font("Times New Roman",Font.BOLD,28));
    l5.setBounds(298,150,100,50);
    add(l5);
    t1 = new JTextField(4);
    t1.setFont(new Font("Times New Roman",Font.BOLD,20));
    t1.setBounds(250,112,50,25);
    add(t1);
    t2 = new JTextField(4);
    t2.setFont(new Font("Times New Roman",Font.BOLD,20));
    t2.setBounds(320,112,50,25);
    add(t2);
    t3 = new JTextField(4);
    t3.setFont(new Font("Times New Roman",Font.BOLD,20));
    t3.setBounds(390,112,50,25);
    add(t3);
    t4 = new JTextField(4);
    t4.setFont(new Font("Times New Roman",Font.BOLD,20));
    t4.setBounds(460,112,50,25);
    add(t4);
    t5 = new JTextField();
    t5.setFont(new Font("Times New Roman",Font.BOLD,20));
    t5.setBounds(265,162,30,25);
    add(t5);
    t6 = new JTextField();
    t6.setFont(new Font("Times New Roman",Font.BOLD,20));
    t6.setBounds(310,162,30,25);
    add(t6);
    p1 = new JPasswordField();
    p1.setFont(new Font("Times New Roman",Font.BOLD,20));
    p1.setBounds(435,162,40,25);
    p1.setEchoChar('*');
    add(p1);
    b1 = new JButton("Pay Fees");
    b1.setBackground(Color.BLACK);
    b1.setForeground(Color.WHITE);
    b1.setBounds(250,300,150,30);
    b1.setFont(new Font("Times New Roman",Font.BOLD,20));
    add(b1);
    b1.addActionListener(this);
    t1.addKeyListener(new KeyAdapter() {
     public void keyPressed(KeyEvent ae){
         String n1 = t1.getText();
         if(n1.length() == 3){
             t2.requestFocus();
         }
     }
    });
    t2.addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent ae){
            String n1 = t2.getText();
            if(n1.length() == 3){
                t3.requestFocus();
            }
        }
    });
    t3.addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent ae){
            String n1 = t3.getText();
            if(n1.length() == 3){
                t4.requestFocus();
            }
        }
    });
    t4.addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent ae){
            String n1 = t4.getText();
            if(n1.length() == 3){
                t5.requestFocus();
            }
        }
    });
    t5.addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent ae){
            String n1 = t5.getText();
            if(n1.length() == 1){
                t6.requestFocus();
            }
        }
    });
    t6.addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent ae){
            String n1 = t6.getText();
            if(n1.length() == 1){
                p1.requestFocus();
            }
        }
    });
    p1.addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent ae){
            String n1 = String.valueOf(p1.getPassword());
            if(n1.length() == 2){
                b1.requestFocus();
            }
        }
    });
    getContentPane().setBackground(Color.LIGHT_GRAY);
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(650,400);
    setLocation(450,90);
}
    public void actionPerformed(ActionEvent ae) {
        String n1 = String.valueOf(t1.getText());
        String n2 = String.valueOf(t2.getText());
        String n3 = String.valueOf(t3.getText());
        String n4 = String.valueOf(t4.getText());
        String n5 = String.valueOf(t5.getText());
        String n6 = String.valueOf(t6.getText());
        String n7 = String.valueOf(p1.getPassword());

        if (n1.length()!=4||n2.length()!=4||n3.length()!=4||n4.length()!=4||n5.length()!=2
                ||n6.length()!=2||n7.length()!=3) {
            JOptionPane.showMessageDialog(null, "Please enter your card details carefully","Error Message",JOptionPane.WARNING_MESSAGE);

        } else {
            Conformation c = new Conformation();
            c.l21.setText(l21.getText());
            c.l22.setText(l22.getText());
            c.l23.setText(l23.getText());
            c.l24.setText(l24.getText());
            c.l25.setText(l25.getText());
            c.l2.setText(l26.getText());
            c.setVisible(true);
            setVisible(false);
        }
    }
}
class main1{
    public static void main(String[] args) {
        new Credit_Debit_Card().setVisible(true);
    }
}