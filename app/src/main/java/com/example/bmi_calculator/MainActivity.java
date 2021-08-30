package com.example.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)


    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButtonListenerMethod();
    }
    public void myButtonListenerMethod() {
        android.widget.Button button = (android.widget.Button)findViewById(R.id.button);
        button.setOnClickListener(new
                                          android.view.View.OnClickListener()
        {
                                              @Override
                                              public void onClick(android.view.View v) {
                                                  final android.widget.EditText heightText = (android.widget.EditText)
                                                          findViewById(R.id.heightInput);
                                                  String heightStr = heightText.getText().toString();
                                                  double height = Double.parseDouble(heightStr);
                                                  final android.widget.EditText weightText = (android.widget.EditText)
                                                          findViewById(R.id.weightInput);
                                                  String weightStr = weightText.getText().toString();
                                                  double weight = Double.parseDouble(weightStr);
                                                  double BMI = (weight)/(height*height);
                                                  final android.widget.EditText BMIResult = (android.widget.EditText)
                                                          findViewById(R.id.BMIResult);
                                                  BMIResult.setText(Double.toString(BMI));
                                                  String BMI_Cat;
                                                  if (BMI < 15)
                                                      BMI_Cat = "Very severely underweight";
                                                  else if (BMI < 16)
                                                      BMI_Cat = "Severely underweight";
                                                  else if (BMI < 18.5)
                                                      BMI_Cat = "Underweight";
                                                  else if (BMI < 25)
                                                      BMI_Cat = "Normal";
                                                  else if (BMI < 30)
                                                      BMI_Cat = "Overweight";
                                                  else if (BMI < 35)
                                                      BMI_Cat = "Obese Class 1 – Moderately Obese";
                                                  else if (BMI < 40)
                                                      BMI_Cat = "Obese Class 2 - Severely Obese";
                                                  else
                                                      BMI_Cat = "Obese Class 3 - Very Severely Obese";
                                                  final android.widget.TextView BMICategory = (android.widget.TextView)
                                                          findViewById(R.id.BMICategory);
                                                  BMICategory.setText(BMI_Cat);
                                              }
                                          });
    }







}