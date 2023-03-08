class Enemy {
    String name;
    int health;
    int damage;
    String type;
    int mana;

    Enemy(String name, int health, int power, String type, int mana) {
        this.name = name;
        this.health = health;
        this.damage = power;
        this.type = type;
    }

    void Attack(Hero opponent) {
        opponent.health -= this.damage;
    }

    void Rage() {
        this.damage += this.mana;
    }

    void Ultimate(Hero opponent) {
        opponent.health -= (Math.random() * this.damage) + this.damage;
    }
}
