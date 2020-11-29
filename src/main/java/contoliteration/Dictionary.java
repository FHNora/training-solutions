package contoliteration;

import java.util.List;

public class Dictionary {
    private List<DictionaryItem> dictionaryItems;

    public void addItem(String word, List<String> translations){
        dictionaryItems.add(new DictionaryItem(word, translations));
    }

    public List<String> findTranslations(String word){
        for (DictionaryItem item : dictionaryItems) {
            for (String s : item.getTranslations()) {
                if (s.equals(word)) {
                    return item.getTranslations();
                }
            }
        }
        return null;
    }
}
