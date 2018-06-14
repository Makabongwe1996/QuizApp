package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score = 0;

    /**
     * checks if question number 1 was answered correctly, returns a Toast if it was wrong
     */
    public void checkQuestion1() {
        RadioButton radio1 = findViewById(R.id.correct_question1);
        boolean correctQuestion1 = radio1.isChecked();
        RadioButton radio2 = findViewById(R.id.incorrect_question1);
        boolean incorrectQuestion1 = radio2.isChecked();

        if (correctQuestion1) {
            score++;
        }
        if (incorrectQuestion1) {
            Toast.makeText(this, "winners of each stage of the Tour De France wears a Yellow jersey", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * checks if question number 2 was answered correctly, returns a Toast if it was wrong
     */

    public void checkQuestion2() {
        RadioButton radio1 = findViewById(R.id.correct_question2);
        boolean correctQuestion1 = radio1.isChecked();
        RadioButton radio2 = findViewById(R.id.incorrect_question2);
        boolean incorrectQuestion1 = radio2.isChecked();

        if (correctQuestion1) {
            score++;
            return;
        }
        if (incorrectQuestion1) {
            Toast.makeText(this, "Rocky Marciano finished his career of 49 fights without ever having been defeated.\n", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * checks if question number 3 was answered correctly, returns a Toast if it was wrong
     */
    public void checkQuestion3() {
        RadioButton radio1 = findViewById(R.id.correct_question3);
        boolean correctQuestion = radio1.isChecked();
        RadioButton radio2 = findViewById(R.id.incorrect_question3);
        boolean incorrectQuestion = radio2.isChecked();

        if (correctQuestion) {
            score++;
        }
        if (incorrectQuestion) {
            Toast.makeText(this, "Constantino Rocca plays Golf.", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * checks if question number 4 was answered correctly, returns a Toast if it was wrong
     */
    public void checkQuestion4() {
        RadioButton radio1 = findViewById(R.id.correct_question4);
        boolean correctQuestion = radio1.isChecked();
        RadioButton radio2 = findViewById(R.id.incorrect_question4);
        boolean incorrectQuestion = radio2.isChecked();

        if (correctQuestion) {
            score++;
        }
        if (incorrectQuestion) {
            Toast.makeText(this, "Cresta Run is in Switzerland", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * checks if question number 5 was answered correctly, returns a Toast if it was wrong
     */
    public void checkQuestion5() {
        RadioButton radio1 = findViewById(R.id.correct_question5);
        boolean correctQuestion = radio1.isChecked();
        RadioButton radio2 = findViewById(R.id.incorrect_question5);
        boolean incorrectQuestion = radio2.isChecked();

        if (correctQuestion) {
            score++;
        }
        if (incorrectQuestion) {
            Toast.makeText(this, "Bjorn Borg won Men's Tennis Singles at Wimbledon Five times", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * checks if question number 6 was answered correctly, returns a Toast if it was wrong
     */
    public void checkQuestion6() {
        RadioButton radio1 = findViewById(R.id.correct_question6);
        boolean correctQuestion = radio1.isChecked();
        RadioButton radio2 = findViewById(R.id.incorrect_question6);
        boolean incorrectQuestion = radio2.isChecked();

        if (correctQuestion) {
            score++;
        }
        if (incorrectQuestion) {
            Toast.makeText(this, "India hosted a Formula 1 race for the first time in 2011", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * checks if question number 7 was answered correctly, returns a Toast if it was wrong
     */
    public void checkQuestion7() {
        RadioButton radio1 = findViewById(R.id.correct_question7);
        boolean correctQuestion = radio1.isChecked();
        RadioButton radio2 = findViewById(R.id.incorrect_question7);
        boolean incorrectQuestion = radio2.isChecked();

        if (correctQuestion) {
            score++;
        }
        if (incorrectQuestion) {
            Toast.makeText(this, "Bowls is called a 'crown green", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * checks if question number 8 was answered correctly, returns a Toast if it was wrong
     */
    public void checkQuestion8() {
        RadioButton radio1 = findViewById(R.id.correct_question8);
        boolean correctQuestion = radio1.isChecked();
        RadioButton radio2 = findViewById(R.id.incorrect_question8);
        boolean incorrectQuestion = radio2.isChecked();

        if (correctQuestion) {
            score++;
        }
        if (incorrectQuestion) {
            Toast.makeText(this, "In chess, a Bishob can only move diagonally", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * checks if question 9 was answered correctly, returns a toast if it was answered wrong
     */
    public void checkQuestion9() {
        CheckBox box1 = findViewById(R.id.option1);
        boolean correct1 = box1.isChecked();
        CheckBox box2 = findViewById(R.id.option2);
        boolean correct2 = box2.isChecked();
        CheckBox box3 = findViewById(R.id.option3);
        boolean correct3 = box3.isChecked();
        CheckBox box4 = findViewById(R.id.option4);
        boolean correct4 = box4.isChecked();

        if (correct1 && correct2 && !correct3 && !correct4) {
            score++;
        } else if (correct3) {
            Toast.makeText(this, "Peter Beardsley never ever played for Kaizer Chiefs", Toast.LENGTH_SHORT).show();
        } else if (correct4) {
            Toast.makeText(this, "Peter Beardsley never ever played for Barcelona", Toast.LENGTH_SHORT).show();
        } else if (correct1 && !correct2) {
            Toast.makeText(this, "Peter Beardsley indeed played for Liverpool, but there's another team.", Toast.LENGTH_SHORT).show();
        } else if (correct2 && !correct1) {
            Toast.makeText(this, "Peter Beardsley indeed played for Everton, but there's another team.", Toast.LENGTH_SHORT).show();
        }

    }

    /**
     * checks if answer for question 10 was answered correctly
     */
    public void checkQuestion10() {
        EditText text = findViewById(R.id.edit_question10);
        String enteredText = text.getText().toString();

        if (enteredText.equals("Roberto Baggio")) {
            score++;
        } else {
            Toast.makeText(this, "Roberto Baggio was nick named The Divine Ponytail", Toast.LENGTH_SHORT).show();
        }
    }

    private void resetScore() { score = 0; }

    /**
     * reflects when the submit button is pressed
     */

    public void submitQuiz(View view) {
        checkQuestion1();
        checkQuestion2();
        checkQuestion3();
        checkQuestion4();
        checkQuestion5();
        checkQuestion6();
        checkQuestion7();
        checkQuestion8();
        checkQuestion9();
        checkQuestion10();
        Toast.makeText(this, "You got " + score + " out of 10", Toast.LENGTH_SHORT).show();
        resetScore();
    }
}