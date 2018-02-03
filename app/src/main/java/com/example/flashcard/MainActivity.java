package com.example.flashcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private TextView mWordListTextView;

    String[] words = WordList.getWords();
    Integer words_max = words.length;
    Integer i = 0;
    String i_KEY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // recovering the instance state
        if (savedInstanceState != null) {
            i = savedInstanceState.getInt(i_KEY);
        }

        setContentView(R.layout.activity_main);

        mWordListTextView = (TextView) findViewById(R.id.tv_word_list);

        mWordListTextView.setText(words[i]);

    }
    public void sendMessage(View view) {
        if (i == words_max-1) {
            mWordListTextView.setText("Finish");
        } else {
            i = i+1;
            mWordListTextView.setText(words[i]);
        }



    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putInt(i_KEY, i);

        // call superclass to save any view hierarchy
        super.onSaveInstanceState(outState);
    }
}
