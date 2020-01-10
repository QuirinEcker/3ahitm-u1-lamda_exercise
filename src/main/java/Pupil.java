import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pupil implements Comparable {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private int postcode;
    private String city;

    public Pupil(int id, String lastName, String firstName, String birthDay, int postcode, String city) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.uuuu");
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = LocalDate.parse(birthDay, dtf);
        this.postcode = postcode;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostcode() {
        return postcode;
    }

    public String getCity() {
        return city;
    }

    @Override
    public int compareTo(Object o) {
        try {
            if (o instanceof Pupil) {
                return this.birthDate.compareTo(((Pupil) o).birthDate);
            } else throw new Exception("Wrong Type");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return 0;
    }

    @Override
    public String toString() {
        return String.format("%s %s was born on %s and lives in %d %s", getFirstName(), getLastName(), getBirthDate(), getPostcode(), getCity());
    }
}
