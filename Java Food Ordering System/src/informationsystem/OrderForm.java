package informationsystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrderForm extends JFrame 
{

	private JPanel contentPane;
	private JTable table;

	// Declare array size
	static Order ordArray[] = new Order[10];

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
					OrderForm frame = new OrderForm();
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
	public OrderForm() 
	{
		// Assign Objects into Array
		ordArray[0] = new Order(10001, "Chicken Burger", 2.12, "Samir", 5, 7);
		ordArray[1] = new Order(10002, "Bubble Tea", 3.28, "Shun", 3, 15);
		ordArray[2] = new Order(10003, "Deluxe Pizza", 2.19, "Mlynar", 5, 18);
		ordArray[3] = new Order(10004, "Mala Xian Gao", 5.11, "Hoederer", 3, 24);
		ordArray[4] = new Order(10005, "Bolognese Spaghetti", 4.26, "Sora", 5, 16);
		ordArray[5] = new Order(10006, "Fried Chicken", 5.28, "Mostima", 24, 2);
		ordArray[6] = new Order(10007, "Apple Pie", 1.20, "Exusiai", 8, 22);
		ordArray[7] = new Order(10008, "Baguette", 6.09, "Amiya", 12, 8);
		ordArray[8] = new Order(10009, "Ramen", 6.31, "Mizuki", 2, 14);
		ordArray[9] = new Order(10010, "Lasagne", 9.24, "Chiave", 4, 20);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 722, 576);
		setTitle("Green Gallery Food Ordering Information System - Order Form");
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 204, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 171, 686, 312);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setFont(new Font("Calibri", Font.PLAIN, 16));
		table.setRowHeight(32);
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Order ID", "Food Name",
				"Order Date (M/D)", "Customer Name", "Quantity", "Quoted Price" }));

		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		// Assigning Object to Table
		for (int i = 0; i < ordArray.length; i++) 
		{
			String id = " " + ordArray[i].getOrderID();
			String fName = " " + ordArray[i].getFoodName();
			String date = " " + ordArray[i].getOrderDate();
			String cName = " " + ordArray[i].getCustomerName();
			String quantity = " " + ordArray[i].getQuantity();
			String quotedPrice = " " + ordArray[i].getQuotedPrice();

			String data[] = new String[] { id, fName, date, cName, quantity, quotedPrice };
			model.addRow(data);
		}

		scrollPane.setViewportView(table);

		JLabel lblOrderForm = new JLabel("Order Form");
		lblOrderForm.setFont(new Font("Calibri", Font.BOLD, 30));
		lblOrderForm.setBounds(26, 21, 182, 40);
		contentPane.add(lblOrderForm);

		JLabel lblInformationTable = new JLabel("Information Table");
		lblInformationTable.setForeground(Color.WHITE);
		lblInformationTable.setFont(new Font("Calibri", Font.BOLD, 28));
		lblInformationTable.setBounds(26, 50, 234, 48);
		contentPane.add(lblInformationTable);

		JLabel lblGreenGallery = new JLabel("Green Gallery | Version 1.0");
		lblGreenGallery.setFont(new Font("Calibri", Font.BOLD, 16));
		lblGreenGallery.setBounds(10, 494, 229, 32);
		contentPane.add(lblGreenGallery);

		JLabel lblTitle4 = new JLabel("Developed by NTT Data Myanmar Software Co.Ltd");
		lblTitle4.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTitle4.setForeground(Color.BLACK);
		lblTitle4.setFont(new Font("Calibri", Font.BOLD, 14));
		lblTitle4.setBounds(343, 494, 353, 32);
		contentPane.add(lblTitle4);

		JButton btnSortPrice = new JButton("Sort by Price");
		btnSortPrice.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				OrderForm oForm = new OrderForm();
				oForm.getOrdArray();

				// Bubble Sort Algorithm for Price
				Order temp = null;

				for (int i = 1; i <= ordArray.length; i++)
				{
					for (int j = 1; j <= ordArray.length - i; j++) 
					{
						if (ordArray[j - 1].getQuotedPrice() > ordArray[j].getQuotedPrice()) 
						{
							temp = ordArray[j - 1];
							ordArray[j - 1] = ordArray[j];
							ordArray[j] = temp;
						}
					}
				}
				model.setRowCount(0);
				// Assigning Object to Table
				for (int i = 0; i < ordArray.length; i++) 
				{
					String id = " " + ordArray[i].getOrderID();
					String fName = " " + ordArray[i].getFoodName();
					String date = " " + ordArray[i].getOrderDate();
					String cName = " " + ordArray[i].getCustomerName();
					String quantity = " " + ordArray[i].getQuantity();
					String quotedPrice = " " + ordArray[i].getQuotedPrice();

					String data[] = new String[] { id, fName, date, cName, quantity, quotedPrice };
					model.addRow(data);
				}
			}
		});
		btnSortPrice.setBounds(161, 125, 159, 23);
		contentPane.add(btnSortPrice);

		JButton btnSortOD = new JButton("Sort by Order Date");
		btnSortOD.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				OrderForm oForm = new OrderForm();
				oForm.getOrdArray();
				// Bubble Sort Algorithm for Order Date
				Order temp = null;
				for (int i = 1; i <= ordArray.length; i++) 
				{
					for (int j = 1; j <= ordArray.length - i; j++) 
					{
						if (ordArray[j - 1].getOrderDate() > ordArray[j].getOrderDate()) 
						{
							temp = ordArray[j - 1];
							ordArray[j - 1] = ordArray[j];
							ordArray[j] = temp;
						}
					}
				}
				model.setRowCount(0);
				// Assigning Object to Table
				for (int i = 0; i < ordArray.length; i++) 
				{
					String id = " " + ordArray[i].getOrderID();
					String fName = " " + ordArray[i].getFoodName();
					String date = " " + ordArray[i].getOrderDate();
					String cName = " " + ordArray[i].getCustomerName();
					String quantity = " " + ordArray[i].getQuantity();
					String quotedPrice = " " + ordArray[i].getQuotedPrice();

					String data[] = new String[] { id, fName, date, cName, quantity, quotedPrice };
					model.addRow(data);
				}
			}
		});
		btnSortOD.setBounds(336, 125, 159, 23);
		contentPane.add(btnSortOD);

		JLabel lblNewLabel = new JLabel("Sort Option :");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setBounds(0, 120, 151, 40);
		contentPane.add(lblNewLabel);

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

		JLabel lblOrderList = new JLabel("2022 Order List");
		lblOrderList.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrderList.setFont(new Font("Calibri", Font.BOLD, 24));
		lblOrderList.setBounds(514, 55, 182, 40);
		contentPane.add(lblOrderList);
	}

	// Array Return Method
	public static Order[] getOrdArray() 
	{
		return ordArray;
	}
}
