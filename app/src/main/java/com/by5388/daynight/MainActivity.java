package com.by5388.daynight;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/**
 * 白天样式+晚上样式+动态换肤
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button_change_skin).setOnClickListener(v -> toChangeSkin());
        findViewById(R.id.button_day_night).setOnClickListener(v -> toDayNight());
    }

    private void toChangeSkin() {
        startActivity(new Intent(this, ChangeSkinActivity.class));
    }

    private void toDayNight() {
        startActivity(new Intent(this, DayNightActivity.class));
    }
}
