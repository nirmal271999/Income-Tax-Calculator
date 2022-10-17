package javagui;

import java.awt.EventQueue;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

public class Forget extends JFrame{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Forget window = new Forget();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Forget() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Change Password");
		
		JLabel userName = new JLabel("Enter PAN Number");
        userName.setBounds(100,50,200,30);
        userName.setFont(userName.getFont().deriveFont(18.0f));
        JTextArea useArea = new JTextArea();
        useArea.setBounds(100,95,220,35);
        useArea.setFont(useArea.getFont().deriveFont(16.0f));
        JLabel password = new JLabel("Enter New Password");
        password.setBounds(100,140,210,30);
        password.setFont(password.getFont().deriveFont(18.0f));
        JTextArea passArea = new JTextArea();
        passArea.setBounds(100,180,220,35);
        passArea.setFont(passArea.getFont().deriveFont(16.0f));
        JButton button = new JButton("Change Password");
        button.setBounds(100,240,220,35);
        button.setFont(button.getFont().deriveFont(16.0f));
        
        button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(useArea.getText().isEmpty() || passArea.getText().isEmpty()) {
        			JOptionPane.showMessageDialog(button, "Insert PAN or New Password");
        		}
        		else {
        			try {
        				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo", "root", "nirmal@1999");
        				PreparedStatement st = (PreparedStatement) connection.prepareStatement("Select * from account where PAN=?");
                        st.setString(1, useArea.getText());
        				ResultSet rs = st.executeQuery();
        				if(rs.next()) {
        					PreparedStatement stat = (PreparedStatement) connection.prepareStatement("Update account set Password=? where PAN=?");
            				stat.setString(1, passArea.getText());
            				stat.setString(2, useArea.getText());
        					stat.executeUpdate();
            				JOptionPane.showMessageDialog(button, "Password Changed");
            				App app = new App();
            				app.setVisible(true);
        				}
        				else {
        					JOptionPane.showMessageDialog(button, "Wrong PAN Number");
        					useArea.setText("");
        					passArea.setText("");
        				}
        			} catch(Exception ex) {
        				ex.printStackTrace();
        			}
        		}
        	}
        });

        frame.setBounds(100,100,410,400);
        frame.add(userName);
        frame.add(password);
        frame.add(passArea);
        frame.add(button);
        frame.add(useArea);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
