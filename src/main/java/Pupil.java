import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pupil {
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
}
