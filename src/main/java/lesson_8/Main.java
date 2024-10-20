package lesson_8;

public class Main {
    public static void main(String[] args) {
        String[] words = {
                "apple", "orange", "banana", "apple", "grape", "orange", "pear", "grape", "melon", "pear",
                "peach", "plum", "apple", "plum", "banana", "grape", "plum", "melon", "orange", "peach"
        };
        WordAnalysis wordAnalysis = new WordAnalysis();
        wordAnalysis.analyseWords(words);


        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Ivanov", "123-456");
        phoneBook.add("Petrov", "234-567");
        phoneBook.add("Ivanov", "789-012");
        phoneBook.add("Sidorov", "345-678");
        phoneBook.add("Petrov", "890-123");

        System.out.println("Телефоны Ivanov: " + phoneBook.get("Ivanov"));
        System.out.println("Телефоны Petrov: " + phoneBook.get("Petrov"));
        System.out.println("Телефоны Sidorov: " + phoneBook.get("Sidorov"));
    }
}