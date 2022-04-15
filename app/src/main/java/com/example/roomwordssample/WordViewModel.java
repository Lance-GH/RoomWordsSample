package com.example.roomwordssample;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class WordViewModel extends AndroidViewModel {

    private WordRepository mRepository;
    private LiveData<List<Word>> mAllWords;

    public WordViewModel(Application application) {
        super(application);
        mRepository = new WordRepository(application);
        mAllWords = mRepository.getAllWords();
    }

    // Hides the implementation from the UI
    LiveData<List<Word>> getAllWords() {
        return mAllWords;
    }

    // Hides the implementation from the UI
    public void insert(Word word) {
        mRepository.insert(word);
    }

    public void deleteAll() {
        mRepository.deleteAll();
    }

    public void deleteWord(Word word) {
        mRepository.deleteWord(word);
    }
}
