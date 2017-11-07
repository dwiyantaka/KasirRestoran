package com.example.wildanifqie.kasirrestoran;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by wildanifqie on 07/11/2017.
 */

public class HitungActivity extends AppCompatActivity {

    int t1,t2,t3,t4,t5,t6,t7,t8,jmlT;
    String tot1,tot2,tot3,tot4,tot5,tot6,tot7,tot8,jmlTot;
    String jml1,jml2,jml3,jml4,jml5,jml6,jml7,jml8;
    TextView total1,total2,total3,total4,total5,total6,total7,total8,totalTot;
    SharedPreferences sp;

    public String MyPREF = "MyPref";
    public String menu1 = "menu1";
    public String menu2 = "menu2";
    public String menu3 = "menu3";
    public String menu4 = "menu4";
    public String menu5 = "menu5";
    public String menu6 = "menu6";
    public String menu7 = "menu7";
    public String menu8 = "menu8";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hitung_activity);
        sp = getSharedPreferences(MyPREF, Context.MODE_PRIVATE);
        Intent it = getIntent();
        Bundle b = it.getExtras();
        if(b!=null){
            jml1 = (String) b.get("jumlah1");
            jml2 = (String) b.get("jumlah2");
            jml3 = (String) b.get("jumlah3");
            jml4 = (String) b.get("jumlah4");
            jml5 = (String) b.get("jumlah5");
            jml6 = (String) b.get("jumlah6");
            jml7 = (String) b.get("jumlah7");
            jml8 = (String) b.get("jumlah8");
        }

        total1 = findViewById(R.id.tot_hrg1);
        total2 = findViewById(R.id.tot_hrg2);
        total3 = findViewById(R.id.tot_hrg3);
        total4 = findViewById(R.id.tot_hrg4);
        total5 = findViewById(R.id.tot_hrg5);
        total6 = findViewById(R.id.tot_hrg6);
        total7 = findViewById(R.id.tot_hrg7);
        total8 = findViewById(R.id.tot_hrg8);
        totalTot = findViewById(R.id.jml_tot);

        t1 = Integer.parseInt(jml1) * Integer.parseInt(sp.getString(menu1, menu1));
        t2 = Integer.parseInt(jml2) * Integer.parseInt(sp.getString(menu2, menu2));
        t3 = Integer.parseInt(jml3) * Integer.parseInt(sp.getString(menu3, menu3));
        t4 = Integer.parseInt(jml4) * Integer.parseInt(sp.getString(menu4, menu4));
        t5 = Integer.parseInt(jml5) * Integer.parseInt(sp.getString(menu5, menu5));
        t6 = Integer.parseInt(jml6) * Integer.parseInt(sp.getString(menu6, menu6));
        t7 = Integer.parseInt(jml7) * Integer.parseInt(sp.getString(menu7, menu7));
        t8 = Integer.parseInt(jml8) * Integer.parseInt(sp.getString(menu8, menu8));
        jmlT=t1+t2+t3+t4+t5+t6+t7+t8;

        tot1 = String.valueOf(Integer.parseInt(jml1) * Integer.parseInt(sp.getString(menu1, menu1)));
        tot2 = String.valueOf(Integer.parseInt(jml2) * Integer.parseInt(sp.getString(menu2, menu2)));
        tot3 = String.valueOf(Integer.parseInt(jml3) * Integer.parseInt(sp.getString(menu3, menu3)));
        tot4 = String.valueOf(Integer.parseInt(jml4) * Integer.parseInt(sp.getString(menu4, menu4)));
        tot5 = String.valueOf(Integer.parseInt(jml5) * Integer.parseInt(sp.getString(menu5, menu5)));
        tot6 = String.valueOf(Integer.parseInt(jml6) * Integer.parseInt(sp.getString(menu6, menu6)));
        tot7 = String.valueOf(Integer.parseInt(jml7) * Integer.parseInt(sp.getString(menu7, menu7)));
        tot8 = String.valueOf(Integer.parseInt(jml8) * Integer.parseInt(sp.getString(menu8, menu8)));
        jmlTot = String.valueOf(jmlT);

        total1.setText(tot1);
        total2.setText(tot2);
        total3.setText(tot3);
        total4.setText(tot4);
        total5.setText(tot5);
        total6.setText(tot6);
        total7.setText(tot7);
        total8.setText(tot8);
        totalTot.setText(jmlTot);
    }
}
