package com.example.w03p02;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    RadioGroup radioGroup;
    RadioButton radioButton01, radioButton02, radioButton03;
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
        imageView = findViewById(R.id.imageView01);
        radioGroup = findViewById(R.id.radioGroup);
        radioButton01 = findViewById(R.id.radioButton01);
        radioButton02 = findViewById(R.id.radioButton02);
        radioButton03 = findViewById(R.id.radioButton03);

        imageView.setImageResource(R.drawable.rysunek01);
        radioButton01.setChecked(true);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton01)
                    imageView.setImageResource(R.drawable.rysunek01);
                else if(checkedId==R.id.radioButton02)
                    imageView.setImageResource(R.drawable.rysunek02);
                else if(checkedId==R.id.radioButton03)
                    imageView.setImageResource(R.drawable.rysunek03);
            }
        });
    }
}