package com.example.flashcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView mWordListTextView;

    String my_colour;



    //String[] words = WordList.getWords();

    Integer i;
    String i_KEY = "progress";
    String i_col = "selected_colour";
    String[] words;
    Integer words_max;
    ArrayList<ResultList> myResults;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        i = 0;
        Intent intent = getIntent();
        my_colour = intent.getStringExtra(LaunchActivity.EXTRA_MESSAGE);
        //Log.d("on create colour",my_colour);
        //Log.d("check for saved state","saved state" + (savedInstanceState != null));
        myResults = new ArrayList<ResultList>();

        // recovering the instance state
        if (savedInstanceState != null) {
            i = savedInstanceState.getInt(i_KEY);
            my_colour = savedInstanceState.getString(i_col);
            Log.d("i","value" + i);
            Log.d("my_colour",my_colour);
        }
        Log.d("aab",my_colour);

        setContentView(R.layout.activity_main);

        switch(my_colour) {
            case "red":
                Log.d("aa1","1");
                words = WordList.getWords();
                break;
            case "yellow":
                Log.d("aa1","2");
                words = WordList.getWords2();
                break;
            case "blue":
                Log.d("aa1","3");
                words = WordList.getWords3();
                break;
            case "green":
                Log.d("aa1","4");
                words = WordList.getWords4();
                break;

        }

        Log.d("aac",words[0]);
        words_max = words.length;

        mWordListTextView = (TextView) findViewById(R.id.tv_word_list);

        mWordListTextView.setText(words[i]);

    }
    public void clickCorrect(View view) {
        myResults.add(new ResultList(words[i],true));
        if (i == words_max-1) {
            //mWordListTextView.setText("Finish")
            Intent intent = new Intent(this, FinishActivity.class);
            startActivity(intent);

        } else {
            i = i+1;
            mWordListTextView.setText(words[i]);
            Log.d("update i","value" + i);

        }



    }

    public void clickIncorrect(View view) {
        myResults.add(new ResultList(words[i],false));
        if (i == words_max-1) {
            //mWordListTextView.setText("Finish")
            Intent intent = new Intent(this, FinishActivity.class);
            startActivity(intent);

        } else {
            i = i+1;
            mWordListTextView.setText(words[i]);
            Log.d("update i","value" + i);

        }



    }



    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putInt(i_KEY, i);
        outState.putString(i_col, my_colour);
        //outState.put(i_col, my_colour);
        Log.d("creating saved state","close");

        // call superclass to save any view hierarchy
        super.onSaveInstanceState(outState);
    }
}
