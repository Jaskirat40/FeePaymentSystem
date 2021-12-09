import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JTextField t1;
    JPasswordField p1;
    JButton b1,b2;
    JCheckBox c1;
    int f=1,i;
    String[] Name = {"jaskirat","tanvi","ritesh","arshiya"};
    String[] Password = {"jaskirat","tanvi","ritesh","arshiya"};
    Login(){
        l3 = new JLabel("STUDENT LOGIN");
        l3.setFont(new Font("Times New Roman", Font.ITALIC, 30));
        l3.setBounds(75,20,700,30);
        l3.setForeground(Color.RED);
        add(l3);

        l1 = new JLabel("Username:");
        l1.setFont(new Font("Times New Roman", Font.BOLD, 26));
        l1.setBounds(50,70,800,30);
        l1.setForeground(Color.RED);
        add(l1);

        l2 = new JLabel("Password:");
        l2.setFont(new Font("Times New Roman", Font.BOLD, 26));
        l2.setBounds(52,75,800,100);
        l2.setForeground(Color.RED);
        add(l2);

        t1 = new JTextField();
        t1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        t1.setBounds(200, 80, 120, 18);
        add(t1);

        p1 = new JPasswordField();
        p1.setEchoChar('*');
        p1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        p1.setBounds(200, 118, 120, 18);
        add(p1);

        c1 = new JCheckBox("show password");
        c1.addActionListener(e -> {
            if(c1.isSelected())
            {
                p1.setEchoChar((char)0);
            }
            else
            {
                p1.setEchoChar('*');
            }
        });
        c1.setFont(new Font("Times New Roman", Font.BOLD, 10));
        c1.setBounds(235, 140, 95, 18);
        c1.setBackground(Color.BLACK);
        c1.setForeground(Color.WHITE);
        add(c1);
        b1 = new JButton("Login");
        b1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(195, 190, 100, 30);
        add(b1);
        b1.addActionListener(this);
        b2 = new JButton("Back");
        b2.setFont(new Font("Times New Roman", Font.BOLD, 16));
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        b2.setBounds(75, 190, 100, 30);
        add(b2);

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Login_Select().setVisible(true);
            }
        });
        setLayout(null);
        setSize(400, 280);
        setLocation(450, 90);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        getContentPane().setBackground(Color.BLACK);
    }
    public int check(){
        for( i=0;i<4;i++){
            if(t1.getText().equals(Name[i])){
                f=0;
                break;
            }
        }
        if(f==0)
        {
            return i;
        }
        else
            return -1;
    }
    public int check1(){
        for(i=0;i<4;i++){
            if(String.valueOf(p1.getPassword()).equals(Password[i])){
                f=0;
                break;
            }
        }
        if(f==0)
        {
            return i;
        }
        else
            return -1;
    }
    public void actionPerformed(ActionEvent e)
    {
        int i = check();
        int j = check1();
        if(i==j&&i!=-1&&j!=-1)
        {
            new StartPage().setVisible(true);
            setVisible(false);
        }
        else if(i==-1||j==-1){
            JOptionPane.showMessageDialog(null, "Username or Password is incorrect","Error Message",JOptionPane.ERROR_MESSAGE);
        }
        else if(i!=j){
            JOptionPane.showMessageDialog(null, "Username or Password is incorrect","Error Message",JOptionPane.ERROR_MESSAGE);
        }
    }
}