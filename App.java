package javagui;

import java.awt.Color;
import java.awt.event.*;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class App extends JFrame{

	private JFrame frame;
	private JLabel user;
	private JTextArea userText;
	private JLabel pass;
	private JPasswordField passText;
	private JButton login;
	private JButton regButton;

	/**
	 * Launch the application.
	**/
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
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
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		
        frame = new JFrame("Login");
        

        user = new JLabel("PAN No.");
        user.setBounds(44,76,110,30);
        user.setForeground(Color.BLACK);
        user.setFont(user.getFont().deriveFont(18.0f));
        userText = new JTextArea();
        userText.setBounds(183,80,200,30);
        userText.setBackground(Color.WHITE);
        userText.setFont(userText.getFont().deriveFont(15.0f));

        pass = new JLabel("Password");
        pass.setBounds(44,134,100,30);
        pass.setForeground(Color.BLACK);
        pass.setFont(pass.getFont().deriveFont(18.0f));
        passText =new JPasswordField();
        passText.setBounds(183,136,200,30);
        passText.setBackground(Color.WHITE);
        passText.setFont(passText.getFont().deriveFont(15.0f));

        login = new JButton("LOGIN");
        login.setBounds(183,230,80,30);
        login.setBackground(Color.BLUE);
        login.setForeground(Color.WHITE);
        login.setFont(login.getFont().deriveFont(14.0f));

        regButton = new JButton("Register");
        regButton.setBounds(284,230,100,30);
        regButton.setBackground(Color.RED);
        regButton.setForeground(Color.WHITE);
        regButton.setFont(regButton.getFont().deriveFont(14.0f));
        
        JLabel lblNewLabel_1 = new JLabel("Insert PAN Number");
        lblNewLabel_1.setBounds(183, 109, 200, 24);
        lblNewLabel_1.setVisible(false);
        lblNewLabel_1.setForeground(Color.RED);
        
        JLabel lblNewLabel_2 = new JLabel("Insert Password");
        lblNewLabel_2.setBounds(183, 167, 200, 24);
        lblNewLabel_2.setVisible(false);
        lblNewLabel_2.setForeground(Color.RED);

        login.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(userText.getText().isEmpty()) {
                	lblNewLabel_2.setVisible(false);
                	lblNewLabel_1.setVisible(true);
                }
                else if(passText.getText().isEmpty()) {
                	lblNewLabel_1.setVisible(false);
                	lblNewLabel_2.setVisible(true);
                }
                else {
                	lblNewLabel_1.setVisible(false);
                	lblNewLabel_2.setVisible(false);
                	try {
                        Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo","root", "nirmal@1999");

                        PreparedStatement st = (PreparedStatement) connection.prepareStatement("Select * from account where PAN=? and Password=?");
                        st.setString(1, userText.getText());
                        st.setString(2, passText.getText());
                        ResultSet rs = st.executeQuery();
                        if (rs.next()) {
                        	JOptionPane.showMessageDialog(login, "You have successfully logged in");
                            Income ah = new Income();
                            ah.setTitle("Welcome");
                            ah.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(login, "Wrong Username or Password");
                            userText.setText("");
                            passText.setText("");
                        }
                    } catch (SQLException sqlException) {
                        sqlException.printStackTrace();
                    }
                }
            }
        });

        regButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Registration reg = new Registration();
                reg.setVisible(true);
            }
        });
        
        JLabel lblNewLabel = new JLabel("Forget Password");
        lblNewLabel.setBounds(284, 190, 99, 30);
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(lblNewLabel.getFont().deriveFont(12.0f));
        lblNewLabel.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Forget fg = new Forget();
				fg.setVisible(true);
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
        });
        
        
        frame.getContentPane().add(lblNewLabel);
        frame.getContentPane().add(user);
        frame.getContentPane().add(pass);
        frame.getContentPane().add(userText);
        frame.getContentPane().add(passText);
        frame.getContentPane().add(login);
        frame.getContentPane().add(regButton);
        frame.getContentPane().add(lblNewLabel_1);
        frame.getContentPane().add(lblNewLabel_2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,374);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.ORANGE);
        
        
	}
}
