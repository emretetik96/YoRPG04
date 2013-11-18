public class Zombie extends Character {
	public Zombie() {
		super();
		_health = 100; 
		_attack = 0.8;
	}
	public void normalize() {
		this._defense = 30;
		this._attack = .6;
		
	}
}
