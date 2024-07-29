
package quiz_application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    
    String name;
    JButton back,start;
    
    Rules(String name)
    {
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text=new JLabel("Hii "+name+ " Welcome To Quiz Application.");
        text.setFont(new Font("Mongolian baiti",Font.BOLD,30));
        text.setForeground(new Color(25,144,254));
        text.setBounds(50,20,600,30);
        add(text);
        
        JLabel rules1=new JLabel();
        rules1.setBounds(50,50,600,500);
        rules1.setFont(new Font("Raleway",Font.PLAIN,15));
        rules1.setText(
        "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"

        );
        
        back=new JButton("Back");
        back.setBounds(500,500,100,30);
        back.setFont(new Font("Raleway",Font.BOLD,20));
        back.setBackground(new Color(25,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start=new JButton("Start");
        start.setBounds(650,500,100,30);
        start.setFont(new Font("Raleway",Font.BOLD,20));
        start.setBackground(new Color(25,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        add(rules1);
        
        setSize(800,600);
        setLocation(300,100);
        setTitle("Quiz Rules");
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==back)
        {
            setVisible(false);
            new Login();
        }
        else if(ae.getSource()== start)
        {
            setVisible(false);
           new Quiz(name); 
        }
    }
}
