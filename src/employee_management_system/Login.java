package employee_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame  implements ActionListener {
    JTextField tfusername,tfpassword;
    Login(){
        super("Login Page");
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel lblusername=new JLabel("Username");
        lblusername.setBounds(40,20,100,30);
        lblusername.setFont(new Font("serif",Font.PLAIN,18));
        lblusername.setForeground(Color.black);
        add(lblusername);

        JLabel lblpassword=new JLabel("Password");
        lblpassword.setBounds(40,80,100,30);
        lblpassword.setFont(new Font("serif",Font.PLAIN,18));
        lblpassword.setForeground(Color.black);
        add(lblpassword);

        tfusername=new JTextField();
        tfusername.setBounds(140,20,150,25);
        tfusername.setFont(new Font("serif",Font.PLAIN,16));
        add(tfusername);

       tfpassword=new JTextField();
        tfpassword.setBounds(140,80,150,25);
        tfpassword.setFont(new Font("serif",Font.PLAIN,16));
        add(tfpassword);


        JButton login=new JButton("LOGIN");
        login.setBounds(170,150,100,30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(400,0,200,200);
        add(image);

        setSize(600,300);
        setLocation(450,200);
        setVisible(true);


    }
    public void actionPerformed(ActionEvent ae){
        try {
            String username=tfusername.getText();
            String password=tfpassword.getText();
            Conn c=new Conn();
            String query="select * from login where username='"+username+"' and password ='"+password+"'";
          ResultSet rs= c.s.executeQuery(query);
          if(rs.next()){
              setVisible(false);
              new Home();
          }else {
              JOptionPane.showMessageDialog(null,"Invalid username or password");
              setVisible(false);
          }

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new Login();
    }
}
