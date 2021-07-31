package upson.grant;

import java.util.Comparator;

public class FrequencySorter implements Comparator<WordPair> {

    @Override
    public int compare(WordPair o1, WordPair o2) {
        return Integer.compare(o2.getFrequency(), o1.getFrequency());
    }
}
