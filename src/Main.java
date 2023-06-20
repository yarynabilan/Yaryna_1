public class Main {
    public static int sumOfTwoNumbers(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        int monthNumber = 6;

        H3Month h3Month = new H3Month(); // Creating an instance of the H3Month class
        int numberOfDays = h3Month.getNumberOfDays(monthNumber); // Calling a method using the instance

        int year = 2023;
        int result = sumOfTwoNumbers(2, 3);
        System.out.println("Sum of two numbers is " + result);

    }
}

