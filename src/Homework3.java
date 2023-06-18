public class Homework3 {

    public static void main(String[] args) {
        longestWord("home", "work", "three");
    }

    public static void longestWord(String home, String work, String three) {
        if (home.length() >= work.length() && home.length() >= three.length()) {
            System.out.println("Найдовше слово: " + home);
        } else if (work.length() >= home.length() && work.length() >= three.length()) {
            System.out.println("Найдовше слово: " + work);
        } else {
            System.out.println("Найдовше слово: " + three);
        }
    }
}



