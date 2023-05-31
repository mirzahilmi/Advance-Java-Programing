package projects.project5;

import java.util.concurrent.ThreadLocalRandom;

public class Warrior extends Character {
         
    public Warrior() {
        super.setHP(80);
        super.setAttack(25);
        super.setDefense(30);
    }
    
    @Override
    public boolean attack() {
        return ThreadLocalRandom.current().nextFloat(1, 10 + 1) <= 6.0F ? true : false;
    }
    
}
