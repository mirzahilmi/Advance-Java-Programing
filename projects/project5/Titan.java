package projects.project5;

import java.util.concurrent.ThreadLocalRandom;

public class Titan extends Character{
         
    public Titan() {
        super.setHP(200);
        super.setAttack(45);
        super.setDefense(0);
    }
    
    @Override
    public boolean attack() {
        return ThreadLocalRandom.current().nextFloat(1, 10 + 1) <= 4.0F ? true : false;
    }
}
