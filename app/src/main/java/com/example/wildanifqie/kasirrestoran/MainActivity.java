package com.example.wildanifqie.kasirrestoran;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Intent it;
    String jml1,jml2,jml3,jml4,jml5,jml6,jml7,jml8;
    TextView j1,j2,j3,j4,j5,j6,j7,j8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        j1 = findViewById(R.id.jml1);
        j2 = findViewById(R.id.jml2);
        j3 = findViewById(R.id.jml3);
        j4 = findViewById(R.id.jml4);
        j5 = findViewById(R.id.jml5);
        j6 = findViewById(R.id.jml6);
        j7 = findViewById(R.id.jml7);
        j8 = findViewById(R.id.jml8);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            it = new Intent(this, SettingActivity.class);
            startActivity(it);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void hitung(View view) {
        it = new Intent(this, HitungActivity.class);
        jml1 = j1.getText().toString();
        jml2 = j2.getText().toString();
        jml3 = j3.getText().toString();
        jml4 = j4.getText().toString();
        jml5 = j5.getText().toString();
        jml6 = j6.getText().toString();
        jml7 = j7.getText().toString();
        jml8 = j8.getText().toString();
        it.putExtra("jumlah1", jml1);
        it.putExtra("jumlah2", jml2);
        it.putExtra("jumlah3", jml3);
        it.putExtra("jumlah4", jml4);
        it.putExtra("jumlah5", jml5);
        it.putExtra("jumlah6", jml6);
        it.putExtra("jumlah7", jml7);
        it.putExtra("jumlah8", jml8);
        startActivity(it);
    }
}
