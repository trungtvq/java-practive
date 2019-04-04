import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args)  {
        IntStream
                .iterate(1, n -> n + 1)
                .forEach(System.out::println);

    }
}
