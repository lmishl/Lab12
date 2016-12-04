package com.example.notebook.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(data.getExtras().getString("res"));
        Toast.makeText(this, data.getExtras().getString("res"), Toast.LENGTH_SHORT).show();

    }

    public void goToNextActivity(View view)
    {
        // выводим сообщение
       // Toast.makeText(this, "Зачем вы нажали?", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);


        EditText text1 = (EditText)findViewById(R.id.editText);
        EditText text2 = (EditText)findViewById(R.id.editText2);
        // в ключ username пихаем текст из первого текстового поля
        intent.putExtra("text1", text1.getText().toString());
        intent.putExtra("text2", text2.getText().toString());
        startActivityForResult(intent, 0);
    }


}
