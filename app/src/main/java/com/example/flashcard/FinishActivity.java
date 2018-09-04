package com.example.flashcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FinishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
    }


    public void returnToLaunch(View view) {

        //mWordListTextView.setText("Finish")
        Intent intent = new Intent(this, LaunchActivity.class);
        startActivity(intent);

    }



}
