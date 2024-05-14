package informationsystem;

//Create Order Object
public class Order 
{
	//Declare Order Attributes
	private int OrderID;
	private String FoodName;
	private double OrderDate;
	private String CustomerName;
	private int Quantity;
	private int QuotedPrice;
	
	//Create Constructors
	public Order() 
	{
		super();
	}

	public Order(int orderID, String foodName, double orderDate, String customerName, int quantity, int quotedPrice) 
	{
		super();
		OrderID = orderID;
		FoodName = foodName;
		OrderDate = orderDate;
		CustomerName = customerName;
		Quantity = quantity;
		QuotedPrice = quotedPrice;
	}

	//Create Getter & Setter
	public int getOrderID() 
	{
		return OrderID;
	}

	public void setOrderID(int orderID) 
	{
		OrderID = orderID;
	}

	public String getFoodName() 
	{
		return FoodName;
	}

	public void setFoodName(String foodName) 
	{
		FoodName = foodName;
	}

	public double getOrderDate() 
	{
		return OrderDate;
	}

	public void setOrderDate(double orderDate) 
	{
		OrderDate = orderDate;
	}

	public String getCustomerName() 
	{
		return CustomerName;
	}

	public void setCustomerName(String customerName) 
	{
		CustomerName = customerName;
	}

	public int getQuantity() 
	{
		return Quantity;
	}

	public void setQuantity(int quantity) 
	{
		Quantity = quantity;
	}

	public int getQuotedPrice() 
	{
		return QuotedPrice;
	}

	public void setQuotedPrice(int quotedPrice) 
	{
		QuotedPrice = quotedPrice;
	}
	
	
	
	
	
	
	
}
