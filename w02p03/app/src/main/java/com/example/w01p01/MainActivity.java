package com.example.w01p01;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView textView01;
    EditText editText01;
    Button button01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView01 = findViewById(R.id.textView01);
        button01 = findViewById(R.id.button01);
        editText01 = findViewById(R.id.editText01);
        Log.d("APKA", "Zadziałało onCreate");
        button01.setOnClickListener((v) -> {
           try {
               int x = Integer.parseInt(editText01.getText().toString());
               textView01.setText(String.valueOf(x));
           }catch (Exception e)
           {
                Log.e("APKA","Błąd: ", e);
           }

        });
    }
}