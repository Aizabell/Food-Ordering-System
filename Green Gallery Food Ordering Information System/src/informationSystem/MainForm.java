package informationsystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainForm extends JFrame 
{

	private JPanel contentPane;

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
					MainForm frame = new MainForm();
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
	 * Create the frame.
	 */
	public MainForm() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 813, 561);
		setTitle("Green Gallery Food Ordering Information System - Main Menu");
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 204, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Food Ordering Information System");
		lblWelcome.setFont(new Font("Calibri", Font.BOLD, 44));
		lblWelcome.setBounds(73, 11, 663, 74);
		contentPane.add(lblWelcome);
		
		JLabel lblWelcomeBackAdmintrator = new JLabel("Welcome Back Admintrator!");
		lblWelcomeBackAdmintrator.setForeground(new Color(255, 255, 255));
		lblWelcomeBackAdmintrator.setFont(new Font("Calibri", Font.BOLD, 32));
		lblWelcomeBackAdmintrator.setBounds(193, 77, 466, 62);
		contentPane.add(lblWelcomeBackAdmintrator);
		
		JLabel lbTitle1 = new JLabel("Green Gallery");
		lbTitle1.setForeground(new Color(255, 255, 255));
		lbTitle1.setFont(new Font("Calibri", Font.BOLD, 50));
		lbTitle1.setBounds(54, 270, 381, 63);
		contentPane.add(lbTitle1);
		
		JLabel lblTitle3 = new JLabel("Version 1.0");
		lblTitle3.setFont(new Font("Calibri", Font.BOLD, 20));
		lblTitle3.setBounds(10, 479, 140, 32);
		contentPane.add(lblTitle3);
		
		JLabel lblTitle4 = new JLabel("Developed by NTT Data Myanmar Software Co.Ltd");
		lblTitle4.setForeground(new Color(0, 0, 0));
		lblTitle4.setFont(new Font("Calibri", Font.BOLD, 16));
		lblTitle4.setBounds(434, 479, 353, 32);
		contentPane.add(lblTitle4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.BLACK);
		panel_1.setBackground(new Color(0, 102, 255));
		panel_1.setBounds(31, 331, 228, 10);
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setForeground(Color.BLACK);
		panel_1_1.setBackground(new Color(0, 102, 255));
		panel_1_1.setBounds(31, 270, 10, 71);
		contentPane.add(panel_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setForeground(Color.BLACK);
		panel_1_2.setBackground(new Color(0, 102, 255));
		panel_1_2.setBounds(268, 249, 104, 10);
		contentPane.add(panel_1_2);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setForeground(Color.BLACK);
		panel_1_1_1.setBackground(new Color(0, 102, 255));
		panel_1_1_1.setBounds(362, 249, 10, 71);
		contentPane.add(panel_1_1_1);
		
		//Open Order Form
		JButton btnOrderForm = new JButton("Order Form");
		btnOrderForm.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				OrderForm OForm = new OrderForm();
				OForm.setVisible(true);
			}
		});
		btnOrderForm.setFont(new Font("Calibri", Font.PLAIN, 30));
		btnOrderForm.setBounds(479, 216, 237, 90);
		contentPane.add(btnOrderForm);
		
		//Open Search Form
		JButton btnSearchForm = new JButton("Search Form");
		btnSearchForm.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				SearchForm SForm = new SearchForm();
				SForm.setVisible(true);
			}
		});
		btnSearchForm.setFont(new Font("Calibri", Font.PLAIN, 30));
		btnSearchForm.setBounds(479, 348, 237, 90);
		contentPane.add(btnSearchForm);
	}
}
