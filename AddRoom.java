
package hotel.management.system;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class AddRoom extends JFrame implements ActionListener{

    
    private JTextField t1,t2;
    private JComboBox c1, c2, c3;
    JButton b1,b2;
    Choice ch1;

    public static void main(String[] args) {
        new AddRoom().setVisible(true);
    }


    public AddRoom() {
        setBounds(450, 200, 1000, 450);
	new JPanel();
	
setLayout(null);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/twelve.jpg"));
                Image i3 = i1.getImage().getScaledInstance(500, 300,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l15 = new JLabel(i2);
                l15.setBounds(400,30,500,370);
                add(l15);
        
        JLabel room = new JLabel("Add Rooms");
        room.setFont(new Font("Tahoma", Font.BOLD, 18));
	room.setBounds(194, 10, 120, 22);
	add(room);
        
	
        
	JLabel l1 = new JLabel("Room Number");
	l1.setForeground(new Color(25, 25, 112));
	l1.setFont(new Font("Tahoma", Font.BOLD, 14));
	l1.setBounds(64, 70, 102, 22);
	add(l1);
        
        
        t1 = new JTextField();
	t1.setBounds(174, 70, 156, 20);
	add(t1);
        

	JLabel available = new JLabel("Availability");
	available.setForeground(new Color(25, 25, 112));
	available.setFont(new Font("Tahoma", Font.BOLD, 14));
	available.setBounds(64, 110, 102, 22);
	add(available);
        
        c1 = new JComboBox(new String[] { "Available", "Occupied" });
	c1.setBounds(176, 110, 154, 20);
        c1.setBackground(Color.WHITE);
	add(c1);


	JLabel status = new JLabel("Cleaning Status");
	status.setForeground(new Color(25, 25, 112));
	status.setFont(new Font("Tahoma", Font.BOLD, 14));
	status.setBounds(64, 150, 102, 22);
	add(status);
        
        c2 = new JComboBox(new String[] { "Cleaned", "Dirty" });
	c2.setBounds(176, 150, 154, 20);
        c2.setBackground(Color.WHITE);
	add(c2);

	JLabel price = new JLabel("Price");
	price.setForeground(new Color(25, 25, 112));
	price.setFont(new Font("Tahoma", Font.BOLD, 14));
	price.setBounds(64, 190, 102, 22);
	add(price);
        
        t2 = new JTextField();
	t2.setBounds(174, 190, 156, 20);
	add(t2);

        JLabel type = new JLabel("Bed Type");
	 type.setForeground(new Color(25, 25, 112));
	 type.setFont(new Font("Tahoma", Font.BOLD, 14));
	 type.setBounds(64, 230, 102, 22);
	add( type);


        c3 = new JComboBox(new String[] { "Single Bed", "Double Bed"});
	c3.setBounds(176, 230, 154, 20);
        c3.setBackground(Color.WHITE);
	add(c3);

	

	

	b1 = new JButton("Add");
	b1.addActionListener(this);
	b1.setBounds(64, 321, 111, 33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
	add(b1);

	b2 = new JButton("Back");
	b2.addActionListener(this);
	b2.setBounds(198, 321, 111, 33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	add(b2);

	
        setBackground(Color.WHITE);
    
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            
            if(ae.getSource() == b1){
                try{
                conn c = new conn();
                String room_no = t1.getText();
                String available = (String)c1.getSelectedItem();
                String status = (String)c2.getSelectedItem();
                String price  = t2.getText();
                String bed_type = (String)c3.getSelectedItem();
                String str = "INSERT INTO room values( '"+room_no+"', '"+available+"', '"+status+"','"+price+"', '"+bed_type+"')";
              
                
		c.s.executeUpdate(str);
		JOptionPane.showMessageDialog(null, "Room Successfully Added");
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
