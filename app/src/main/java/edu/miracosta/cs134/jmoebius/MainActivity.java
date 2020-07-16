package edu.miracosta.cs134.jmoebius;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Member variables
    private TextView tapCounter;
    private Button tapMeButton;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // begin code here!
        // Wire up TAP ME! button
        tapCounter = findViewById(R.id.tapCounter);
        System.out.println(tapCounter);
        tapMeButton = findViewById(R.id.tapMeButton);
    }

    // When the tapMeButton is clicked (implement the onClick method), the Model (Counter.java)
    // class is updated and the Controller (MainActivity.java) updates the View (countTextView)
    // with the new value.
    public void tapMe(View V) {
        ++counter;
        tapCounter.setText(String.valueOf(counter));
    }
}
