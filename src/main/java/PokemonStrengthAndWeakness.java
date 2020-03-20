import java.util.ArrayList;

class PokemonStrengthAndWeakness {
    private DoubleDamageFrom weaknesses;
    private DoubleDamageTo strengths;

    public PokemonStrengthAndWeakness(DoubleDamageFrom weaknesses, DoubleDamageTo strengths) {
        this.weaknesses = weaknesses;
        this.strengths = strengths;
    }

    public DoubleDamageFrom getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(DoubleDamageFrom weaknesses) {
        this.weaknesses = weaknesses;
    }

    public DoubleDamageTo getStrengths() {
        return strengths;
    }

    public void setStrengths(DoubleDamageTo strengths) {
        this.strengths = strengths;
    }
}
