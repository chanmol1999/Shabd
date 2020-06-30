package com.dsciitp.shabd.Setting;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Toast;

import com.dsciitp.shabd.R;

import java.util.Objects;

import androidx.appcompat.app.AppCompatActivity;

public class LanguageSettingActivity extends AppCompatActivity {


    Spinner languageSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_setting);
        Objects.requireNonNull(getSupportActionBar()).setElevation(0f);
        getSupportActionBar().setHomeAsUpIndicator(getResources().getDrawable(R.drawable.ic_arrow_back_white_24dp));
        getSupportActionBar().setTitle("Language and Voice Settings");
        languageSpinner = findViewById(R.id.language_spinner);
        ArrayAdapter<CharSequence> languageAdapter = ArrayAdapter.createFromResource(this, R.array.language_array, R.layout.spinner_item);
        languageAdapter.setDropDownViewResource(R.layout.spinner_item);
        languageSpinner.setAdapter(languageAdapter);
        languageSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                languageSpinner.setSelection((int) id);
                Toast.makeText(LanguageSettingActivity.this, "pos is" + position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        SeekBar pitchBar = findViewById(R.id.pitch_seekbar);
        SeekBar speechBar = findViewById(R.id.speechRate_seekbar);
    }
}
