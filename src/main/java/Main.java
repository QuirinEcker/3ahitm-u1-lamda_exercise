import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    static final String pathName = "pupils.csv";

    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(pathName));

            lines.stream()
                    .skip(1)
                    .map(line -> line.split(";"))
                    .map(element -> new Pupil(Integer.parseInt(element[0]), element[1], element[2], element[3], Integer.parseInt(element[4]), element[5]))
                    .filter(pupil -> pupil.getPostcode() % 2 == 0)
                    .forEach(System.out::println)
            ;

            System.out.println();

            lines.stream()
                    .skip(1)
                    .map(line -> line.split(";"))
                    .map(element -> new Pupil(Integer.parseInt(element[0]), element[1], element[2], element[3], Integer.parseInt(element[4]), element[5]))
                    .filter(pupil -> pupil.getCity().equals("Linz"))
                    .sorted()
                    .forEach(System.out::println)
            ;

            System.out.println();

            long size = lines.stream()
                    .skip(1)
                    .map(line -> line.split(";"))
                    .map(element -> new Pupil(Integer.parseInt(element[0]), element[1], element[2], element[3], Integer.parseInt(element[4]), element[5]))
                    .filter(pupil -> pupil.getCity().equals("Leonding"))
                    .count()
            ;

            System.out.println(size);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
