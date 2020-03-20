import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

class DamageRelations {
    @SerializedName("double_damage_from")
    @Expose
    ArrayList<DoubleDamageFrom> doubleDamageFrom = new ArrayList<>();
    @SerializedName("double_damage_to")
    @Expose
    ArrayList<DoubleDamageTo> doubleDamageTo = new ArrayList<>();

    public ArrayList<DoubleDamageFrom> getDoubleDamageFrom() {
        return doubleDamageFrom;
    }

    public void setDoubleDamageFrom(ArrayList<DoubleDamageFrom> doubleDamageFrom) {
        this.doubleDamageFrom = doubleDamageFrom;
    }

    public ArrayList<DoubleDamageTo> getDoubleDamageTo() {

        return doubleDamageTo;
    }

    public void setDoubleDamageTo(ArrayList<DoubleDamageTo> doubleDamageTo) {
        this.doubleDamageTo = doubleDamageTo;
    }
}