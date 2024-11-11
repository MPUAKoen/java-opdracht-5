import java.util.ArrayList;
import java.util.List;

public class FirePokemon extends Pokemon {

    public FirePokemon(String name, int level, int hp, String food, String scream) {
        super(name, level, hp, food, scream);
    }

    public FirePokemon(String name, int level, int hp, int food, Object sound) {
        super (name, level, hp, food, sound);
    }

    public List<String> getAttacks() {
        List<String> fireAttacks = new ArrayList<> ();
        fireAttacks.add("fireLash");
        fireAttacks.add("flameThrower");
        fireAttacks.add("pyroBall");
        fireAttacks.add("inferno");
        return fireAttacks;
    }

    public void inferno(Pokemon pokemon, Pokemon gymPokemon) {

    }
}
