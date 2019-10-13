package com.example.hackncsilentdisco;
import java.util.*;
public class Word {

    private String _foreignWord;
    private String _englishWord;
    private HashMap<String, String> _map;

    public Word(HashMap<String, String> map){
        _map = map;
        Object[] foreignArray = _map.keySet().toArray();
        Object foreignKey = foreignArray[new Random().nextInt(foreignArray.length)];
        String foreignWord = (String)foreignKey;
        String englishWord = map.get(foreignWord);

        _foreignWord = foreignWord;
        _englishWord = englishWord;

        _map.remove(_foreignWord);
    }

    public String getEnglishWord() {
        return _englishWord;
    }

    public String getForeignWord(){
        return _foreignWord;
    }

    public void recalculate(){
        int randomNum = (int)(Math.random() * getSize());
        Object[] foreignArray = _map.keySet().toArray();
        Object foreignKey = foreignArray[new Random().nextInt(foreignArray.length)];
        String foreignWord = (String)foreignKey;
        String englishWord = _map.get(foreignWord);

        _foreignWord = foreignWord;
        _englishWord = englishWord;

        _map.remove(_foreignWord);
    }

    public int getSize(){
        return _map.entrySet().size();
    }
}
