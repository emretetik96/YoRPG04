//class Cleric that can heal itself
public class Cleric extends Character {

	
	public Cleric(){
		super();
	}
	//constructor
	public Cleric(String name){
	    super();
	    _name = name;
		_health = 200;
		_strength =  20;
		_defense = 130;
		_attack = .25;
	}
	
	public void normalize() {
		this._defense = 130;
		this._attack = .25;
		
	}
	
	
}//end Cleric
