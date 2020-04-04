package com.tsi.constraintchange;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout mConstraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayMetrics displayMetrics = new DisplayMetrics();

        WindowManager windowmanager = (WindowManager) getApplicationContext().getSystemService(Context.WINDOW_SERVICE);

        windowmanager.getDefaultDisplay().getMetrics(displayMetrics);

        int height = Math.round(displayMetrics.heightPixels / displayMetrics.density);

        int width = Math.round(displayMetrics.widthPixels / displayMetrics.density);

        Log.d("Constraindfla",String.valueOf(height)+""+String.valueOf(width));
    }
}
