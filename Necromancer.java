
public class Necromancer extends Character{

	
	public Necromancer(){
		super();
		_health = 100;
		_strength = 75;
		_defense = 50;
		
	}
	
	public Necromancer(String name){
		super();
		_health = 100;
		_strength = 75;
		_defense = 50;
		_name = name;
	}
	
	public int drain(Character dec){
		int leech = dec._health;
		this._health += leech;
		return leech;
	}
	
	public void normalize() {
		this._defense = 50;
		this._attack = .4;
		
	}

}//end class Necromancer
