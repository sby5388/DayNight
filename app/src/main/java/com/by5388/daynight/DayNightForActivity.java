package com.by5388.daynight;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class DayNightForActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_night_for);
        findViewById(R.id.button_night_mode_no).setOnClickListener(v -> nightModeNo());
        findViewById(R.id.button_night_mode_yes).setOnClickListener(v -> nightModeYes());
        findViewById(R.id.button_night_mode_auto).setOnClickListener(v -> nightModeAuto());
    }


    private void nightModeNo() {
        // TODO: 2020/2/12 Delegate: 委托
        final AppCompatDelegate delegate = getDelegate();
        delegate.setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    }

    private void nightModeYes() {
        final AppCompatDelegate delegate = getDelegate();
        delegate.setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);
    }

    private void nightModeAuto() {
        final AppCompatDelegate delegate = getDelegate();
        delegate.setLocalNightMode(AppCompatDelegate.MODE_NIGHT_AUTO);
    }
}
