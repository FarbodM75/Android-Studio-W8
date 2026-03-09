package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText firstNumInput;
    private EditText secondNumInput;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        firstNumInput = findViewById(R.id.inputFirstNumber);
        secondNumInput = findViewById(R.id.inputSecondNumber);
        resultText = findViewById(R.id.textResult);
    }

    public void plusNum(View view) {
        int num1 = Integer.parseInt(firstNumInput.getText().toString());
        int num2 = Integer.parseInt(secondNumInput.getText().toString());
        int sum = num1 + num2;
        resultText.setText(String.valueOf(sum));
    }

    public void minusNum(View view) {
        int num1 = Integer.parseInt(firstNumInput.getText().toString());
        int num2 = Integer.parseInt(secondNumInput.getText().toString());
        int diff = num1 - num2;
        resultText.setText(String.valueOf(diff));
    }

    public void multiplyNum(View view) {
        int num1 = Integer.parseInt(firstNumInput.getText().toString());
        int num2 = Integer.parseInt(secondNumInput.getText().toString());
        int product = num1 * num2;
        resultText.setText(String.valueOf(product));
    }
    public void divideNum(View view) {
        int num1 = Integer.parseInt(firstNumInput.getText().toString());
        int num2 = Integer.parseInt(secondNumInput.getText().toString());
        int quotient = num1 / num2;
        resultText.setText(String.valueOf(quotient));
    }
}
