package com.example.stzur.tzdakomat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button Settings;
    SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = PreferenceManager.getDefaultSharedPreferences(this);

        Settings = (Button) findViewById(R.id.button);

        Settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                        Intent myIntent = new Intent(MainActivity.this, SettingsActivity.class);
                        //myIntent.putExtra("key", value); //Optional parameters
                        MainActivity.this.startActivity(myIntent);
                        Integer name=0;
                        name = preferences.getInt("id",0);

                        if (name != 0) {
                            Toast.makeText(MainActivity.this,"Your Text!!" + name.toString(), Toast.LENGTH_LONG).show();
                        }

            }
        });


    }
}
