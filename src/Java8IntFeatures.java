import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8IntFeatures {
    public static void main(String[] args) {

        List<Integer> integerList=List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> resultList=integerList.stream().mapToInt(Integer::intValue).boxed().collect(Collectors.toList());
        System.out.println("resultList: " + resultList);

        List<Integer> evens=integerList.stream().filter(num->num%2==0).collect(Collectors.toList());
        System.out.println("evens: " + evens);

        List<Integer> odds=integerList.stream().filter(num->num%2!=0).collect(Collectors.toList());
        System.out.println("odds: " + odds);

       int max=integerList.stream().mapToInt(Integer::intValue).max().getAsInt();
       System.out.println("max: " + max);

       int min=integerList.stream().mapToInt(Integer::intValue).min().getAsInt();
       System.out.println("min: " + min);

       int sum=integerList.stream().mapToInt(Integer::intValue).sum();
       System.out.println("sum: " + sum);

       int avg=integerList.stream().mapToInt(Integer::intValue).sum()/integerList.size();
       System.out.println("avg: " + avg);

       int size=integerList.size();
       System.out.println("size: " + size);



    }
}
