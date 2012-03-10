package PC;

import org.newdawn.slick.Image;


public abstract class inventoryItem {
	String name;
	int itemWeight;
	Image img;
	public int getItemWeight() {
		return itemWeight;
	}

	public void setItemWeight(int itemWeight) {
		this.itemWeight = itemWeight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
