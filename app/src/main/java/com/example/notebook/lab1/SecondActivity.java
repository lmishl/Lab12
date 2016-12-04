package com.example.notebook.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String text1 = getIntent().getExtras().getString("text1");
        String text2 = getIntent().getExtras().getString("text2");

        EditText view = (EditText)findViewById(R.id.EditTextOnSecond);
        view.setText(text1 + text2);

    }
    public void returnRes(View view)
    {
        EditText textView = (EditText)findViewById(R.id.EditTextOnSecond);
        Intent resIntent = new Intent();
        resIntent.putExtra("res", textView.getText().toString());
        setResult(0, resIntent);
        finish();


    }
}
