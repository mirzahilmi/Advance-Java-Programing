package test;
class Hero {
    String name;
    int health;
    int damage;
    String type;
    int mana;

    Hero(String name, int health, int power, String type, int mana) {
        this.name = name;
        this.health = health;
        this.damage = power;
        this.type = type;
        this.mana = mana;
    }

    void Attack(Enemy enemy) {
        enemy.health -= this.damage;
    }

    void Heal() {
        this.health += this.mana;
    }

    void Ultimate(Enemy enemy) {
        enemy.health -= (Math.random() * this.damage) + this.damage;
    }
}
