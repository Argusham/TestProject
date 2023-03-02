package za.ca.cput.util;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {


    JPanel panel1,panel2;
    JLabel lblFirstName,lblLastName,lblEmployeeNumber,lblEmail;
    JTextField txfFirstName,txfLastName,txfEmployeeNumber,txfEmail;
    JButton btnEnter,btnExit;

    public void Gui(){

        this.setTitle("Covid App");
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Label
        lblFirstName = new JLabel("First Name:");
        lblLastName = new JLabel("Last Name:");
        lblEmployeeNumber = new JLabel("Employee N.o:");
        lblEmail = new JLabel("Email:");

        //TextFields
        txfFirstName = new JTextField();
        txfLastName = new JTextField();
        txfEmployeeNumber = new JTextField();
        txfEmail = new JTextField();

        //Buttons
        btnEnter = new JButton("Enter");
        btnEnter.addActionListener(this);

        btnExit = new JButton("Exit");
        btnExit.addActionListener(this);

        panel1 = new JPanel();
        //panel1.setPreferredSize(new Dimension(400,150));
        panel1.add(lblFirstName);
        panel1.add(txfFirstName);
        panel1.add(lblLastName);
        panel1.add(txfLastName);
        panel1.add(lblEmployeeNumber);
        panel1.add(txfEmployeeNumber);
        panel1.add(lblEmail);
        panel1.add(txfEmail);
        panel1.setLayout(new GridLayout(4,2));
        this.add(panel1,BorderLayout.CENTER);

        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(400,50));
        panel2.add(btnEnter);
        panel2.add(btnExit);
        panel2.setLayout(new GridLayout(0,2));
        this.add(panel2,BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public void valid(){
        if(txfFirstName.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Enter Value");
        }
        else{JOptionPane.showMessageDialog(this,"Thank you");}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnExit){
            System.exit(0);
        }
        if(e.getSource() == btnEnter){
            valid();
        }
    }
    public static void main(String[] args) {

        Main u = new Main();
        u.Gui();


    }


}