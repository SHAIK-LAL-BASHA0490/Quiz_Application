
package quiz_application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Login extends JFrame implements ActionListener{
    
    JButton exit,next;
    JTextField tfname;
    Login()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);
        
        JLabel simpleminds = new JLabel("Simple Minds");
        simpleminds.setFont(new Font("Times New Roman", Font.BOLD, 30));
        simpleminds.setForeground(new Color(25, 144, 254));
        simpleminds.setBounds(750, 100, 400, 40);
        add(simpleminds);
    
        JLabel nametext=new JLabel("Enter Your Name");
        nametext.setFont(new Font("Times New Roman",Font.BOLD,20));
        nametext.setForeground(new Color(25,144,254));
        nametext.setBounds(770,180,150,30);
        add(nametext);
        
        tfname=new JTextField();
        tfname.setBounds(700,230,300,25);
        tfname.setFont(new Font("Mangolian baiti",Font.BOLD,20));
        add(tfname);
        
        exit=new JButton("Exit");
        exit.setBounds(700,280,100,30);
        exit.setBackground(new Color(25,144,254));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);
        
        next=new JButton("Next");
        next.setBounds(900,280,100,30);
        next.setBackground(new Color(25,144,254));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        
        setVisible(true);
        setSize(1200,600);
        setLocation(150,100);
        setTitle("Quiz Application");
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==exit)
        {
            setVisible(false);
        }
        else
        {
            String name = tfname.getText().trim();

            if (!name.equals(""))
            {
                setVisible(false);
                new Rules(name);
            }
            else
            {
               JOptionPane.showMessageDialog(null, "Please Enter The Name!");
            }
        }
    }
    
    public static void main(String args[])
    {
        new Login();
    }   
}
