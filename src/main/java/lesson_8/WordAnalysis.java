package lesson_8;

import java.util.*;

public class WordAnalysis {
    public void analyseWords(String[] arr){
        Set<String> uniqueWords = new HashSet<>();
        Map<String, Integer> wordCount = new HashMap<>();

        for(String word: arr){
            uniqueWords.add(word);
        }
        for (String word : arr) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Уникальные элементы массива:");
        for(String word: uniqueWords){
            System.out.println(word);
        }

        System.out.println("\nКоличество каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
