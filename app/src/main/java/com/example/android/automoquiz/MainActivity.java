package com.example.android.automoquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Method is called when the start quiz button is clicked.
    public void openQuizActivity(View view) {
        //Gets the text provided in the name_text_field
        EditText nameText = findViewById(R.id.name_text_field);
        String name = nameText.getText().toString();
        //Checks if there's a user name
        if (TextUtils.isEmpty(nameText.getText())) {
            //Displays an error if user name is empty
            nameText.setError(getString(R.string.required));
        }
        else {
            //Sends an intent to open the QuizActivity
            Intent intent = new Intent(this, QuizActivity.class);
            startActivity(intent);
            //Displays a toast to welcome the user
            Toast.makeText(this, getString(R.string.Hi) + ", " + name + " " + getString(R.string.welcome) ,Toast.LENGTH_LONG).show();
        }
    }
}