package com.by5388.daynight;

import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class DayNightForAlertDialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_night_for);
        findViewById(R.id.button_night_mode_no).setOnClickListener(v -> nightModeNo());
        findViewById(R.id.button_night_mode_yes).setOnClickListener(v -> nightModeYes());
        findViewById(R.id.button_night_mode_auto).setOnClickListener(v -> nightModeAuto());
    }


    private void nightModeNo() {
        AlertDialog dialog = createAlertDialog();
        dialog.getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        dialog.show();
    }

    private void nightModeYes() {
        AlertDialog dialog = createAlertDialog();
        dialog.getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        dialog.show();
    }

    private void nightModeAuto() {
        AlertDialog dialog = createAlertDialog();
        dialog.getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_AUTO);
        dialog.show();
    }

    private AlertDialog createAlertDialog() {
        AlertDialog.Builder b = new AlertDialog.Builder(this,
                R.style.Theme_AppCompat_DayNight_Dialog_Alert);
        b.setTitle(R.string.dialog_title);
        b.setMessage(R.string.dialog_content);
        return b.create();
    }

}
