package entities;

public class Product {
	
	public String name;
	public float price;
	public int quantity;
	
	public double TotalValueInStock()
	{
		return price * quantity;
	}
	
	public void AddProducts(int quantity)
	{
		this.quantity += quantity;
	}
	
	public void RemoveProducts(int quantity)
	{
		this.quantity -= quantity;
	}
	
	public String toString()
	{
		return "Product: " + name + ", price $" + String.format("%.2f", price) + ", " + quantity + " units, total $" + String.format("%.2f",TotalValueInStock());
	}
	
}
