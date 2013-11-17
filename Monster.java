//Monster class that uses methods from the superclass Character
public class Monster extends Character{

  //constructor
    public Monster(){
	    super();
		_health = 150;
		_strength =  20 + (int)( Math.random() * 45 );
		_defense = 20;
		_attack = 1;
    }
    
    public void normalize() {
		this._defense = 20;
		this._attack = 1;
		
	}

}//end class Monster
