package package1;

public class Employee {
    private int salary;
    private String surname;
    private int id;

    private Employee(int salary){  //private constructor
        this.salary = salary;
    }
    public Employee(int salary, String surname, int id) { //public constructor
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }
    private int getSalary() {
        return salary;
    }

    public String getSurname() {
        return surname;
    }

    protected int getId() {
        return id;
    }

    public void displaySalary() {
        System.out.println("Salary: " + salary);
    }

    public void displaySurname() {
        System.out.println("Surname: " + surname);
    }

    public void displayId() {
        System.out.println("ID: " + id);
    }

    public static void main(String[] args) {
        Employee employee = new Employee(20000, "Smith", 1);
        Employee employee1 = new Employee(10000);

        employee.displaySalary();
        employee.displaySurname();
        employee.displayId();
    }
}
