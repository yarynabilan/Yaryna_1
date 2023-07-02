package Homework7;

public class Numbers {
        public static void main(String[] args) {
            int[] array = {10, 20, 30, 40, 50};
            int toDivide = 5;

            try {
                int[] result = divideArrayElements(array, toDivide);
                System.out.println("An array with divided elements:");
                for (int num : result) {
                    System.out.println(num);
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not possible"); // if int toDivide will = 0, for example
            }
        }

        public static int[] divideArrayElements(int[] array, int toDivide) {
            int[] result = new int[array.length];

            for (int i = 0; i < array.length; i++) {
                result[i] = array[i] / toDivide;
            }

            return result;
        }
    }
