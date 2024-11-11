import java.util.ArrayList;
import java.util.List;

class PokemonTrainer {
    String name;
    List<Pokemon> pokemons;

    public PokemonTrainer(String name, List<Pokemon> pokemons) {
        this.name = name;
        this.pokemons = pokemons;
    }

    public PokemonTrainer(String name) {
        this.name = name;
        this.pokemons = new ArrayList<>(); // Lege lijst als default
    }

    public void addPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }

    public void showPokemons() {
        System.out.println("Trainer: " + name);
        for (Pokemon pokemon : pokemons) {
            System.out.println(pokemon.name); // Aangenomen dat Pokemon een veld 'name' heeft
        }
    }

    public String getName() {
        return name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}