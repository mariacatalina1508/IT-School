package kata.session_2;

public class WordsCounter {

    public static void main(String[] args) {
        String sentence = "I like to eat apples";

        int numberOfWords = numberOfWords(sentence);
        System.out.println("Number of words: " + numberOfWords);
    }

    public static int numberOfWords(String sentence) {
        String[] sentenceArray = sentence.split(" ");

        return sentenceArray.length;
    }
}
