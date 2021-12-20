package com.example.aisha1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "U CLICK THE BUTTON", Toast.LENGTH_SHORT).show();
        }


}
