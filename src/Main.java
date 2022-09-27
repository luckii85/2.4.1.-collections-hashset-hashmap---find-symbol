import java.util.HashMap;
import java.util.Map;

import static java.lang.Character.isLetter;

public class Main {
    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";


    public static void main(String[] args) {

        Map<Character, Integer> symbols = new HashMap<>();
        int numberOfSymbols;
        for (char symbol : text.toCharArray()) {
            if (!isLetter(symbol)) continue;
            if (!symbols.containsKey(symbol)) symbols.put(symbol, 1);
            else {
                numberOfSymbols = symbols.get(symbol) + 1;
                symbols.put(symbol, numberOfSymbols);
            }
        }

        int max = 0;
        int min = 1000;
        for (char key : symbols.keySet()) {
            if (symbols.get(key) > max) max = symbols.get(key);
            if (min > symbols.get(key)) min = symbols.get(key);
        }

        for (char key : symbols.keySet()) {
        if (symbols.get(key) == min) System.out.println("This symbol \'" + key + "\' meet in text less of all, only " + symbols.get(key) + " times.");
        }

        for (char key : symbols.keySet()) {
            if (symbols.get(key) == max) System.out.println("This symbol \'" + key + "\' meet in text most of all, in total " + symbols.get(key) + " times.");
        }


    }
}