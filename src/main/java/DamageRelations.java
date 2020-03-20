import java.util.ArrayList;

class DamageRelations {

    ArrayList<DoubleDamageFrom> double_damage_from = new ArrayList<>();
    ArrayList<DoubleDamageTo> double_damage_to = new ArrayList<>();

    public ArrayList<DoubleDamageFrom> getDouble_damage_from() {
        return double_damage_from;
    }

    public void setDouble_damage_from(ArrayList<DoubleDamageFrom> double_damage_from) {
        this.double_damage_from = double_damage_from;
    }

    public ArrayList<DoubleDamageTo> getDouble_damage_to() {
        return double_damage_to;
    }

    public void setDouble_damage_to(ArrayList<DoubleDamageTo> double_damage_to) {
        this.double_damage_to = double_damage_to;
    }
}