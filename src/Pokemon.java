public abstract class Pokemon {
    public String name;
    public int level;
    public int hp;
    public String food;
    public String scream;
    public String type;

    // Constructor van Pokemon
    public Pokemon(String name, int level, int hp, String food, String scream, String type) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.scream = scream;
        this.type = type;
    }

    // Getter-methoden
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getLevel() {
        return level;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return scream;
    }

    // Setter voor HP zonder return
    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getType() {
        return type;
    }
}
