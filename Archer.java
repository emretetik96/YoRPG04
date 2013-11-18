//class Archer
//
public class Archer extends Character {

    public Archer() {
        super();
        _attack = 0.2;
        _strength = 80;
    }

    public int attack(Monster evil) {
        int damage = 0;
        damage = (int)(_strength * _attack) - evil.getDefense();
        if (damage < 0){
            damage = 0;
        }
        evil.lowerHP(damage);
        return damage;
    }

}
