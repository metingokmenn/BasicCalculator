package com.metingokmen.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText numberText;
    EditText number2Text;
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberText = findViewById(R.id.numberText);
        number2Text = findViewById(R.id.number2Text);
        resultText = findViewById(R.id.resultText);



    }

    public void sum(View view){


        if(numberText.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Enter a valid number!");
        }
        else
            {
            int number1 = Integer.parseInt(numberText.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 + number2;
            resultText.setText("Result: " + result);
        }
    }

    public void subtraction(View view){

        if(numberText.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Enter a valid number!");
        }
        else
        {
            int number1 = Integer.parseInt(numberText.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 - number2;
            resultText.setText("Result: " + result);
        }
    }

    public void multiply(View view){

        if(numberText.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Enter a valid number!");
        }
        else
        {
            int number1 = Integer.parseInt(numberText.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 * number2;
            resultText.setText("Result: " + result);
        }

    }

    public void divide(View view){
        if(numberText.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Enter a valid number!");
        }
        else
        {
            int number1 = Integer.parseInt(numberText.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            if(number2 == 0){
                resultText.setText("Cannot divided by 0");
            }
            else {
                int result = number1 / number2;
                resultText.setText("Result: " + result);
            }
        }
    }
}