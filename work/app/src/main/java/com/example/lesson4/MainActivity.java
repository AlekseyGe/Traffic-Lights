package com.example.lesson4;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    private LinearLayout mainLayout;
    private TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout = findViewById(R.id.LinearLayout);
        textView = findViewById(R.id.textView);

        ImageButton redButton = findViewById(R.id.imageRedButton);
        ImageButton yellowButton = findViewById(R.id.imageYellowButton);
        ImageButton greenButton = findViewById(R.id.imagGreenButton);

        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainLayout.setBackgroundColor(Color.RED);
                textView.setText("Red");
            }
        });

        yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainLayout.setBackgroundColor(Color.YELLOW);
                textView.setText("Yellow");
            }
        });

        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainLayout.setBackgroundColor(Color.GREEN);
                textView.setText("Green");
            }
        });
    }

    public void OnClickRed(View view) {
        mainLayout.setBackgroundColor(Color.RED);
        textView.setText("Red");
    }

    public void OnClickYellow(View view) {
        mainLayout.setBackgroundColor(Color.YELLOW);
        textView.setText("Yellow");
    }

    public void OnClickGreen(View view) {
        mainLayout.setBackgroundColor(Color.GREEN);
        textView.setText("Green");
    }
}
