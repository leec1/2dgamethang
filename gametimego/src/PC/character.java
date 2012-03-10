package PC;

public abstract class character {
	private inventory inv;
	private int str,dex,wis,intl,cha,con;
	static final int HEAD=0;
	static final int CHEST=1;
	static final int LEGS=2;
	static final int GLOVES=3;
	static final int BOOTS=4;
	private inventoryItem[] armor;
	hand rightHand,lefthand;
	public character(String name,int str,int dex,int wis, int intl, int cha, int con){
	    this.str=str;
	    this.dex=dex;
	    this.wis=wis;
	    this.intl=intl;
	    this.con=cha;
	    this.con=con;
	    inv=new inventory(str);     
	    armor=new inventoryItem[5];
	    rightHand=new hand();
	}
	
	public inventory getInv() {
		return inv;
	}

	
	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getWis() {
		return wis;
	}

	public void setWis(int wis) {
		this.wis = wis;
	}

	public int getIntl() {
		return intl;
	}

	public void setIntl(int intl) {
		this.intl = intl;
	}

	public int getCha() {
		return cha;
	}

	public void setCha(int cha) {
		this.cha = cha;
	}

	public int getCon() {
		return con;
	}

	public void setCon(int con) {
		this.con = con;
	}

	public void useItem(String itemname){
		inventoryItem tobeused=inv.remove(itemname);
		
		
	}
	private class hand{
		
		
	}
}
