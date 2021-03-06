import java.util.Random;

public class ServerNameGenerator {

    static String[] adjectives = {"agreeable", "brave", "calm", "delightful", "eager", "faithful", "gentle", "happy", "sad", "dopey", "grumpy"};

    static String[] nouns = {"people", "history", "way", "art", "world", "information", "map", "family", "government", "computer"};

    public String randomElement (String[] array, String[] array2) {
            String random = (array[new Random().nextInt(array.length)]);
            String random2 = (array2[new Random().nextInt(array2.length)]);
        return (random + "-" + random2);

        }

    public static void main(String[] args) {
        ServerNameGenerator sng = new ServerNameGenerator();
        System.out.println("Here is your dedicated server name: ");
        System.out.println(sng.randomElement(sng.adjectives, sng.nouns));
    }
}
