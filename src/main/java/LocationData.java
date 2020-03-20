import java.util.ArrayList;

public class    LocationData {
    private String name;
    ArrayList<Name> names = new ArrayList<>();
    private Region region;

    public LocationData(String name, ArrayList<Name> names, Region region) {
        this.name = name;
        this.names = names;
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "LocationData{" +
                "name='" + name + '\'' +
                ", names=" + names +
                ", region=" + region +
                '}';
    }
}
