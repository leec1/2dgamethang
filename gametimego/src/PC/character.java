package PC;

public abstract class character {
	inventory inv;
	int str,dex,wis,intl,cha,con;
	
	public character(String name,int str,int dex,int wis, int intl, int cha, int con){
	    this.str=str;
	    this.dex=dex;
	    this.wis=wis;
	    this.intl=intl;
	    this.con=cha;
	    this.con=con;
	    inv=new inventory(str);     
	    
	
	
	
	
	}
	
	public void useItem(String itemname){
		inventoryItem tobeused=inv.remove(itemname);
		
		
	}
}
