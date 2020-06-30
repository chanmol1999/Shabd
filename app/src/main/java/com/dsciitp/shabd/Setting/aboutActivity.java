package com.dsciitp.shabd.Setting;

import android.os.Bundle;

import com.dsciitp.shabd.R;

import java.util.Objects;

import androidx.appcompat.app.AppCompatActivity;

public class aboutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_shabd);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(getResources().getDrawable(R.drawable.ic_arrow_back_white_24dp));

    }
}