package com.example.user.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
  //Explicit
    ListView listView;
    private int [] ints = new int[] {R.drawable.traffic_01,R.drawable.traffic_02,R.drawable.traffic_03,R.drawable.traffic_04,R.drawable.traffic_05,
                                     R.drawable.traffic_06,R.drawable.traffic_07,R.drawable.traffic_08,R.drawable.traffic_09,R.drawable.traffic_10,
                                     R.drawable.traffic_11,R.drawable.traffic_12,R.drawable.traffic_13,R.drawable.traffic_14,R.drawable.traffic_15,
                                     R.drawable.traffic_16,R.drawable.traffic_17,R.drawable.traffic_18,R.drawable.traffic_19,R.drawable.traffic_20,};
    private String[]titlesStrings,detailStrings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inital view
        listView = (ListView) findViewById(R.id.livTroffic);
        //Get volue
        titlesStrings = getResources().getStringArray(R.array.title);
        detailStrings = getResources().getStringArray(R.array.detail);
        //create ListView
        Myadpter myadpter = new Myadpter(MainActivity.this,ints,titlesStrings,detailStrings);
        listView.setAdapter(myadpter);
    }//main Method onCreate
    public void onCickMoreInfo(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.dlt.go.th/th/dlt-knowledge/view.php?_did=111"));
        startActivity(intent);
    }

} //main Class
