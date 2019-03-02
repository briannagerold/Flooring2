package com.example.flooring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnSubmit;
    EditText txtWidth;
    EditText txtLength;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = findViewById(R.id.btnSubmit);
        txtWidth = findViewById(R.id.txtWidth);
        txtLength = findViewById(R.id.txtLength);

        btnSubmit.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Integer width = Integer.parseInt(txtWidth.getText().toString());
                Integer length = Integer.parseInt(txtLength.getText().toString());

                Intent floorIntent = new Intent(v.getContext(), Flooring.class);
                floorIntent.putExtra("Width", width);
                floorIntent.putExtra("Length", length);
                startActivity(floorIntent);
            }
        });
    }
}
