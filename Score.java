
package quiz_application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    String username;
    int score;
    JButton play,exit;
    
    Score(String username,int score)
    {
        this.username=username;
        this.score=score;
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2=i1.getImage().getScaledInstance(300, 250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);
        
        JLabel heading=new JLabel("Thank You "+username+" For Playing Simple Minds");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma",Font.BOLD,24));
        add(heading);
        
        JLabel lblscore=new JLabel("Your Score is:- "+score);
        lblscore.setBounds(350,200,300,30);
        lblscore.setFont(new Font("Tahoma",Font.BOLD,26));
        add(lblscore);
        
        play=new JButton("Play Again");
        play.setBounds(300,270,150,30);
        play.setFont(new Font("Tahoma",Font.PLAIN ,18));
        play.setBackground(new Color(25,144,254));
        play.setForeground(Color.WHITE);
        play.addActionListener(this);
        add(play);
        
        exit=new JButton("Exit");
        exit.setBounds(500,270,150,30);
        exit.setFont(new Font("Tahoma",Font.PLAIN ,18));
        exit.setBackground(new Color(25,144,254));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);
        
        setSize(750,550);
        setLocation(400,150);
        setTitle("Score");
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
      if(ae.getSource()==play)
      {
          setVisible(false);
          new Login();
      }
      else if(ae.getSource()==exit)
      {
          setVisible(false);
      }
    }
}
