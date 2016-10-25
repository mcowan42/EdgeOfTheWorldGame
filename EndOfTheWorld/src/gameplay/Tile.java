package gameplay;

public class Tile {

	private int type;
	
	Tile (int type){
		this.type=type;
	}
	
	public String Label(){
		if (this.type == 0){
			return "ShipF";
		}else	
		if (this.type == -1){
			return "ShipB";
		}else
		if (this.type == 1){
			return "Open";
		}else
		if (this.type == 2){
			return "Mine";
		}else
		if (this.type == 3){
			return "Supply";
		}else{
			return "Null";
		}		
	}
	
	public int calculateHealth(int type, int health){
		if (type==2){
			health=health - 3;
			if (health<0){
				health=0;
			}
		}
		if (type==3){
			health=health+1;
			if (health>10){
				health=10;
			}
		}
		return health;
	}
	
}
