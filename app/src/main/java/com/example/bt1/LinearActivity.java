package com.example.bt1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

import androidx.appcompat.app.AppCompatActivity;

public class LinearActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear);
        final View view1 = findViewById(R.id.view1);
        final View view2 = findViewById(R.id.view2);
        final View view3 = findViewById(R.id.view3);
        final View view4 = findViewById(R.id.view4);
        final View view5 = findViewById(R.id.view5);
        final SeekBar sb = (SeekBar) findViewById(R.id.seekBar);

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                view1.setBackgroundColor(Color.rgb(187 + progress, 134 + progress, 252 + progress));
                view2.setBackgroundColor(Color.rgb(0 + progress, 221 + progress, 255 + progress));
                view3.setBackgroundColor(Color.rgb(244 + progress, 67 + progress, 54 + progress));
                view4.setBackgroundColor(Color.rgb(255 + progress, 255 + progress, 255 + progress));
                view5.setBackgroundColor(Color.rgb(63 + progress, 81 + progress, 181 + progress));

            }
        });

    }
}