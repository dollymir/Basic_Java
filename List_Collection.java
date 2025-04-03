import java.util.List;
import java.util.ArrayList;

public class List_Collection
{
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        System.out.println("My numbers List Before : " + numbers);
        
        numbers.add("apple");
        numbers.add("orange");
        numbers.add("litchi");
        numbers.add("strawberry");
        numbers.add("blueberry");
        System.out.println("My Numbers List After Adding Elements: " + numbers);
        numbers.remove(2); 
        System.out.println("My Numbers List After Removing Elements: " + numbers);
    }
}