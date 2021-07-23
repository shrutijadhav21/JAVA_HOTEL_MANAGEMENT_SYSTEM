
package hotel.management.system;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class AddDrivers extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField t1,t2,t3,t4, t5;
    private JComboBox c1, c2;
    JButton b1,b2;
    Choice ch1;

    public static void main(String[] args) {
        new AddDrivers().setVisible(true);
    }


    public AddDrivers() {
        setBounds(450, 200, 1000, 500);
	contentPane = new JPanel();
	setContentPane(contentPane);
	contentPane.setLayout(null);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/eleven.jpg"));
                Image i3 = i1.getImage().getScaledInstance(500, 300,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l15 = new JLabel(i2);
                l15.setBounds(400,30,500,370);
                add(l15);
        
        JLabel title = new JLabel("Add Drivers");
        title.setFont(new Font("Tahoma", Font.BOLD, 18));
	title.setBounds(194, 10, 120, 22);
	contentPane.add(title);
        
	
        
	JLabel name = new JLabel("Name");
	name.setForeground(new Color(25, 25, 112));
	name.setFont(new Font("Tahoma", Font.BOLD, 14));
	name.setBounds(64, 70, 102, 22);
	contentPane.add(name);
        
        
        t1 = new JTextField();
	t1.setBounds(174, 70, 156, 20);
	contentPane.add(t1);
        

	JLabel age = new JLabel("Age");
	age.setForeground(new Color(25, 25, 112));
	age.setFont(new Font("Tahoma", Font.BOLD, 14));
	age.setBounds(64, 110, 102, 22);
	contentPane.add(age);
        
        t2 = new JTextField();
	t2.setBounds(174, 110, 156, 20);
	contentPane.add(t2);


	JLabel gender = new JLabel("Gender");
	gender.setForeground(new Color(25, 25, 112));
	gender.setFont(new Font("Tahoma", Font.BOLD, 14));
	gender.setBounds(64, 150, 102, 22);
	contentPane.add(gender);
        
        c1 = new JComboBox(new String[] { "Male", "Female" });
	c1.setBounds(176, 150, 154, 20);
        c1.setBackground(Color.WHITE);
	contentPane.add(c1);

	JLabel car = new JLabel("Car Company");
	car.setForeground(new Color(25, 25, 112));
	car.setFont(new Font("Tahoma", Font.BOLD, 14));
	car.setBounds(64, 190, 102, 22);
	contentPane.add(car);
        
        t3 = new JTextField();
	t3.setBounds(174, 190, 156, 20);
	contentPane.add(t3);

        JLabel brand = new JLabel("Car Brand");
	brand.setForeground(new Color(25, 25, 112));
	brand.setFont(new Font("Tahoma", Font.BOLD, 14));
	brand.setBounds(64, 230, 102, 22);
	contentPane.add(brand);


        t4 = new JTextField();
	t4.setBounds(174, 230, 156, 20);
	contentPane.add(t4);

	
        JLabel available = new JLabel("Available");
	available.setForeground(new Color(25, 25, 112));
	available.setFont(new Font("Tahoma", Font.BOLD, 14));
	available.setBounds(64, 270, 102, 22);
	contentPane.add(available);


        c2 = new JComboBox(new String[] { "Yes", "No" });
	c2.setBounds(176, 270, 154, 20);
        c2.setBackground(Color.WHITE);
	contentPane.add(c2);

        
        JLabel location = new JLabel("Location");
	location.setForeground(new Color(25, 25, 112));
	location.setFont(new Font("Tahoma", Font.BOLD, 14));
	location.setBounds(64, 310, 102, 22);
	contentPane.add(location );


        t5 = new JTextField();
	t5.setBounds(174, 310, 156, 20);
	contentPane.add(t5);
        
	

	b1 = new JButton("Add");
	b1.addActionListener(this);
	b1.setBounds(64, 380, 111, 33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
	contentPane.add(b1);

	b2 = new JButton("Back");
	b2.addActionListener(this);
	b2.setBounds(198, 380, 111, 33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	contentPane.add(b2);

	
        contentPane.setBackground(Color.WHITE);
    
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            
            if(ae.getSource() == b1){
                try{
                conn c = new conn();
                String name = t1.getText();
                String age = t2.getText();
                String gender = (String)c1.getSelectedItem();
                String company  = t3.getText();
                String brand = t4.getText();
                String available = (String)c2.getSelectedItem();
                String location = t5.getText();
                String str = "insert into driver values( '"+name+"', '"+age+"', '"+gender+"','"+company+"', '"+brand+"', '"+available+"','"+location+"')";
              
                
		c.s.executeUpdate(str);
		JOptionPane.showMessageDialog(null, "Driver Successfully Added");
                this.setVisible(false);
               
                }catch(Exception ee){
                    System.out.println(ee);
                }
            }
            else if(ae.getSource() == b2){
                this.setVisible(false);
            }
        }catch(Exception eee){
            
        }
    }
}
