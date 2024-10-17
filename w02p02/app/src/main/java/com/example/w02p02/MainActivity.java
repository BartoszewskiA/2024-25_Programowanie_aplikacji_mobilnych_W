package com.example.w02p02;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button button01, button02, button03;
    TextView textView;
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

        button01 = findViewById(R.id.button01);
        button02 = findViewById(R.id.button02);
        button03 = findViewById(R.id.button03);
        textView = findViewById(R.id.textView01);

        View.OnClickListener sluchacz = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int ID=  v.getId();
                if(ID == R.id.button01) {
                    textView.setText("Przycisk 01");
                    return;
                }
                if (ID==R.id.button02) {
                    textView.setText("Przycisk 02");
                    return;
                }
                if (ID==R.id.button03) {
                    textView.setText("Przycisk 03");
                    return;
                }
            }
        };
        button01.setOnClickListener(sluchacz);
        button02.setOnClickListener(sluchacz);
        button03.setOnClickListener(sluchacz);
    }
}