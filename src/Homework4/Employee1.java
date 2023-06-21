import package1.Employee;
public class Employee1 {

        public static void main(String[] args) {
            // Створіть об'єкт класу package1.Employee
            Employee employee = new Employee(20000, "Smith", 1);

            // Виведіть значення змінних на екран за допомогою методу println
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("Surname: " + employee.getSurname());
            System.out.println("ID: " + employee.getId());

            // Використовуйте методи самого класу для виведення значень
            employee.displayAll();
        }
    }

