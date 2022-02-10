package com.example.activity_4_billanes_checker_x_o;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.edittext);

    }
    public void Result(View view){
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("Result",checklist());
        startActivity(intent);
    }
    boolean checklist(){
        String letters = editText.getText().toString();
        letters = letters.toUpperCase();
        char arr[] = letters.toCharArray();
        int count_O =0,count_X =0;
        for (int i = 0; i < letters.length(); i++) {
            if (arr[i] == 'O') count_O++;
            if(arr[i] == 'X') count_X++;
        }
        if(count_O==count_X) return true;
        else return false;
    }
}