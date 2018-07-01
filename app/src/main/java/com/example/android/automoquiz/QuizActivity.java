package com.example.android.automoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    //Variables used in the assignButtons method.
    int Point = 0;
    EditText answerOne;
    EditText answerTwo;
    RadioGroup radioGroup1;
    RadioGroup radioGroup2;
    RadioGroup radioGroup3;
    RadioGroup radioGroup4;
    RadioGroup radioGroup5;
    RadioGroup radioGroup6;
    RadioGroup radioGroup7;
    RadioGroup radioGroup8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        assignButtons();
    }

    //Assigns the variables to their views
    public void assignButtons() {
        answerOne = findViewById(R.id.answer_one);
        answerTwo = findViewById(R.id.answer_two);
        radioGroup1 = findViewById(R.id.radio_group_1);
        radioGroup2 = findViewById(R.id.radio_group_2);
        radioGroup3 = findViewById(R.id.radio_group_3);
        radioGroup4 = findViewById(R.id.radio_group_4);
        radioGroup5 = findViewById(R.id.radio_group_5);
        radioGroup6 = findViewById(R.id.radio_group_6);
        radioGroup7 = findViewById(R.id.radio_group_7);
        radioGroup8 = findViewById(R.id.radio_group_8);
    }

    //Computes the user's score based on the correct answers
    public void addPoints() {
        //Gets the text from the EditText Field
        String answer2 = answerTwo.getText().toString();
        //Gets the text from the EditText Field
        String answer1 = answerOne.getText().toString();
        //Gets the correct RadioButton
        //Boolean value to determine if the RadioButton is checked
        RadioButton answer3Check = findViewById(R.id.answer_three);
        boolean answerThreeCheck = answer3Check.isChecked();
        //Gets the correct RadioButton
        //Boolean value to determine if the RadioButton is checked
        RadioButton answer4Check = findViewById(R.id.answer_four);
        boolean answerFourCheck = answer4Check.isChecked();
        //Gets the correct RadioButton
        //Boolean value to determine if the RadioButton is checked
        RadioButton answer5Check = findViewById(R.id.answer_five);
        boolean answerFiveCheck = answer5Check.isChecked();
        //Gets the correct RadioButton
        //Boolean value to determine if the RadioButton is checked
        RadioButton answer6Check = findViewById(R.id.answer_six);
        boolean answerSixCheck = answer6Check.isChecked();
        //Gets the correct RadioButton
        //Boolean value to determine if the RadioButton is checked
        RadioButton answer7Check = findViewById(R.id.answer_seven);
        boolean answerSevenCheck = answer7Check.isChecked();
        //Gets the correct RadioButton
        //Boolean value to determine if the RadioButton is
        RadioButton answer8Check = findViewById(R.id.answer_eight);
        boolean answerEightCheck = answer8Check.isChecked();
        //Gets the correct RadioButton checked
        //Boolean value to determine if the RadioButton is checked
        RadioButton answer9Check = findViewById(R.id.answer_nine);
        boolean answerNineCheck = answer9Check.isChecked();
        //Gets the correct RadioButton
        //Boolean value to determine if the RadioButton is checked
        RadioButton answer10Check = findViewById(R.id.answer_ten);
        boolean answerTenCheck = answer10Check.isChecked();

        //Adds one point to the total points if answer is correct
        if (answer1.equalsIgnoreCase("Karl Benz")) {
            Point += 1;
        }
        //Adds one point to the total points if answer is correct
        if (answer2.equalsIgnoreCase("Bavarian Motor Works")) {
            Point += 1;
        }
        //Adds one point to the total points if answer is correct
        if (answerThreeCheck) {
            Point += 1;
        }
        //Adds one point to the total points if answer is correct
        if (answerFourCheck) {
            Point += 1;
        }
        //Adds one point to the total points if answer is correct
        if (answerFiveCheck) {
            Point += 1;
        }
        //Adds one point to the total points if answer is correct
        if (answerSixCheck) {
            Point += 1;
        }
        //Adds one point to the total points if answer is correct
        if (answerSevenCheck) {
            Point += 1;
        }
        //Adds one point to the total points if answer is correct
        if (answerEightCheck) {
            Point += 1;
        }
        //Adds one point to the total points if answer is correct
        if (answerNineCheck) {
            Point += 1;
        }
        //Adds one point to the total points if answer is correct
        if (answerTenCheck) {
            Point += 1;
        }
    }

    //Resets the users score
    //Resets all RadioButtons and CheckBoxes
    //Clears all EditText Fields
    public void resetAll() {
        Point = 0;
        answerOne.setText("");
        answerTwo.setText("");
        radioGroup1.clearCheck();
        radioGroup2.clearCheck();
        radioGroup3.clearCheck();
        radioGroup4.clearCheck();
        radioGroup5.clearCheck();
        radioGroup6.clearCheck();
        radioGroup7.clearCheck();
        radioGroup8.clearCheck();
    }
    //This method gets called when the submit button is clicked
    public void submit(View view) {
        //Calls the addPoints method to add the total number of points
        addPoints();
        //Adds a log entry to check the value of "Point" before resetting.
        Log.v("Quiz Activity", "Current No of points " + Point);
        //Displays to toast to show the users score
        Toast.makeText(this,getString(R.string.score1) + " " + Point + " " + getString(R.string.score2) ,Toast.LENGTH_LONG).show();
        //Calls the resetAll method to reset the quiz.
        resetAll();
        //Adds a log entry to check the value of "Point" after resetting.
        Log.v("Quiz Activity", "Current No of points " + Point);
    }
}