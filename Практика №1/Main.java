package mirea.pr1;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        Consumer<String[]> consumer = x-> {
            int max = 0;
            String name = "";

            for (String str : x) {
                Set<Character> chars = new TreeSet<>();

                for (char c : str.toCharArray())
                    chars.add(c);

                if (chars.size() > max) {
                    max = chars.size();
                    name = str;
                }
            }
            System.out.println(name);
        };
        consumer.accept(new String[]{"h", "eow", "∫", "∫", "oppp"});
    }
}
