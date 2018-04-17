package com.example.vaahan.vaahan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class PassengerOTPActivity extends AppCompatActivity {

    TextView otp, dist, fare;
    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passenger_otp);

        random = new Random();

        otp = findViewById(R.id.otp);
        dist = findViewById(R.id.dist);
        fare = findViewById(R.id.fare);

        String id = String.format("%04d", random.nextInt(10000));
        otp.setText(id);
    }

    public void map(View v) {
        Intent i = new Intent(this, PassengerMapsActivity.class);
        startActivity(i);
    }
}
