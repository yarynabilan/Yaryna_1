
public class Main {
    public static void main(String[] args) {
        int monthNumber = 6;

        H3Month h3Month = new H3Month(); // Створення екземпляра класу H3Month
        int numberOfDays = h3Month.getNumberOfDays(monthNumber); // Виклик методу через екземпляр класу

        System.out.println("Number of days: " + numberOfDays);
    }
}
