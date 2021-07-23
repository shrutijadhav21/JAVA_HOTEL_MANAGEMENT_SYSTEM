package hotel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener{

        JLabel l1;
        JButton b1;
        
        public HotelManagementSystem() {
		
                setSize(1366,430);             
                setLayout(null);
                setLocation(300,300);

		l1 = new JLabel("");
                b1 = new JButton("Next");
                
                b1.setBackground(Color.WHITE);
                b1.setForeground(Color.BLACK);
				
                
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/first.jpg"));
                Image i3 = i1.getImage().getScaledInstance(1366, 390,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
               
                l1 = new JLabel(i2);
                JLabel l2=new JLabel("HOTEL MANAGEMENT SYSTEM");
                l2.setBounds(30,300,1500,100);
                l2.setFont(new Font("serif",Font.PLAIN,70));
                l2.setForeground(Color.white);
                l1.add(l2);
                
                b1.setBounds(1100,325,150,50);
		l1.setBounds(0, 0, 1366, 390);
                l1.add(b1);
		add(l1);
 
                b1.addActionListener(this);
                setVisible(true);
                
               
	}
        
        public void actionPerformed(ActionEvent ae){
                new Login().setVisible(true);
                this.setVisible(false);
                
        }
        
        public static void main(String[] args) {
                HotelManagementSystem window = new HotelManagementSystem();
                window.setVisible(true);			
	}
}
