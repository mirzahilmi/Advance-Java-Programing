package projects.project5;

import java.util.concurrent.ThreadLocalRandom;

public class Magician extends Character {
     
    public Magician() {
        super.setHP(100);
        super.setAttack(60);
        super.setDefense(10);
    }
    
    @Override
    public boolean attack() {
        return ThreadLocalRandom.current().nextFloat(1, 10 + 1) <= 3.5F ? true : false;
    }
    
}
