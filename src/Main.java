
public class Main {
    public static void main(String[] args) {
        Employee worker1 = new Employee("Mark", "Grygoevich", "Podstekailo", 3, 55);
        System.out.println(worker1.getFirstName());
        System.out.println(worker1.getSalary());
        worker1.setSalary(60);
        System.out.println(worker1.getSalary());
    }
}
