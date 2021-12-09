import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Fine extends JFrame implements ActionListener {

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l21,l22,l23,l24,l25;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate date1 = LocalDate.now();
    LocalDate localDate2 = LocalDate.parse("2020-12-10");
    long days = Period.between(localDate2,date1).getMonths();
    long days1 = Period.between(localDate2,date1).getDays();
    long days3 = Period.between(localDate2,date1).getYears();
    long days2 = (days * 30) + days1 + (days3 * 365);
    Student st = new Student();
    JButton b1,b2;
    Fine(){
        l21 = new JLabel();
        l22 = new JLabel();
        l23 = new JLabel();
        l24 = new JLabel();
        l25 = new JLabel();
        l1 = new JLabel("Date:");
        l1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        l1.setBounds(50,10,650,100);
        l1.setForeground(Color.BLACK);
        add(l1);

        l6 = new JLabel(dtf.format(date1));
        l6.setFont(new Font("Times New Roman", Font.BOLD, 30));
        l6.setBounds(350,10,650,100);
        l6.setForeground(Color.BLACK);
        add(l6);

        l2 = new JLabel("Last Date:");
        l2.setFont(new Font("Times New Roman", Font.BOLD, 30));
        l2.setBounds(50,60,650,100);
        l2.setForeground(Color.BLACK);
        add(l2);

        l7 = new JLabel("10/12/2020");
        l7.setFont(new Font("Times New Roman", Font.BOLD, 30));
        l7.setBounds(350,60,650,100);
        l7.setForeground(Color.BLACK);
        add(l7);

        l3 = new JLabel("Days exceeded:");
        l3.setFont(new Font("Times New Roman", Font.BOLD, 30));
        l3.setBounds(50,110,650,100);
        l3.setForeground(Color.BLACK);
        add(l3);

        l8 = new JLabel(days2+" Days");
        l8.setFont(new Font("Times New Roman", Font.BOLD, 30));
        l8.setBounds(350,110,650,100);
        l8.setForeground(Color.BLACK);
        add(l8);

        l4 = new JLabel("Semester Fee: ");
        l4.setFont(new Font("Times New Roman", Font.BOLD, 30));
        l4.setBounds(50,160,650,100);
        l4.setForeground(Color.BLACK);
        add(l4);

        l9 = new JLabel("Rs "+st.l11.getText());
        l9.setFont(new Font("Times New Roman", Font.BOLD, 30));
        l9.setBounds(350,160,650,100);
        l9.setForeground(Color.BLACK);
        add(l9);

        l5 = new JLabel("Total fee to be Paid: ");
        l5.setFont(new Font("Times New Roman", Font.BOLD, 30));
        l5.setBounds(50,260,650,100);
        l5.setForeground(Color.BLACK);
        add(l5);

        l10 = new JLabel("Rs "+(30000+((days2)*5))+"/-");
        l10.setFont(new Font("Times New Roman", Font.BOLD, 30));
        l10.setBounds(350,260,650,100);
        l10.setForeground(Color.BLACK);
        add(l10);

        l11 = new JLabel("Fine: ");
        l11.setFont(new Font("Times New Roman", Font.BOLD, 30));
        l11.setBounds(50,210,650,100);
        l11.setForeground(Color.BLACK);
        add(l11);

        l12 = new JLabel("Rs "+(days2)*5+"/-");
        l12.setFont(new Font("Times New Roman", Font.BOLD, 30));
        l12.setBounds(350,210,650,100);
        l12.setForeground(Color.RED);
        add(l12);

        b1 = new JButton("Next");
        b1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(300, 375, 100, 30);
        add(b1);
        b1.addActionListener(this);

        b2 = new JButton("Back");
        b2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(175, 375, 100, 30);
        add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Student().setVisible(true);
            }
        });
        setLayout(null);
        setSize(550, 500);
        setLocation(450, 90);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        getContentPane().setBackground(Color.ORANGE);
    }
    public void actionPerformed(ActionEvent e) {
        Credit_Debit_Card cdc = new Credit_Debit_Card();
        cdc.l21.setText(l21.getText());
        cdc.l22.setText(l22.getText());
        cdc.l23.setText(l23.getText());
        cdc.l24.setText(l24.getText());
        cdc.l25.setText(l25.getText());
        cdc.l26.setText(l10.getText());
        setVisible(false);
        cdc.setVisible(true);
    }
}