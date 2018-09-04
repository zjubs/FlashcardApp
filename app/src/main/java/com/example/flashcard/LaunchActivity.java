package com.example.flashcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LaunchActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = ".com.example.FlashCardApp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
    }

    public void startRed(View view) {
        //mWordListTextView.setText("Finish")
        Intent intent = new Intent(this, MainActivity.class);
        String message = "red";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }

    public void startYellow(View view) {
        //mWordListTextView.setText("Finish")
        Intent intent = new Intent(this, MainActivity.class);
        String message = "yellow";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }

    public void startBlue(View view) {
        //mWordListTextView.setText("Finish")
        Intent intent = new Intent(this, MainActivity.class);
        String message = "blue";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }

    public void startGreen(View view) {
        //mWordListTextView.setText("Finish")
        Intent intent = new Intent(this, MainActivity.class);
        String message = "green";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }
}
