import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PokemonStrengthAndWeakness {
    @SerializedName("damage_relations")
    @Expose
    DamageRelations damageRelationsObject;

    public DamageRelations getDamageRelationsObject() {
        return damageRelationsObject;
    }

    public void setDamageRelationsObject(DamageRelations damageRelationsObject) {
        this.damageRelationsObject = damageRelationsObject;
    }
}
