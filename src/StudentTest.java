public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student(1, "Kate", "Smith", 4, 71.0, 80.0, 99.9);
        Student student2 = new Student(2, "Ann", "Miller", 2, 90.0, 64.5, 82.5);
        Student student3 = new Student(3, "Alex", "Johnson", 5, 50, 65.0, 93.1);

        System.out.println("Average rate " + student1.getFirstName() + " " + student1.getLastName()
                + ": " + calculateAverageGrade(student1));
        System.out.println("Average rate " + student2.getFirstName() + " " + student2.getLastName()
                + ": " + calculateAverageGrade(student2));
        System.out.println("Average rate " + student3.getFirstName() + " " + student3.getLastName()
                + ": " + calculateAverageGrade(student3));
    }
    public static double calculateAverageGrade(Student student) {
        double mathGrade = student.getMathGrade();
        double economicsGrade = student.getEconomicsGrade();
        double englishGrade = student.getEnglishGrade();

        return (mathGrade + economicsGrade + englishGrade) / 3;
    }
}
