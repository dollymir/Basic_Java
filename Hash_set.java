import java.util.Set;
import java.util.HashSet;

public class Hash_set {
    public static void main(String[] args) {
        Set<String> gods = new HashSet<>();
        System.out.println("Before :- Empty Set : " + gods);

        // Adding elements to the set
        gods.add("Ambe");
        gods.add("Durga");
        gods.add("Pravati");
        gods.add("Lakshmi");
        gods.add("Saraswati");

        System.out.println("After adding elements :- " + gods);

        // Using a for loop to iterate over the set
        System.out.println("\nIterating over the set using a for loop:");
        for (String god : gods) {
            System.out.println(god);
        }
    }
}
