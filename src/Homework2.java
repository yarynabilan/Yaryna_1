import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        int number = 555;
        int sum = calculateDigitSum(number);
        System.out.println("Сума цифр числа " + number + " дорівнює " + sum);

        String word1 = "Overloaded";
        String word2 = "Method";
        int wordLengthSum = calculateDigitSum(word1, word2);
        System.out.println("Сума довжин слів " + word1 + " і " + word2 + " дорівнює " + wordLengthSum);

        boolean isPositive = checkPositiveNumberFromInput();
        if (isPositive) {
            System.out.println("Введене число > 0");
        } else {
            System.out.println("Введене число не більше 0");
        }
    }

    public static int calculateDigitSum(int number) {
        int sum = 0;
        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;
        sum = digit1 + digit2 + digit3;
        return sum;
    }

    public static int calculateDigitSum(String word1, String word2) {
        int sum = word1.length() + word2.length();
        return sum;
    }

    public static boolean checkPositiveNumberFromInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int number = scanner.nextInt();
        boolean isPositive = number > 0;
        return isPositive;
    }
}
