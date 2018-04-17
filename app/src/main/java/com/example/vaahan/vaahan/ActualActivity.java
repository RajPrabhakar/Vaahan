package com.example.vaahan.vaahan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActualActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actual);
    }

    public void next(View v) {
        Intent i = new Intent(this, RideDetailsActivity.class);
        startActivity(i);
    }
}
