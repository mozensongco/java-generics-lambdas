package genericsLambdas;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.stream.Stream;

public class Product {

	// Just to make sure that the prices are formatted with 2 decimal places!
	private static final DecimalFormat df = new DecimalFormat("0.00");

	private String name;
	private double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public static void main(String[] args) {
		Inventory<Product> myInventory = new Inventory<Product>();
		myInventory.addItem(new Product("Fancy mug", 5.99));
		myInventory.addItem(new Product("Pencil case", 8.49));		
		myInventory.addItem(new Product("Headphones", 19.99));

		double totalPrice = 0.00;
		
		LinkedList<Product> things = myInventory.getItems();
		Stream<Product> widgets = things.stream();
		totalPrice = widgets.mapToDouble(product -> product.getPrice()).sum();
		System.out.printf("The total price of all the items in inventory is %s.", df.format(totalPrice));
		
	}
}
