package homework4;

public class User {
    private String firstName;
    private String middleName;
    private String lastName;
    private int birthYear;
    private String email;

    public User(String firstName, String middleName, String lastName, int birthYear, String email) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.email = email;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void info() {
        System.out.println("ФИО: " + lastName + " " + firstName + " " + middleName);
        System.out.println("Год рождения: " + birthYear);
        System.out.println("email: " + email);
    }
}
