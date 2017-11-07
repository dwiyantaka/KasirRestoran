package com.example.wildanifqie.kasirrestoran;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by wildanifqie on 07/11/2017.
 */

public class SettingActivity extends AppCompatActivity {
    Intent it;
    EditText m1,m2,m3,m4,m5,m6,m7,m8;
    Button b1;

    public String MyPREF = "MyPref";
    public String menu1 = "menu1";
    public String menu2 = "menu2";
    public String menu3 = "menu3";
    public String menu4 = "menu4";
    public String menu5 = "menu5";
    public String menu6 = "menu6";
    public String menu7 = "menu7";
    public String menu8 = "menu8";

    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_activity);

        m1=findViewById(R.id.hrg1);
        m2=findViewById(R.id.hrg2);
        m3=findViewById(R.id.hrg3);
        m4=findViewById(R.id.hrg4);
        m5=findViewById(R.id.hrg5);
        m6=findViewById(R.id.hrg6);
        m7=findViewById(R.id.hrg7);
        m8=findViewById(R.id.hrg8);
        b1 = findViewById(R.id.simpan);
        sp = getSharedPreferences(MyPREF, Context.MODE_PRIVATE);

        DisplayText();

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String M1 = m1.getText().toString();
                String M2 = m2.getText().toString();
                String M3 = m3.getText().toString();
                String M4 = m4.getText().toString();
                String M5 = m5.getText().toString();
                String M6 = m6.getText().toString();
                String M7 = m7.getText().toString();
                String M8 = m8.getText().toString();

                SharedPreferences.Editor ed = sp.edit();

                ed.putString(menu1, M1);
                ed.putString(menu2, M2);
                ed.putString(menu3, M3);
                ed.putString(menu4, M4);
                ed.putString(menu5, M5);
                ed.putString(menu6, M6);
                ed.putString(menu7, M7);
                ed.putString(menu8, M8);
                ed.commit();
                Toast.makeText(SettingActivity.this, "Tersimpan", Toast.LENGTH_SHORT).show();

                DisplayText();

                it = new Intent(SettingActivity.this, MainActivity.class);
                startActivity(it);

            }
        });
    }

    void DisplayText() {
        m1.setText(sp.getString(menu1, "0"));
        m2.setText(sp.getString(menu2, "0"));
        m3.setText(sp.getString(menu3, "0"));
        m4.setText(sp.getString(menu4, "0"));
        m5.setText(sp.getString(menu5, "0"));
        m6.setText(sp.getString(menu6, "0"));
        m7.setText(sp.getString(menu7, "0"));
        m8.setText(sp.getString(menu8, "0"));

    }
}