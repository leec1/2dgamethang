package PC;
import java.util.*;

public class inventory{

	private HashMap<String, tuple> inventory;
	private int maxWeight;
	private int currentWeight;

	public inventory(int strength){
		maxWeight= (int) (68 * Math.pow(Math.E, .1*strength)) ;
		currentWeight=0;

	}

	public void addItem(inventoryItem item){
		if(currentWeight + item.getItemWeight() <= maxWeight){
			currentWeight += item.getItemWeight();
			tuple t = inventory.get(item.getName());
			if(t != null){
    				t.setQuantity(t.getQuantity()+1);
			}else{
				inventory.add(item.getName(), new tuple(item));
			}	
		}else{
			//Inventory Full, Item too heavy to be added to the pack
		}
	}

	public inventoryItem remove(String itemName)
		tuple t =inventory.get(itemName.toLowerCase());
		if(t!=null){
			inventoryItem item = t.getItem();
			currentWeight -= item.getItemWeight();
			if(t.getQuantity()>1){
				t.setQuantity(t.getQuantity()-1);
			}else{
				inventory.remove(itemName.toLowerCase());
			}
			return item;
		}
		return null; //None of that item in the inventory
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
