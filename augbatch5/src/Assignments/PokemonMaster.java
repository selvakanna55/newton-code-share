package Assignments;

public class PokemonMaster {
    static int PokemonMaster(int A, int B) {
        int diff = A - B;
        // total balls with sara - no of pokemons

        if (diff >= 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
