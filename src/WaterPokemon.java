import java.util.ArrayList;
import java.util.List;

public class WaterPokemon extends Pokemon {

    public WaterPokemon(String type, int level, int hp, String name, String scream) {
        super(type, level, hp, name, scream);
    }

    public WaterPokemon(String name, int level, int hp, int food, Object sound) {
        super ();
    }

    public List<String> getAttacks() {
        List<String> waterattacks = new ArrayList<> ();
        waterattacks.add("surf");
        waterattacks.add("hydroPump");
        waterattacks.add("hydroCanon");
        waterattacks.add("rainDance");
        return waterattacks;
    }
}
