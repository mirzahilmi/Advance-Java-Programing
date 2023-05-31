package projects.project5;

public abstract class Character {

    private int defense;
    private int attack;
    private int hp;

    public abstract boolean attack();

    public void receiveDamage(int damage) {
        hp = (hp - damage > -1) ? hp - (damage - defense) : 0;
    }

    public void info() {
        System.out.printf(
            "------------ STATUS ------------\nRole\t: %s\nHP\t: %d\nAttack\t: %d\nDefense\t: %d\n",
            this.getClass().getSimpleName(),
            hp,
            attack,
            defense
        );
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }

    public int getDefense() {
        return defense;
    }

    public int getAttack() {
        return attack;
    }

    public int getHP() {
        return hp;
    }
}
