package com.example.assignment5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cb1;
    CheckBox cb2;
    CheckBox cb3;
    CheckBox cb4;
    CheckBox cb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);

    }
    public void OnClick(View view) {
        boolean Chocolate = cb1.isChecked();
        boolean Sprinkles = cb2.isChecked();
        boolean Crushednuts = cb3.isChecked();
        boolean Cherries = cb4.isChecked();
        boolean OreoCookie = cb5.isChecked();

        if (Chocolate){
            Toast.makeText(this, "You have selected chocolate syrup", Toast.LENGTH_SHORT).show();
        }
        else if(Sprinkles){
            Toast.makeText(this, "You have selected Sprinkles", Toast.LENGTH_SHORT).show();
        }
        else if(Crushednuts) {
            Toast.makeText(this, "You have selected Crushed nuts", Toast.LENGTH_SHORT).show();
        }
        else if(Cherries) {
            Toast.makeText(this, "You have selected Cherries", Toast.LENGTH_SHORT).show();
        }
        else if(OreoCookie) {
            Toast.makeText(this, "You have selected Oreo Cookie crumbles", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "No items selected", Toast.LENGTH_SHORT).show();
        }

    }


    }
