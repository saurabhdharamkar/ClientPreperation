import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Fearures {

    public static void main(String[] args) {

        List<String> stringList = List.of("saurabh", "raj", "ganesh", "mitesh", "pradnesh");

        List<String> filter = stringList.stream().filter(s -> s.startsWith("saurabh")).collect(Collectors.toList());

        System.out.println("Result: " + filter);

        List<String> ascendingSort=stringList.stream().sorted().collect(Collectors.toList());

        System.out.println("AscendingSort: " + ascendingSort);

        List<String> descendingSort=stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println("DescendingSort: " + descendingSort);

        List<String> lengthOrder=stringList.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println("LengthOrder: " + lengthOrder);

        int count=stringList.stream().mapToInt(String::length).sum();
        System.out.println("Count: " + count);



    }


}

