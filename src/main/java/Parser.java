import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Parser {
    public static void main(String[] args) {

    }

    void getPokemonDataDetails() throws IOException {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter the name or id of the pokemon");
        String nameOfThePokemon = myObj.nextLine();

        String baseUrl = "https://pokeapi.co/api/v2/pokemon/"+nameOfThePokemon;
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

        PokemonData pokemon = gson.fromJson(jsonResponse, PokemonData.class);
        //System.out.println("JSON data in string format");
        System.out.println(pokemon.toString());
        sc.close();
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
