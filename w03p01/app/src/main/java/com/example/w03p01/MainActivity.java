package com.example.w03p01;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.slider.RangeSlider;
import com.google.android.material.slider.Slider;

public class MainActivity extends AppCompatActivity {

    TextView textView01;
    SeekBar seekBar01;
    RangeSlider slider;

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
        textView01 = findViewById(R.id.textView01);
        seekBar01 = findViewById(R.id.seekBar01);
       slider = findViewById(R.id.slaider);

        seekBar01.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView01.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
//                textView01.setText("?");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
//                textView01.setText(String.valueOf(seekBar.getProgress()));
            }
        });

        //------------------------------

        slider.addOnChangeListener(new RangeSlider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull RangeSlider slider, float value, boolean fromUser) {
                textView01.setText("Od: "+ slider.getValues().get(0) + "\nDo: " + slider.getValues().get(1));
            }
        });
    }
}