import java.util.*;

public class WordAnalyzer {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "banana", "apple", "strawberry", "banana", "grape", "orange", "mango", "lemon"};
        
        // Находим уникальные слова и подсчитываем, сколько раз встречается каждое слово
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Выводим список уникальных слов и их количество
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " раз(а)");
        }
    }
}
