import java.util.List;
import java.util.stream.Collectors;

public class Java8Fearures {

    public static void main(String[] args) {

        List<String> stringList = List.of("saurabh", "raj", "ganesh", "mitesh", "pradnesh");

        List<String> result = stringList.stream().filter(s -> s.startsWith("saurabh")).collect(Collectors.toList());

        System.out.println("Result: " + result);

    }


}

