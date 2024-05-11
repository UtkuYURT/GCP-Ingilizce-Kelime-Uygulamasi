package com.example.olmazsa_soverim3.repository;

import com.example.olmazsa_soverim3.models.Deneme;

import java.util.ArrayList;

public class WordList {
    private ArrayList<Deneme> wordList = new ArrayList<>();

    public WordList(ArrayList<Deneme> wordList) {
        this.wordList = wordList;
    }

    public WordList() {
    }

    public ArrayList<Deneme> getWordList() {
        return wordList;
    }

    public void setWordList(ArrayList<Deneme> denemeArrayList) {
        this.wordList = denemeArrayList;
    }
}
