import java.util.Random;

public class RandomInsultGenerator {

    public static void main(String[] args) {

        // Create arrays of adjectives and nouns
        String[] adjectives = {"stupid", "ugly", "smelly", "lazy", "clueless"};
        String[] nouns = {"dork", "moron", "buffoon", "idiot", "nitwit"};

        // Create a new instance of the Random class
        Random rand = new Random();

        // Generate random indices for the adjectives and nouns arrays
        int adjIndex = rand.nextInt(adjectives.length);
        int nounIndex = rand.nextInt(nouns.length);

        // Select a random adjective and noun from their respective arrays
        String adjective = adjectives[adjIndex];
        String noun = nouns[nounIndex];

        // Combine the selected adjective and noun to form an insult
        String insult = "You " + adjective + " " + noun + "!";

        // Print the insult to the console
        System.out.println(insult);
    }

    public String generateInsult() {
        return null;
    }
}