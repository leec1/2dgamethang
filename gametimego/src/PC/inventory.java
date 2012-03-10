package PC;
import java.util.*;
public class inventory {
ArrayList<tuple> inventory;
int maxWeight,currentWeight;
public inventory(int strength){
	
	
	
	
}

 public void addItem(inventoryItem item){
	tuple t = new tuple(item);
    
	
	
	
}
public inventoryItem remove(String itemName){
	
	
	return null;
}
private class tuple{
	private int quantity;
	private int getQuantity() {
		return quantity;
	}
	private void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	private inventoryItem item;
	private tuple(inventoryItem i){
		item=i;
		quantity=1;
	}
	private inventoryItem getItem() {
		return item;
	}
	private void setItem(inventoryItem item) {
		this.item = item;
	}
	
}
}
