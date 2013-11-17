//Ruzeb Chowdhury
//pd9
//HW25
//2013-11-14

//methods and instances for superclass Character
public abstract class Character {

    //instance variables
    protected String _name;
	protected int  _health, _strength, _defense;
    protected double _attack;

    //constructor
    public Character(){
		_health = 125;
		_strength = 100;
		_defense = 40;
		_attack = 0.4;
    }

    //checks to see if character is still alive
    public boolean isAlive(){
		boolean result = false;
		if (_health > 0)
		    result = true;
		else
		    result = false;
		return result;
    }
    
    //attack
    public int attack(Character type){
    	int damage = 0;
    	damage = (int)(this._strength * this._attack) - type.getDefense();
    	if (damage < 0)
       		damage = 0;
    	type.lowerHP(damage);
	    return damage;
    }

    //Accessors
    public int getDefense(){
    	return _defense;
    }
    
    public String getName(){
    	return _name;
    }

    //lowers the health by input value
    public void lowerHP(int point){
    	_health -= point;
    }
    
    
    //increases character's attack by 1 and decreases defense by 10
    public void specialize(){
    	_defense -= 10;
    	_attack += 1;
    }
    
    //reverts stats for defense and attack back to normal
    public abstract void normalize();
    
    //heals a Cleric
    public int heal(Cleric med){
		int hp = 5 + (int)( Math.random() * 20 );
		if (med.isAlive() && med._health < 30)
			med._health += hp;
	
		return hp;
	}
    
    //helpers
    public boolean isWarrior(Character test){
        Character war = new Warrior();
        if (test.getClass() == war.getClass())
             return true;
        else 
             return false;
    }
    
    public boolean isCleric(Character test){
        Character heal = new Cleric();
        if (test.getClass() == heal.getClass())
             return true;
        else 
             return false;
    }
    
    public boolean isNecro(Character test){
        Character leech = new Necromancer();
        if (test.getClass() == leech.getClass())
             return true;
        else 
             return false;
    }
    
    //about supplies descriptions about the character
    public static String about(Character player){
    	Character mon = new Monster();
    	String mondesc = 
    			"Found in the lowest rungs of Dante's Inferno, the monster is equipped "+
    			"with 150 health, random strength between 20 and 65, defense of 20, and attack of 1";
    			
    	Character war = new Warrior();
    	String wardesc = 
    			"Glorified by the Greek gods, the warrior is equipped with 125 health,"+
    			"100 strength, 40 defense, and 0.4 attack, but comes with its own specialized power!";
    	Character heal = new Cleric();
    	String healdesc = 
    			"Your savior in battle, the Cleric is able to heal Warriors, but is not"+
    			"a great fighter. Clerics have 200 health, 20 strength, 130 defense, and .05 attack!";
    	Character leech = new Necromancer();
    	String leechdesc = 
    			"Born under Hades' guardianship, the necromancer is a hero with dark powers."+
    			"The Necromancer is able to drain the life points of dead enemies!";
    	if (player.getClass() == mon.getClass())
    		return mondesc;
    	else if (player.getClass() == war.getClass())
    		return wardesc;
    	else if (player.getClass() == heal.getClass())
    		return healdesc;
    	else if (player.getClass() == leech.getClass())
    		return leechdesc;
    	else
    		return "Your character must be new within these territories!";
    		
    }
 
} //end Character

