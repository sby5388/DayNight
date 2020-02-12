package com.by5388.daynight;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class DayNightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_night);
        findViewById(R.id.button_dn_to_activity).setOnClickListener(v -> forActivity());
        findViewById(R.id.button_dn_to_alert_dialog).setOnClickListener(v -> forAlertDialog());
        findViewById(R.id.button_dn_to_dialog).setOnClickListener(v -> forDialog());
    }

    private void forActivity() {
        startActivity(new Intent(this, DayNightForActivity.class));
    }

    private void forDialog() {
        startActivity(new Intent(this, DayNightForDialog.class));
    }

    private void forAlertDialog() {
        startActivity(new Intent(this, DayNightForAlertDialog.class));
    }
}
