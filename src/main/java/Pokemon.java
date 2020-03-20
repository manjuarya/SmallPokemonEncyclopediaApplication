import java.io.IOException;
import java.util.Scanner;

public class Pokemon {

    public static void main(String[] args) throws IOException {

        boolean BarsScreenDone = false;

        System.out.println("Welcome to the Pokemon Application!");
        System.out.println("\n");

        while(!BarsScreenDone) {

            Scanner myObj = new Scanner(System.in);  // Create a Scanner object

            // These are 4 options for user to get the pokemon details
            System.out.println("Pick an option:\n" +
                    "(1) Show the pokemon details\n" +
                    "(2) Get all the names of the location in different languages " +
                    " and the name of the region it is in.\n" +
                    "(3) \n" +
                    "(0) Exit\n");
            String choice = myObj.nextLine();
            Parser parser = new Parser();

            switch (choice) {
                case "1":
                    parser.getPokemonDataDetails();
                    break;
                case "2":
                    parser.getLocationDetails();
                    break;
                case "3":
                    //product.methodForCase3();
                    break;
                case "0":
                    BarsScreenDone = true;
                    break;
                default:
                    System.out.println("Invalid Selection!");
                    break;
            }
        }

    }
}
