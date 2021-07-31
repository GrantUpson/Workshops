package upson.grant;

public class WordPair {
    private final String word;
    private int frequency;

    public WordPair(String word) {
        this.word = word;
        frequency++;
    }

    public String getWord() { return word; }
    public int getFrequency() { return frequency; }
    public void incrementFrequency() { frequency++; }
}
