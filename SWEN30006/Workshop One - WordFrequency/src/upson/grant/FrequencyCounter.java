package upson.grant;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FrequencyCounter {
    private final List<WordPair> sortedWords = new ArrayList<>();

    public FrequencyCounter() { }

    public void generateFrequency(String filename) {
        List<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            while((line = reader.readLine()) != null) {
                String[] input = line.toLowerCase().replaceAll("[^a-z]", " ").trim().split("\\s+");
                words.addAll(Arrays.asList(input));
            }

            for(String s : words) {
                boolean found = false;

                for(WordPair w : sortedWords) {
                    if(s.equalsIgnoreCase(w.getWord())) {
                        found = true;
                        w.incrementFrequency();
                        break;
                    }
                }

                if(!found) {
                    sortedWords.add(new WordPair(s));
                }
            }

            sortedWords.sort(new FrequencySorter());
            printFrequency();

        } catch(IOException exception) {
            exception.printStackTrace();
        }
    }

    private void printFrequency() {
        for(WordPair s : sortedWords) {
            System.out.println(s.getFrequency() + " " + s.getWord());
        }
    }
}
