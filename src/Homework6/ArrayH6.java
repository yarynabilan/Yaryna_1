package Homework6;

public class ArrayH6 {

    public static void main(String[] args) {
        int[] numbers = {5, 11, 7, 20};
        int minDifference = findMinDifference(numbers);
        System.out.println("minimal difference between numbers is " + minDifference);
    }

    public static int findMinDifference(int[] numbers) {
        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int difference = Math.abs(numbers[i] - numbers[j]);
                if (difference < minDifference) {
                    minDifference = difference;
                }
            }
        }

        return minDifference;
    }
}


