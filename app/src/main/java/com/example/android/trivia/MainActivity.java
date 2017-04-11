package com.example.android.trivia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout question1;
    private LinearLayout question2;
    private LinearLayout question3;
    private LinearLayout question4;
    private LinearLayout question5;
    private Button checkButton;
    private LinearLayout result_layout;

    private RadioGroup radioGroupFoundation;
    private RadioButton radioButtonStallman;
    private RadioButton radioButtonGates;
    private RadioButton radioButtonLinus;
    private RadioButton radioButtonWozniak;

    private EditText editTextMascot;

    private CheckBox checkBoxIf;
    private CheckBox checkBoxSuper;
    private CheckBox checkBoxInstanceOf;
    private CheckBox checkBoxAwait;

    private RadioGroup radioGroupPython;
    private RadioButton radioButtonMontyPython;
    private RadioButton radioButtonMarketing;
    private RadioButton radioButtonCool;
    private RadioButton radioButtonPlato;

    private RadioGroup radioGroupSong;
    private RadioButton radioButtonDaisy;
    private RadioButton radioButtonPF;
    private RadioButton radioButtonMegadeth;
    private RadioButton radioButtonMaiden;

    private TextView resultTextView;
    private TextView messageTextView;
    private Button tryAgainButton;

    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question1 = (LinearLayout) findViewById(R.id.question1);
        question2 = (LinearLayout) findViewById(R.id.question2);
        question3 = (LinearLayout) findViewById(R.id.question3);
        question4 = (LinearLayout) findViewById(R.id.question4);
        question5 = (LinearLayout) findViewById(R.id.question5);
        checkButton = (Button) findViewById(R.id.check_button);
        result_layout = (LinearLayout) findViewById(R.id.result_layout);

        radioGroupFoundation = (RadioGroup) findViewById(R.id.radioGroupFoundation);
        radioButtonStallman = (RadioButton) findViewById(R.id.radioButtonStallman);
        radioButtonGates = (RadioButton) findViewById(R.id.radioButtonGates);
        radioButtonLinus = (RadioButton) findViewById(R.id.radioButtonLinus);
        radioButtonWozniak = (RadioButton) findViewById(R.id.radioButtonWozniak);

        editTextMascot = (EditText) findViewById(R.id.mascot);

        checkBoxIf = (CheckBox) findViewById(R.id.checkBoxIf);
        checkBoxSuper = (CheckBox) findViewById(R.id.checkBoxSuper);
        checkBoxInstanceOf = (CheckBox) findViewById(R.id.checkBoxInstance);
        checkBoxAwait = (CheckBox) findViewById(R.id.checkBoxAwait);

        radioGroupPython = (RadioGroup) findViewById(R.id.radioGroupPython);
        radioButtonMontyPython = (RadioButton) findViewById(R.id.radioButtonMontyPython);
        radioButtonMarketing = (RadioButton) findViewById(R.id.radioButtonPythonMarketing);
        radioButtonCool = (RadioButton) findViewById(R.id.radioButtonPythonCool);
        radioButtonPlato = (RadioButton) findViewById(R.id.radioButtonPythonPlato);

        radioGroupSong = (RadioGroup) findViewById(R.id.radioGroupSong);
        radioButtonDaisy = (RadioButton) findViewById(R.id.radioButtonDaisy);
        radioButtonMegadeth = (RadioButton) findViewById(R.id.radioButtonMega);
        radioButtonMaiden = (RadioButton) findViewById(R.id.radioButtonMaiden);
        radioButtonPF = (RadioButton) findViewById(R.id.radioButtonPF);

        resultTextView = (TextView) findViewById(R.id.result);
        messageTextView = (TextView) findViewById(R.id.message);
        tryAgainButton = (Button) findViewById(R.id.try_button);
    }

    public void calculateScore(View view) {
        resultQuestion1(view);
        resultQuestion2(view);
        resultQuestion3(view);
        resultQuestion4(view);
        resultQuestion5(view);

        question1.setVisibility(View.GONE);
        question2.setVisibility(View.GONE);
        question3.setVisibility(View.GONE);
        question4.setVisibility(View.GONE);
        question5.setVisibility(View.GONE);
        checkButton.setVisibility(View.GONE);

        if (score == 5) {
            messageTextView.setText("CONGRATULATIONS!!!");
            resultTextView.setText("5/5 AWESOME!!!");
        } else if (score == 4) {
            messageTextView.setText("CONGRATULATIONS");
            resultTextView.setText("4/5 Great!");
        } else if (score == 3) {
            messageTextView.setText("CONGRATULATIONS");
            resultTextView.setText("3/5 Good.");
        } else if (score == 2) {
            messageTextView.setText("At least you tried...");
            resultTextView.setText("2/5 Not too bad.");
        } else if (score == 1) {
            messageTextView.setText("At least you tried...");
            resultTextView.setText("1/5 BAD!");
        } else {
            messageTextView.setText("¬ ¬");
            resultTextView.setText("0/5 Shame!! Ask for forgiveness to Richard Stallman");
        }
        result_layout.setVisibility(View.VISIBLE);
    }

    public void resultQuestion1 (View view) {

        if (radioGroupFoundation.getCheckedRadioButtonId() != -1)
        {
            // one of the radio buttons is checked
            if (radioButtonStallman.isChecked()) {
                score++;
            }
        }

    }

    public void resultQuestion2 (View view) {
        String mascot = String.valueOf(editTextMascot.getText());

        if (mascot.equals("Duke") || mascot.equals("duke") || mascot.equals("DUKE")) {
            score++;
        }
    }

    public void resultQuestion3 (View view) {
        if (checkBoxIf.isChecked() && checkBoxSuper.isChecked() && checkBoxInstanceOf.isChecked() && !checkBoxAwait.isChecked()) {
            score++;
        }
    }

    public void resultQuestion4 (View view) {

        if (radioGroupPython.getCheckedRadioButtonId() != -1)
        {
            // one of the radio buttons is checked
            if (radioButtonMontyPython.isChecked()) {
                score++;
            }
        }

    }

    public void resultQuestion5 (View view) {

        if (radioGroupSong.getCheckedRadioButtonId() != -1)
        {
            // one of the radio buttons is checked
            if (radioButtonDaisy.isChecked()) {
                score++;
            }
        }

    }

    public void reset (View view) {
        question1.setVisibility(View.VISIBLE);
        question2.setVisibility(View.VISIBLE);
        question3.setVisibility(View.VISIBLE);
        question4.setVisibility(View.VISIBLE);
        question5.setVisibility(View.VISIBLE);
        checkButton.setVisibility(View.VISIBLE);

        result_layout.setVisibility(View.GONE);

        radioButtonGates.setChecked(false);
        radioButtonStallman.setChecked(false);
        radioButtonWozniak.setChecked(false);
        radioButtonLinus.setChecked(false);

        editTextMascot.setText("");

        checkBoxIf.setChecked(false);
        checkBoxSuper.setChecked(false);
        checkBoxInstanceOf.setChecked(false);
        checkBoxAwait.setChecked(false);

        radioButtonPlato.setChecked(false);
        radioButtonMarketing.setChecked(false);
        radioButtonCool.setChecked(false);
        radioButtonMontyPython.setChecked(false);

        radioButtonPF.setChecked(false);
        radioButtonDaisy.setChecked(false);
        radioButtonMaiden.setChecked(false);
        radioButtonMegadeth.setChecked(false);

        score = 0;
    }
}
