package genericsLambdas;

import java.util.LinkedList;

public class Inventory<S> {
	private LinkedList<S> stuff;
	
	public Inventory() {
		this.stuff = new LinkedList<S>();
	}
	
	public LinkedList<S> getItems() {
		return this.stuff;
	}
	
	public void addItem(S item) {
		this.stuff.addLast(item);
	}
	
	public LinkedList<S> removeItem(S item) {
		this.stuff.remove(item);
		return this.stuff;
	}
	
	public int itemQuantity() {
		return this.stuff.size();
	}
	
}
