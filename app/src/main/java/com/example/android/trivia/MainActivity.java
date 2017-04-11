package com.example.android.trivia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroupFoundation;
    private RadioButton radioButtonStallman;

    private EditText editTextMascot;

    private CheckBox checkBoxIf;
    private CheckBox checkBoxSuper;
    private CheckBox checkBoxInstanceOf;

    private RadioGroup radioGroupPython;
    private RadioButton radioButtonMontyPython;

    private RadioGroup radioGroupSong;
    private RadioButton radioButtonDaisy;

    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroupFoundation = (RadioGroup) findViewById(R.id.radioGroupFoundation);
        radioButtonStallman = (RadioButton) findViewById(R.id.radioButtonStallman);

        editTextMascot = (EditText) findViewById(R.id.mascot);

        checkBoxIf = (CheckBox) findViewById(R.id.checkBoxIf);
        checkBoxSuper = (CheckBox) findViewById(R.id.checkBoxSuper);
        checkBoxInstanceOf = (CheckBox) findViewById(R.id.checkBoxInstance);

        radioGroupPython = (RadioGroup) findViewById(R.id.radioGroupPython);
        radioButtonMontyPython = (RadioButton) findViewById(R.id.radioButtonMontyPython);

        radioGroupSong = (RadioGroup) findViewById(R.id.radioGroupSong);
        radioButtonDaisy = (RadioButton) findViewById(R.id.radioButtonDaisy);
    }

    public void calculateScore(View view) {
        resultQuestion1(view);
        resultQuestion2(view);
        resultQuestion3(view);
        resultQuestion4(view);
        resultQuestion5(view);
        Toast toast = Toast.makeText(this,String.valueOf(score),Toast.LENGTH_LONG);
        toast.show();
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
        if (checkBoxIf.isChecked() && checkBoxSuper.isChecked() && checkBoxInstanceOf.isChecked()) {
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

}
