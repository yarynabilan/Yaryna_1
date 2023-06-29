public class Student {
    private int ticketNumber;
    private String firstName;
    private String lastName;
    private int grade;
    private double mathGrade;
    private double economicsGrade;
    private double englishGrade;

    // Конструктор класу Student
    public Student(int ticketNumber, String firstName, String lastName, int grade, double mathGrade, double economicsGrade, double englishGrade) {
        this.ticketNumber = ticketNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.mathGrade = mathGrade;
        this.economicsGrade = economicsGrade;
        this.englishGrade = englishGrade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public double getEconomicsGrade() {
        return economicsGrade;
    }
    public double getEnglishGrade() {
            return englishGrade;
    }
}

