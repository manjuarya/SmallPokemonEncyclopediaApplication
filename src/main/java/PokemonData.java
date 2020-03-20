public class PokemonData {
    private String name;
    private float height;
    private float id;
    private float weight;

    public PokemonData(String name, float id, float height, float weight) {
        this.id = id;
        this.height = height;
        this.weight = weight;
        this.name = name;
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

    @Override
    public String toString() {
        return "" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", height=" + height +
                ", weight=" + weight +
                "";
    }
}