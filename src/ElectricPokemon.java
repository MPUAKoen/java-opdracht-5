import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    public ElectricPokemon(String type, int level, int hp, String name, String scream) {
        super (type, level, hp, name, scream);
    }

    public ElectricPokemon(String name, int level, int hp, int food, Object sound) {
        super ();
    }

    public List<String> getAttacks() {
        List<String> electrickAttacks = new ArrayList<> ();
        electrickAttacks.add ("thunderPunch");
        electrickAttacks.add ("electroBall");
        electrickAttacks.add ("thunder");
        electrickAttacks.add ("leaveBlade");
        return electrickAttacks;

    }
    public ElectricPokemon(String name, int level, int hp, int food, Object sound) {
        super(name, level, hp, food, sound);
        this.grass = new GrassPokemon(name, level, hp, food, sound);  // Correcte plaatsing
    }

}
