import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fi {
    public static void main(String[] args) {
        String name = "ddd";
        System.out.println("don1");
        Stream  names = Stream.of("iloveyou");
        List<String>    str = (List<String>) names.collect(Collectors.toList());
        System.out.println(str);
    }
}
