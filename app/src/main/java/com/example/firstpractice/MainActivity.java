package com.example.firstpractice;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText names, cities, educations,fams,interests;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.save);
        names = findViewById(R.id.name);
        cities = findViewById(R.id.city);
        educations = findViewById(R.id.education);
        fams = findViewById(R.id.fam);
        interests = findViewById(R.id.interested);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                String name = names.getText().toString();
                String city = cities.getText().toString();
                String education = educations.getText().toString();
                String fam = fams.getText().toString();
                String interest = interests.getText().toString();
                intent.putExtra("name",name);
                intent.putExtra("city",city);
                intent.putExtra("education",education);
                intent.putExtra("fam",fam);
                intent.putExtra("interest",interest);
                startActivity(intent);
            }
        });



    }
}