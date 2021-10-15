import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicStream
{
    public static void main(String[] args) {
        //creation of collection stream
        Collection<String> stringCollection= Arrays.asList("a","b","c","d");
        //printing the created collection Stream
        System.out.println(stringCollection);



        //some filtering and intermediate ops on stream and collecting the result in list and printing the same
        System.out.println(stringCollection.stream().filter(e->e.contains("a")||e.contains("b")).map(String::toUpperCase).collect(Collectors.toList()));
        //checking if stream has any elements
        System.out.println(stringCollection.stream().findFirst().isPresent());


        //getting the entire string stream into a single string with ^ as prefix $ as suffix and *** as delimiter
       String conc= stringCollection.stream().collect(Collectors.joining("***","^","$"));
        System.out.println(conc);
        System.out.println("************************");
        Stream<String> colString=Stream.of("a","b");
        //traversing the Stream using forEach loop
        colString.forEach(System.out::println);
        System.out.println("######################");

    }
}
