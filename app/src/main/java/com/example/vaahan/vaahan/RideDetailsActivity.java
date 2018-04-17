package com.example.vaahan.vaahan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RideDetailsActivity extends AppCompatActivity {

    TextView from, to, dist, fare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ride_details);

        from = findViewById(R.id.from);
        to = findViewById(R.id.to);
        dist = findViewById(R.id.dist);
        fare = findViewById(R.id.fare);

        initial();
    }

    public void decline(View v) {
        initial();
    }

    public void accept(View v) {
        Intent i = new Intent(this, DriverMapsActivity.class);
        startActivity(i);
    }

    public void initial() {
        from.setText("-");
        to.setText("-");
        dist.setText("-");
        fare.setText("-");
    }
}
