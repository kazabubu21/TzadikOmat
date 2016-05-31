package com.example.stzur.tzdakomat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SettingsActivity extends AppCompatActivity {


    private Button Save;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        preferences = PreferenceManager.getDefaultSharedPreferences(this);

        Save = (Button) findViewById(R.id.button2);

        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText num = (EditText) findViewById(R.id.editText) ;
                int val = Integer.parseInt( num.getText().toString() );

                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("id",val);
                editor.apply();
                onBackPressed();
            }
        });
    }
}
