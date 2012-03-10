package PC;

public abstract class character {
	inventory inv;
	int str,dex,wis,intl,cha,con;
	public character(String name){
	    
		inv=new inventory(str);     
	
	
	
	
	
	}
	
	public void useItem(String itemname){
		inventoryItem tobeused=inv.remove(itemname);
		
		
	}
}
