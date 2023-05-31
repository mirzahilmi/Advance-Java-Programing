package projects.project5;

import java.util.concurrent.ThreadLocalRandom;;

public class Healer extends Character {
         
    public Healer() {
        setHP(70);
        setAttack(10);
        setDefense(10);
    }
    
    @Override
    public boolean attack() {
        return ThreadLocalRandom.current().nextFloat(1, 10 + 1) <= 8.5F ? true : false;
    }

    public void heal() {
        setHP(getHP() + 25);
    }
    
}
