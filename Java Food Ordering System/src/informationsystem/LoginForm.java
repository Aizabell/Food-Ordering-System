package informationsystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;



import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField pfPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					LoginForm frame = new LoginForm();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the Login frame.
	 */
	public LoginForm() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 759, 516);
		setTitle("Green Gallery Food Ordering Information System - Login");
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 204, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), null));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBackground(UIManager.getColor("CheckBox.background"));
		panel.setBounds(414, 32, 303, 434);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblLogin = new JLabel("L O G I N");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Calibri", Font.BOLD, 32));
		lblLogin.setBounds(82, 49, 140, 42);
		panel.add(lblLogin);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Calibri", Font.BOLD, 24));
		lblUsername.setBounds(33, 179, 115, 30);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Calibri", Font.BOLD, 24));
		lblPassword.setBounds(33, 259, 115, 30);
		panel.add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(33, 210, 241, 26);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		pfPassword = new JPasswordField();
		pfPassword.setBounds(33, 292, 241, 26);
		panel.add(pfPassword);
		
		JButton btnlogin = new JButton("Login");
		btnlogin.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnlogin.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String name=txtUsername.getText();
				String pass=pfPassword.getText();
				if(name.equals("Admin") && pass.equals("grEEn2022!"))
				{
					MainForm MForm = new MainForm();
					MForm.setVisible(true);
					dispose();
				}
				else JOptionPane.showMessageDialog(null, "Username or Password is incorrect!");
			}
		});
		btnlogin.setBounds(33, 364, 115, 26);
		panel.add(btnlogin);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnClear.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				txtUsername.setText(null);
				pfPassword.setText(null);
			}
		});
		btnClear.setBounds(159, 364, 115, 26);
		panel.add(btnClear);
		
		JLabel lbTitle1 = new JLabel("Green Gallery");
		lbTitle1.setFont(new Font("Calibri", Font.BOLD, 32));
		lbTitle1.setBounds(10, 32, 208, 63);
		contentPane.add(lbTitle1);
		
		JLabel lbTitle2 = new JLabel("Food Order Information System");
		lbTitle2.setForeground(new Color(255, 255, 255));
		lbTitle2.setFont(new Font("Calibri", Font.BOLD, 28));
		lbTitle2.setBounds(10, 79, 378, 48);
		contentPane.add(lbTitle2);
		
		JLabel lblTitle3 = new JLabel("Version 1.0");
		lblTitle3.setFont(new Font("Calibri", Font.BOLD, 20));
		lblTitle3.setBounds(10, 367, 140, 32);
		contentPane.add(lblTitle3);
		
		JLabel lblTitle4 = new JLabel("Developed by NTT Data Myanmar Software Co.Ltd");
		lblTitle4.setForeground(Color.WHITE);
		lblTitle4.setFont(new Font("Calibri", Font.BOLD, 16));
		lblTitle4.setBounds(10, 410, 353, 32);
		contentPane.add(lblTitle4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 102, 255));
		panel_1.setForeground(Color.BLACK);
		panel_1.setBounds(0, 126, 341, 10);
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setForeground(Color.BLACK);
		panel_1_1.setBackground(new Color(0, 102, 255));
		panel_1_1.setBounds(0, 399, 131, 10);
		contentPane.add(panel_1_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setForeground(Color.BLACK);
		panel_1_1_1.setBackground(new Color(0, 102, 255));
		panel_1_1_1.setBounds(0, 439, 363, 10);
		contentPane.add(panel_1_1_1);
	}
}
