package com.example.exception322;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView some = findViewById(R.id.gone); //some = null
        try {
            some.setText("Some text");
        } catch (NullPointerException e) {
            Toast.makeText(this, "Обьект не найден", Toast.LENGTH_LONG).show();
        }
        TextView some2 = findViewById(R.id.gone);
        if (some2 == null) {
            Toast.makeText(this, "Обьект не найден", Toast.LENGTH_LONG).show();
        } else {
            some2.setText("Some text 2");
        }
    }
}
