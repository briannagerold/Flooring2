package com.example.flooring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Flooring extends AppCompatActivity {

    TextView txtAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flooring);

        Bundle extras = getIntent().getExtras();

        Integer width = extras.getInt("Width");
        Integer length = extras.getInt("Length");

        Integer total = width * length;

        txtAnswer = findViewById(R.id.txtAnswer);
        txtAnswer.setText("A floor with a width of " + width + " feet and a length of " + length +
                " feet needs "+ total + " square feet of flooring.");

    }
}
