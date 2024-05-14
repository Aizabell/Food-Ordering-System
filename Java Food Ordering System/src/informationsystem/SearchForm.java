package informationsystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchForm extends JFrame 
{

	private JPanel contentPane;
	private JTable table;
	private JTextField txtSearch;

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
					SearchForm frame = new SearchForm();
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
	public SearchForm() 
	{
		//Declaring and recalling Object Array
		OrderForm form=new OrderForm();
		Order ordArray[]=form.getOrdArray();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 696, 440);
		setTitle("Green Gallery Food Ordering Information System - Search Form");
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 204, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 203, 660, 154);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel
		(
			new Object[][] {},
			new String[] 
			{
				"Order ID", "Food Name", "Order Date (M/D)", "Customer Name", "Quantity", "Quoted Price"
			}
		));
		table.setRowHeight(32);
		table.setFont(new Font("Calibri", Font.PLAIN, 16));
		DefaultTableModel model=(DefaultTableModel)table.getModel();
		scrollPane.setViewportView(table);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setForeground(Color.BLACK);
		panel_1_2.setBackground(new Color(0, 102, 255));
		panel_1_2.setBounds(10, 88, 252, 10);
		contentPane.add(panel_1_2);
		
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setForeground(Color.BLACK);
		panel_1_2_1.setBackground(new Color(0, 102, 255));
		panel_1_2_1.setBounds(10, 11, 10, 87);
		contentPane.add(panel_1_2_1);
		
		JLabel lblInformationTable = new JLabel("Information Table");
		lblInformationTable.setForeground(Color.WHITE);
		lblInformationTable.setFont(new Font("Calibri", Font.BOLD, 28));
		lblInformationTable.setBounds(26, 50, 234, 48);
		contentPane.add(lblInformationTable);
		
		JLabel lblSearchForm = new JLabel("Search Form");
		lblSearchForm.setFont(new Font("Calibri", Font.BOLD, 30));
		lblSearchForm.setBounds(26, 21, 182, 40);
		contentPane.add(lblSearchForm);
		
		JRadioButton rdbtnFoodName = new JRadioButton("Search by Food Name");
		rdbtnFoodName.setBounds(10, 122, 163, 23);
		contentPane.add(rdbtnFoodName);
		
		JRadioButton rdbtnCustomerName = new JRadioButton("Search by Customer Name");
		rdbtnCustomerName.setBounds(186, 122, 192, 23);
		contentPane.add(rdbtnCustomerName);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnFoodName);
		bg.add(rdbtnCustomerName);
		
		txtSearch = new JTextField();
		txtSearch.setFont(new Font("Calibri", Font.PLAIN, 16));
		txtSearch.setBounds(10, 152, 542, 30);
		contentPane.add(txtSearch);
		txtSearch.setColumns(10);
		
		//Search for String array with respective Data Field
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(rdbtnFoodName.isSelected())
				{
					searchFood(ordArray, txtSearch.getText());
				}
				else if(rdbtnCustomerName.isSelected())
				{
					searchCustomer(ordArray, txtSearch.getText());
				}
			}
			
			//Linear Search Algorithm for Customer Name
			protected void searchCustomer(Order[] ordArray, String text) 
			{
				((DefaultTableModel)table.getModel()).setRowCount(0);
				
				for (int i=0;i<ordArray.length;i++)
				{
					if(text.equals(ordArray[i].getCustomerName()))
					{
						String id = " " + ordArray[i].getOrderID();
						String fName = " " + ordArray[i].getFoodName();
						String date = " " + ordArray[i].getOrderDate();
						String cName = " " + ordArray[i].getCustomerName();
						String quantity = " " + ordArray[i].getQuantity();
						String quotedPrice = " " + ordArray[i].getQuotedPrice();
						
						String data[] = new String[] {id, fName, date, cName, quantity, quotedPrice};
						model.addRow(data);
					}
				}		
			}
			
			//Linear Search Algorithm for Food Name
			protected void searchFood(Order[] ordArray, String text)
			{
				((DefaultTableModel)table.getModel()).setRowCount(0);
				
				for (int i=0;i<ordArray.length;i++)
				{
					if(text.equals(ordArray[i].getFoodName()))
					{
						String id = " " + ordArray[i].getOrderID();
						String fName = " " + ordArray[i].getFoodName();
						String date = " " + ordArray[i].getOrderDate();
						String cName = " " + ordArray[i].getCustomerName();
						String quantity = " " + ordArray[i].getQuantity();
						String quotedPrice = " " + ordArray[i].getQuotedPrice();
						
						String data[] = new String[] {id, fName, date, cName, quantity, quotedPrice};
						model.addRow(data);
					}
				}		
			}
		});
		btnSearch.setBounds(562, 152, 108, 32);
		contentPane.add(btnSearch);
		
		JLabel lblGreenGallery = new JLabel("Green Gallery | Version 1.0");
		lblGreenGallery.setHorizontalAlignment(SwingConstants.LEFT);
		lblGreenGallery.setFont(new Font("Calibri", Font.BOLD, 16));
		lblGreenGallery.setBounds(10, 368, 229, 32);
		contentPane.add(lblGreenGallery);
		
		JLabel lblTitle4 = new JLabel("Developed by NTT Data Myanmar Software Co.Ltd");
		lblTitle4.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTitle4.setForeground(Color.BLACK);
		lblTitle4.setFont(new Font("Calibri", Font.BOLD, 14));
		lblTitle4.setBounds(317, 368, 353, 32);
		contentPane.add(lblTitle4);
	}
}
