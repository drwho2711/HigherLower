package com.mhonore.higherlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //create the random number
    Random rand = new Random();
    int num = rand.nextInt(20)+1;


    public void getGuessNumber(View view) {

        EditText guessEditText = (EditText) findViewById(R.id.guessText);

        int guessInt = Integer.parseInt(guessEditText.getText().toString());

        if (num < guessInt) {
            Toast.makeText(MainActivity.this, String.valueOf("Lower"), Toast.LENGTH_SHORT).show();
        } else if (num > guessInt) {
            Toast.makeText(MainActivity.this, String.valueOf("Higher"), Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(MainActivity.this, String.valueOf("You did it! " + "The correct number is "+ num), Toast.LENGTH_SHORT).show();
        }


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
