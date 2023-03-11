package employee_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener {
    JButton  add,view,update,remove;
   public Home(){
       setLayout(null);
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
       Image i2=i1.getImage().getScaledInstance(1120,630,Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel image=new JLabel(i3);
       image.setBounds(0,0,1120,630);
       add(image);

       JLabel heading=new JLabel("Employee Management System");
       heading.setBounds(650,20,400,40);
       heading.setFont(new Font("Tahoma",Font.BOLD,20));
       image.add(heading);

       add= new JButton("Add Employees");
       add.setBounds(650,80,150,30);
       add.setBackground(Color.orange);
       add.addActionListener(this);
       image.add(add);

       view= new JButton("View Employees");
       view.setBounds(820,80,150,30);
       view.setBackground(Color.orange);
       view.addActionListener(this);
       image.add(view);

       update= new JButton("Update Employees");
       update.setBounds(650,140,150,30);
      update.setBackground(Color.orange);
       update.addActionListener(this);
       image.add(update);

       remove= new JButton("Remove Employees");
       remove.setBounds(820,140,150,30);
       remove.setBackground(Color.orange);
       remove.addActionListener(this);
       image.add(remove);

       setSize(1120,630);
       setLocation(250,100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==add){
           setVisible(false);
           new AddEmployee();

       }else if(ae.getSource()==view){
           setVisible(false);
           new ViewEmployee();

       }else if(ae.getSource()==update){
           setVisible(false);
           new ViewEmployee();
       } else   {
           setVisible(false);
           new RemoveEmployee();


       }

    }
    public static void main(String[] args) {
        new Home();
    }
}
