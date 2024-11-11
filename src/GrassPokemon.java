
import java.util.ArrayList;
import java.util.List;

public class GrassPokemon extends Pokemon {

    public GrassPokemon(String name, int level, int hp, String food, String scream) {
        super(name, level, hp, food, scream, "grass");
    }

    public List<String> getAttacks() {
        List<String> grassAttacks = new ArrayList<> ();
        grassAttacks.add("leafStorm");
        grassAttacks.add("solarBeam");
        grassAttacks.add("leechSeed");
        grassAttacks.add("inferno");
        return grassAttacks;
    }


    public void leafStorm(Pokemon attacker, Pokemon defender) {
        System.out.println(attacker.getName() + " uses Leaf Storm!");
        int damage = 30;  // Basis schade

        if (defender.getType().equals("water")) {
            damage = 45;  // Grass doet extra schade aan Water
        } else if (defender.getType().equals("fire")) {
            damage = 20;  // Grass doet minder schade aan Fire
        } else if (defender.getType().equals("electric")) {
            damage = 25;  // Grass doet minder schade aan Electric
        }


        defender.setHp(defender.getHp() - damage);


        System.out.println(defender.getName() + " loses " + damage + " hp.");
        System.out.println(defender.getName() + " has " + defender.getHp() + " hp left.");
    }


    public void solarBeam(Pokemon attacker, Pokemon defender) {
        System.out.println(attacker.getName() + " uses Solar Beam!");
        int damage = 40;  // Basis schade

        if (defender.getType().equals("water")) {
            damage = 55;  // Extra schade aan Water
        } else if (defender.getType().equals("fire")) {
            damage = 30;  // Minder schade aan Fire
        } else if (defender.getType().equals("electric")) {
            damage = 35;  // Minder schade aan Electric
        }


        defender.setHp(defender.getHp() - damage);


        System.out.println(defender.getName() + " loses " + damage + " hp.");
        System.out.println(defender.getName() + " has " + defender.getHp() + " hp left.");
    }


    public void leechSeed(Pokemon attacker, Pokemon defender) {
        System.out.println(attacker.getName() + " uses Leech Seed!");

        int damage = 10;
        attacker.setHp(attacker.getHp() + damage);


        defender.setHp(defender.getHp() - damage);


        System.out.println(defender.getName() + " loses " + damage + " hp.");
        System.out.println(attacker.getName() + " heals " + damage + " hp.");
        System.out.println(defender.getName() + " has " + defender.getHp() + " hp left.");
        System.out.println(attacker.getName() + " now has " + attacker.getHp() + " hp.");
    }

    public void leaveBlade(Pokemon attacker, Pokemon defender) {
        System.out.println(attacker.getName() + " uses leaveBlade!");
        int damage = 50;  // Basis schade

        if (defender.getType().equals("water")) {
            damage = 60;  // Fire doet extra schade aan Water
        } else if (defender.getType().equals("grass")) {
            damage = 45;  // Fire doet extra schade aan Grass
        } else if (defender.getType().equals("electric")) {
            damage = 40;  // Fire doet iets minder schade aan Electric
        }

        defender.setHp(defender.getHp() - damage);

        System.out.println(defender.getName() + " loses " + damage + " hp.");
        System.out.println(defender.getName() + " has " + defender.getHp() + " hp left.");
    }
}
