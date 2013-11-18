public class Mage extends Character{
    
    public Mage() {
    	super();
    	_strength = 30;
    	_attack = 0.7;
    }
    public Mage(String name) {
    	this();
    	_name = name;
    }
    
    public String getName() {
    	return _name; 
    }
    public void normalize() {
		this._defense = 60;
		this._attack = .6;
		
	}
}
