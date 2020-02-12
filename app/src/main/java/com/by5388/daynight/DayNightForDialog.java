package com.by5388.daynight;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.app.AppCompatDialog;

public class DayNightForDialog extends AppCompatActivity {
    private AppCompatDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_night_for);
        findViewById(R.id.button_night_mode_no).setOnClickListener(v -> nightModeNo());
        findViewById(R.id.button_night_mode_yes).setOnClickListener(v -> nightModeYes());
        findViewById(R.id.button_night_mode_auto).setOnClickListener(v -> nightModeAuto());
    }

    private void nightModeNo() {
        setMode(AppCompatDelegate.MODE_NIGHT_NO);
    }

    private void nightModeYes() {
        setMode(AppCompatDelegate.MODE_NIGHT_YES);
    }

    private void nightModeAuto() {
        setMode(AppCompatDelegate.MODE_NIGHT_AUTO);
    }

    private void setMode(int mode) {
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
            dialog = null;
        }
        dialog = new AppCompatDialog(this, R.style.Theme_AppCompat_DayNight_Dialog);
        dialog.getDelegate().setLocalNightMode(mode);
        dialog.setTitle("My great dialog");
        dialog.setContentView(R.layout.dialog_content);
        {
            dialog.setCancelable(true);
            dialog.setCanceledOnTouchOutside(true);
            dialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public void onCancel(DialogInterface dialog0) {
                    dialog = null;
                }
            });
        }
        dialog.show();
    }
}
