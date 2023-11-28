package leetcode.HashTable.UniqueWordAbbreviation;

import java.util.HashMap;
import java.util.Map;

class ValidWordAbbr {

    private final Map<String, String> abbreviations;

    public ValidWordAbbr(String[] dictionary) {
        abbreviations = new HashMap<>(dictionary.length);
        for (String word : dictionary) {
            abbreviations.compute(getAbbreviation(word),
                    (abbr, words) -> words == null ? word : (word.length() > 2 ? words + word : words));
        }
    }

    private String getAbbreviation(String word) {
        return word.length() < 3 ? word :
                String.valueOf(word.charAt(0)) + (word.length() - 2) + word.charAt(word.length() - 1);
    }

    public boolean isUnique(String word) {
        String abbreviation = getAbbreviation(word);
        String words = abbreviations.get(abbreviation);

        return words == null || words.equals(word);
    }
}
