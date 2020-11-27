package contolliteration;

import java.util.List;

public class DictionaryItem {
    private String word;
    private List<String> translations;

    public DictionaryItem(String word, List<String> translations>){
        this.word = word;
        this.translations = addTranslations();
    }

    public List<String> addTranslations(String word, List<String> translations){

    }

    public String getWord() {
        return word;
    }

    public List<String> getTranslations() {
        return translations;
    }
}
