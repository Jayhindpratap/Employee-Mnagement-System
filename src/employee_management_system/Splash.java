package employee_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Splash  extends JFrame implements ActionListener {
    Splash(){
        setLayout(null);
        getContentPane().setBackground(Color.white);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2=i1.getImage().getScaledInstance(1100,700,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(50,100,1050,500);
        add(image);

        JButton clickhere=new JButton(" CONTINUE");
        clickhere.setBounds(430,450,150,30);
        clickhere.setBackground(Color.magenta);
        clickhere.addActionListener(this);
        image.add(clickhere);

        JLabel heading=new JLabel("EMPLOYEE  MANAGEMENT  SYSTEM");
        heading.setBounds(120,30,1200,40);
        heading.setFont(new Font("serif", Font.PLAIN,50));
        heading.setForeground(Color.red);
        add(heading);



        setSize(1170 ,650);
        setLocation(200,60);



        setVisible(true);

        while(true) {
            heading.setVisible(false);
            try{
                Thread.sleep(500);
            }catch (Exception e){

            }

            heading.setVisible(true);
            try {
                Thread.sleep(500);
            }catch (Exception e){

            }

        }

    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public static void main(String[] args) {
        new Splash();

    }
}
