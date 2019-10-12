package com.example.hackncsilentdisco;
import java.util.*;
public class Word {

    private String _spanishWord;
    private String _englishWord;
    private HashMap<String, String> _map;
    public Word(HashMap<String, String> map){

        _map = map;
        int size = _map.size();
        int randomNum = (int)(Math.random() * size);
        String spanishWord = (String)map.entrySet().toArray()[randomNum];
        String englishWord = map.get(spanishWord);

        _spanishWord = spanishWord;
        _englishWord = englishWord;

        _map.remove(_spanishWord);
    }
    public String getEnglishWord() {
        return _englishWord;
    }
    public String getSpanishWord(){
        return _spanishWord;
    }
    public void recalculate(){
        int randomNum = (int)(Math.random() * getSize());
        String spanishWord = (String)_map.entrySet().toArray()[randomNum];
        String englishWord = _map.get(spanishWord);

        _spanishWord = spanishWord;
        _englishWord = englishWord;

        _map.remove(_spanishWord);
    }
    public int getSize(){
        return _map.entrySet().size();
    }
    public String[] getWrongAnswers(){

        String[] wrongAnswers = new String[3];
        wrongAnswers[0] = (String)_map.entrySet().toArray()[(int)(Math.random() * getSize())];
        while (wrongAnswers[0].equals(getSpanishWord())){
            wrongAnswers[0] = (String)_map.entrySet().toArray()[(int)(Math.random() * getSize())];
        }
        wrongAnswers[1] = (String)_map.entrySet().toArray()[(int)(Math.random() * getSize())];
        while (wrongAnswers[1].equals(getSpanishWord()) || wrongAnswers[1].equals(wrongAnswers[0])){
            wrongAnswers[1] = (String)_map.entrySet().toArray()[(int)(Math.random() * getSize())];
        }
        wrongAnswers[2] = (String)_map.entrySet().toArray()[(int)(Math.random() * getSize())];
        while (wrongAnswers[2].equals(getSpanishWord()) || wrongAnswers[2].equals(wrongAnswers[1]) || wrongAnswers[3].equals(wrongAnswers[0])){
            wrongAnswers[2] = (String)_map.entrySet().toArray()[(int)(Math.random() * getSize())];
        }
        return wrongAnswers;
    }



}
