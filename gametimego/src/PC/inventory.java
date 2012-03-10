package PC;
import java.util.*;
public class inventory {
ArrayList<tuple> inventory;
int maxWeight,currentWeight;
public inventory(int strength){
	
	
	
	
}

 public void addItem(inventoryItem item){
	tuple t = new tuple(item);
	if(currentWeight+item.getItemWeight() <maxWeight){
    for(int i=0;i<inventory.size();i++)
    {
    	if(t.getItem().getName()==inventory.get(i).getItem().getName())
    	{
    		int quant = inventory.get(i).getQuantity();
    		inventory.get(i).setQuantity(quant++);
    		currentWeight+=inventory.get(i).getItem().getItemWeight();
    		return;
    	}
    	
    }
    currentWeight+= t.getItem().getItemWeight();
	inventory.add(t);
	}
	
}
public inventoryItem remove(String itemName){
	inventoryItem item=null;
	for(int i=0;i<inventory.size();i++)
	{
		if(inventory.get(i).getItem().getName().equalsIgnoreCase(itemName)){
			item=inventory.get(i).getItem();
			currentWeight-=inventory.get(i).getItem().getItemWeight();
			if(inventory.get(i).getQuantity()>1){
				inventory.get(i).setQuantity(inventory.get(i).getQuantity()-1);
				
			}
			else
				inventory.remove(i);
		}
	}
	return item;
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
