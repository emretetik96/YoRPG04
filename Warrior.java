//class Warrior that uses methods from the superclass Character
public class Warrior extends Character{
	
	public Warrior(){
	    super();
		
	    }

    //constructor
    public Warrior(String name){
    	super();
    	_name = name;
    }

	
	public void normalize() {
		this._defense = 40;
		this._attack = .4;
		
	}


} //end Warrior
