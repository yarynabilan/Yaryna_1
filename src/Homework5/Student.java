package Homework5;

public class Student {
    private String name;
    private int course;
    private int grade;

    public Student(String name, int course, int grade) {
        setName(name);
        setCourse(course);
        setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        } else {
            System.out.println("name");
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4) {
            this.course = course;
        } else {
            System.out.println("Input course (1-4)");
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 10) {
            this.grade = grade;
        } else {
            System.out.println("Input grade (1-10)");
        }
    }

    public void showInfo() {
        System.out.println("Student name is: " + getName());
        System.out.println("Course is: " + getCourse());
        System.out.println("Grade is: " + getGrade());
    }
}
