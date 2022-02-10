package com.example.activity_4_billanes_checker_x_o;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        Boolean result = intent.getBooleanExtra("Result",false);
        TextView textView = findViewById(R.id.Result);
        textView.setText(result+"");
    }
    public void BACK(View view){
        finish();
    }
}