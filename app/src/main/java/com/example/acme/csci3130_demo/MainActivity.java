package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Takes the user entered text and copies it to the existing text view in the layout.
     *
     * @param view - the Button that was pressed
     */
    public void applyText(View view){
        EditText userEntryTextBox = findViewById(R.id.userEntryTextBox);
        TextView textDisplay = findViewById(R.id.textDisplay);
        textDisplay.setText(userEntryTextBox.getText().toString());
    }
}
