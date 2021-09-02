package com.stephen.bogglesolitaire;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


class ScoreActivity extends AppCompatActivity {

    @BindView(R.id.scoreListView) ListView mScoreListView;
    @BindView(R.id.scoreTitleTextView) TextView mScoreTitleTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        Intent intent = getIntent();
        ArrayList<String> userWords = intent.getStringArrayListExtra("userWords");
        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, userWords);
        mScoreListView.setAdapter(adapter);
        String userScore = Integer.toString(userWords.size());
        mScoreTitleTextView.setText("Your Score: " + userScore);


    }
}
