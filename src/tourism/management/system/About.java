
package tourism.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener{
    
    About(){
        setBounds(300,90,500,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel l1= new JLabel("ABOUT");
        l1.setBounds(150,10,100,40);
        l1.setForeground(Color.red);
        l1.setFont(new Font("Tahoma", Font.PLAIN,20));
        add(l1);
        
        String s= "About Project      \n" +
             "Lorem ipsum dolor sit amet, consectetur adipiscing elit, \n" +
              "sed do eiusmod tempor incididunt ut labore et dolore magna\n"+
            "aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco \n"+
             "laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \n"+
              "in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident \n"+
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, \n" +
              "sed do eiusmod tempor incididunt ut labore et dolore magna\n"+
            "aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco \n"+
             "laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \n"+
              "in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident \n"+
              "sunt in culpa qui officia deserunt mollit anim id est laborum.\n";   
        
        
        
        TextArea area = new TextArea(s,10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20,100,450,300);
        add(area);
        
        
        JButton back = new JButton("Back");
        back.setBounds(200,420,100,25);
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
    }
    
    public void actionPerformed (ActionEvent ae){
        setVisible(false);
    } 
    
    
    public static void main(String args[]){
        new About();
    }
            
}
