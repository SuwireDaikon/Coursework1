import java.util.Objects;

public class Employee {
    private String firstName;
    private String surname;
    private String lastName;
    private int department;
    private int salary;

    public Employee(String firstName, String surname, String lastName, int department, int salary) {
        this.firstName = firstName;
        this.surname = surname;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary; // 50-450
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    static int id;

}
