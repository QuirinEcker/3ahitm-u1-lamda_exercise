import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    static final String pathName = "pupils.csv";

    public static void main(String[] args) {
        try {
            Files.readAllLines(Paths.get(pathName)).stream()
                    .skip(1)
                    .map(line -> line.split(";"))
                    .forEach(element -> System.out.println(element));
                    //.map(element -> new Pupil(Integer.parseInt(element[0]), element[1], element[2], element[3], Integer.parseInt(element[4]), element[5]));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
