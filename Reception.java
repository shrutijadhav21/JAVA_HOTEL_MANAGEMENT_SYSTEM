
package hotel.management.system;

import javax.swing.*;

import java.sql.*;	
import java.awt.event.*;
import java.awt.*;

public class Reception extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		new Reception();
	}
	
	public Reception(){
		
                setBounds(530, 200, 850, 440);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/fourth.jpg"));
                Image i3 = i1.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(250,30,500,330);
                add(l1);
		
		JButton b1 = new JButton("New Customer Form");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				AddCustomer custom = new AddCustomer();
				custom.setVisible(true);
                                setVisible(false);
			}catch(Exception e1){
				e1.printStackTrace();
			}
			}
		});
		b1.setBounds(10, 30, 200, 30);
                b1.setBackground(Color.BLACK);
                b1.setForeground(Color.WHITE);
		contentPane.add(b1);
		
		JButton b2 = new JButton("Room");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				Room room = new Room();
				room.setVisible(true);
                                setVisible(false);
				}
				catch(Exception e){
					e.printStackTrace();
				}
				
			}
		});
		b2.setBounds(10, 70, 200, 30);
                b2.setBackground(Color.BLACK);
                b2.setForeground(Color.WHITE);

		contentPane.add(b2);
		
		
		
		JButton b4 = new JButton("All Employee Info");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				
					EmployeeInfo em = new EmployeeInfo();
					em.setVisible(true);
					setVisible(false);
					
				}
				catch (Exception e1){
					e1.printStackTrace();
				}
			
			}
		});
		b4.setBounds(10, 110, 200, 30);                
                b4.setBackground(Color.BLACK);
                b4.setForeground(Color.WHITE);

		contentPane.add(b4);
		
		JButton b5 = new JButton("Customer Info");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					
					CustomerInfo customer = new CustomerInfo();
					customer.setVisible(true);				
					setVisible(false);
				}
				catch (Exception e1){
					e1.printStackTrace();
				}
			}
		});
		b5.setBounds(10, 150, 200, 30);
                b5.setBackground(Color.BLACK);
                b5.setForeground(Color.WHITE);

		contentPane.add(b5);
		
		JButton b6 = new JButton("Manager Info");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				ManagerInfo mana = new ManagerInfo();
				mana.setVisible(true);
                                setVisible(false);
				}
				catch (Exception e1){
					e1.printStackTrace();
				}
			}
		});
		b6.setBounds(10, 190, 200, 30);
                b6.setBackground(Color.BLACK);
                b6.setForeground(Color.WHITE);

		contentPane.add(b6);
		
		
                
		
		
		
		
		
		JButton b7 = new JButton("Pick up Service");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				PickUp pick = new PickUp();
				pick.setVisible(true);
                                setVisible(false);
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		b7.setBounds(10, 230, 200, 30);
                b7.setBackground(Color.BLACK);
                b7.setForeground(Color.WHITE);

		contentPane.add(b7);
		
		JButton b8 = new JButton("Search Room");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				SearchRoom search = new SearchRoom();
				search.setVisible(true);
                                setVisible(false);
				}
				catch (Exception ss){
					ss.printStackTrace();
				}
			}
		});
		b8.setBounds(10, 270, 200, 30);
                b8.setBackground(Color.BLACK);
                b8.setForeground(Color.WHITE);

		contentPane.add(b8);

		JButton b9 = new JButton("Log Out");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
                                    new Login().setVisible(true);
                                    setVisible(false);
                                    
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		b9.setBounds(10, 310, 200, 30);
                b9.setBackground(Color.BLACK);
                b9.setForeground(Color.WHITE);

		contentPane.add(b9);
                getContentPane().setBackground(Color.WHITE);
                
                setVisible(true);
	}
}
