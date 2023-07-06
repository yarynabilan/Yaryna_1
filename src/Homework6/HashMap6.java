package Homework6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMap6 {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>();
        books.add("Book 1");
        books.add("Book 2");
        books.add("Book 3");
        books.add("Book 4");
        books.add("Book 5");

        Map<Integer, String> bookMap = createBookMap(books);
        System.out.println(bookMap);
    }

    public static Map<Integer, String> createBookMap(List<String> books) {
        Map<Integer, String> bookMap = new HashMap<>();

        for (int i = 0; i < books.size(); i++) {
            bookMap.put(i, books.get(i));
        }

        return bookMap;
    }
}

