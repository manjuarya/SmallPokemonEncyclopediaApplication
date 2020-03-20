import java.util.ArrayList;

public class PokemonData {
    private String name;
    private float height;
    private float id;
    private float weight;
    private ArrayList<Types> types = new ArrayList<>();

    public PokemonData(String name, float id, float height, float weight, ArrayList<Types> types) {
        this.id = id;
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.types = types;
    }

    public float getHeight() {
        return height;
    }

    public float getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public float getWeight() {
        return weight;
    }


    public void setHeight(float height) {
        this.height = height;
    }

    public void setId(float id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public ArrayList<Types> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<Types> types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return "" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", height=" + height +
                ", weight=" + weight +
                ", types=" + types +
                "";
    }
}