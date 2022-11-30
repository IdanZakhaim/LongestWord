import java.nio.file.Watchable;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String sentence = "My name is Idan";
        System.out.println(longest(sentence));
    }

    public static String longest(String sentence) {
        String[] words = sentence.split(" ");
        String word = " ";
        for (int i = 0; i < words.length; i++) {
            if (word.length() < words[i].length()) {
                word = words[i];
            }
            if (word.length()==words[i].length()){
                word=word;
            }

        }
        return word;
    }
}