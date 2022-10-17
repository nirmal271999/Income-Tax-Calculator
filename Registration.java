package javagui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class Registration extends JFrame{

	private JFrame frame;
	private JLabel fname;
	private JTextArea ftext;
	private JLabel lname;
	private JTextArea protext;
	private JLabel uName;
	private JTextArea usertext;
	private JLabel upass;
	private JTextArea mobile;
	private JLabel cpass;
	private JTextArea ctext;
	private JButton submitButton;
	private JButton clearButton;
	private JButton loginButton;

	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Register");
		
		fname = new JLabel("Full Name :");
        fname.setBounds(50,80,150,20);
        fname.setForeground(Color.WHITE);
        fname.setFont(fname.getFont().deriveFont(16.0f));
        ftext = new JTextArea();
        ftext.setBounds(210,80,200,30);
        ftext.setBackground(Color.LIGHT_GRAY);
        ftext.setFont(ftext.getFont().deriveFont(15.0f));

        lname = new JLabel("Profession :");
        lname.setBounds(50,130,150,20);
        lname.setForeground(Color.WHITE);
        lname.setFont(lname.getFont().deriveFont(16.0f));
        protext = new JTextArea();
        protext.setBounds(210,130,200,30);
        protext.setBackground(Color.LIGHT_GRAY);
        protext.setFont(protext.getFont().deriveFont(15.0f));

        uName = new JLabel("PAN No. :");
        uName.setBounds(50,180,150,20);
        uName.setForeground(Color.WHITE);
        uName.setFont(uName.getFont().deriveFont(16.0f));
        usertext = new JTextArea();
        usertext.setBounds(210,180,200,30);
        usertext.setBackground(Color.LIGHT_GRAY);
        usertext.setFont(usertext.getFont().deriveFont(15.0f));

        upass = new JLabel("Mobile :");
        upass.setBounds(50,230,150,20);
        upass.setForeground(Color.WHITE);
        upass.setFont(upass.getFont().deriveFont(16.0f));
        mobile = new JTextArea();
        mobile.setBounds(210,230,200,30);
        mobile.setBackground(Color.LIGHT_GRAY);
        mobile.setFont(mobile.getFont().deriveFont(15.0f));

        cpass = new JLabel("Password :");
        cpass.setBounds(50,250,200,70);
        cpass.setForeground(Color.WHITE);
        cpass.setFont(cpass.getFont().deriveFont(16.0f));
        ctext = new JTextArea();
        ctext.setBounds(210,270,200,30);
        ctext.setBackground(Color.LIGHT_GRAY);
        ctext.setFont(ctext.getFont().deriveFont(15.0f));

        submitButton = new JButton("SUBMIT");
        submitButton.setBounds(210,320,100,30);
        submitButton.setBackground(Color.RED);
        submitButton.setForeground(Color.WHITE);
        submitButton.setFont(submitButton.getFont().deriveFont(15.0f));

        clearButton = new JButton("CLEAR");
        clearButton.setBounds(320,320,90,30);
        clearButton.setBackground(Color.RED);
        clearButton.setForeground(Color.WHITE);
        clearButton.setFont(clearButton.getFont().deriveFont(15.0f));

        loginButton = new JButton("LOGIN");
        loginButton.setBounds(50,10,80,30);
        loginButton.setBackground(Color.BLUE);
        loginButton.setForeground(Color.WHITE);
        loginButton.setFont(loginButton.getFont().deriveFont(14.0f));

        loginButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                App lg = new App();
                lg.setVisible(true);
            }
        });

        submitButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

            	String firstName = ftext.getText();
                String msg = "" + firstName;
                msg += " \n";
                
                if(ftext.getText().isEmpty() || protext.getText().isEmpty() || usertext.getText().isEmpty() || mobile.getText().isEmpty() || ctext.getText().isEmpty()) {
                	JOptionPane.showMessageDialog(submitButton, "Any one is empty");
                }
                else {
                	
                	try {
                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo", "root", "nirmal@1999");

                        PreparedStatement st = (PreparedStatement) connection.prepareStatement("insert into account(FullName,Profession,PAN,Mobile,Password) values(?,?,?,?,?);");
                        st.setString(1,ftext.getText());
                        st.setString(2,protext.getText());
                        st.setString(3,usertext.getText());
                        st.setString(4,mobile.getText());
                        st.setString(5,ctext.getText());
                        int x = st.executeUpdate();
                        if (x == 0) {
                            JOptionPane.showMessageDialog(submitButton, "This is alredy exist");
                        } else {
                            JOptionPane.showMessageDialog(submitButton,
                                "Welcome, " + msg + "Your account is sucessfully created");
                        }
                        connection.close();
                    } catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
            }
        });

        clearButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                ftext.setText("");
                protext.setText("");
                usertext.setText("");
                mobile.setText("");
                ctext.setText("");
            }
        });

        frame.add(fname);
        frame.add(lname);
        frame.add(uName);
        frame.add(upass);
        frame.add(cpass);
        frame.add(submitButton);
        frame.add(clearButton);
        frame.add(loginButton);
        frame.add(ctext);
        frame.add(mobile);
        frame.add(protext);
        frame.add(ftext);
        frame.add(usertext);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,480,480);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.DARK_GRAY);

	}

}
