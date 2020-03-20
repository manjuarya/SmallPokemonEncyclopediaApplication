import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Parser {
    public static void main(String[] args) {

    }

    String parseData (String baseUrl) throws IOException {
        URL url = new URL(baseUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("GET");
        conn.connect();
        int responseCode = conn.getResponseCode();

        Scanner sc = null;
        try {
            sc = new Scanner(url.openStream());
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        String jsonResponse = new String();
        while(sc.hasNext())
        {
            jsonResponse+=sc.nextLine();
        }
        sc.close();
        return jsonResponse;
    }

    void getPokemonDataDetails() throws IOException {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter the name or id of the pokemon");
        String nameOfThePokemon = myObj.nextLine();

        String baseUrl = "https://pokeapi.co/api/v2/pokemon/"+nameOfThePokemon;

        String jsonResponse = parseData (baseUrl);

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        PokemonData pokemon = gson.fromJson(jsonResponse, PokemonData.class);
        //System.out.println("JSON data in string format");
        //System.out.println(pokemon.toString());
        ArrayList<Types> types = pokemon.getTypes();
        String typeDetails = new String();
        for(Types perTypes : types){
            int slot = perTypes.getSlot();
            String name = perTypes.getType().getName();
            String url = perTypes.getType().getUrl();
            String jsonResponseAboutStrengthAndWeakness = parseData(url);
           // DamageRelations data = gson.fromJson(jsonResponseAboutStrengthAndWeakness, DamageRelations.class);
            PokemonStrengthAndWeakness data = gson.fromJson(jsonResponseAboutStrengthAndWeakness, PokemonStrengthAndWeakness.class);

            DamageRelations damageRelationsObject = data.getDamageRelationsObject();

            ArrayList<DoubleDamageTo> strengths= damageRelationsObject.getDoubleDamageTo();
            String stringOfStrength = ", Strengths=";
            for(DoubleDamageTo pokemonStrength : strengths){
                stringOfStrength = stringOfStrength + " " + pokemonStrength.getName();
            }

            ArrayList<DoubleDamageFrom> Weaknesses = damageRelationsObject.getDoubleDamageFrom();
            String stringOfWeakness = ", Weaknesses=";
            for(DoubleDamageFrom pokemonWeakness : Weaknesses){
                stringOfWeakness = stringOfWeakness + " " + pokemonWeakness.getName();
            }
            typeDetails = typeDetails + " " + "type=" + name + stringOfStrength + " " + stringOfWeakness + "\n";
        }
        System.out.println(" Pokemon name='" + pokemon.getName() + " " +
                ", id=" + pokemon.getId() + " " +
                ", height=" + pokemon.getHeight() + " " +
                ", weight=" + pokemon.getWeight() + " \n" +
                typeDetails);

    }

    void getLocationDetails() throws IOException {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter the name or id of the location");
        String nameOfTheLocation = myObj.nextLine();

        String baseUrl = "https://pokeapi.co/api/v2/location/"+nameOfTheLocation;
        URL url = new URL(baseUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("GET");
        conn.connect();
        int responseCode = conn.getResponseCode();

        Scanner sc = null;
        try {
            sc = new Scanner(url.openStream());
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        String jsonResponse = new String();
        while(sc.hasNext())
        {
            jsonResponse+=sc.nextLine();
        }
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        LocationData location = gson.fromJson(jsonResponse, LocationData.class);
        //System.out.println("JSON data in string format");
        //System.out.println(location.toString());
        System.out.println("Location Name: " + location.getName() + "\n" +
                "Locations: " + location.getNames() +"\n" +
                "Region: " + location.getRegion().getName() + location.getRegion().getUrl() + "\n");
        sc.close();
    }
}
