package com.p_soft.p_soft.listviewandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class ListView2Activity extends Activity implements OnItemClickListener
{
    /** Create By Rashed **/

    ListView lview;
    ListViewAdapter lviewAdapter;

    private final static String month[] = {"January","February","March","April","May",
            "June","July","August","September","October","November","December"};

    private final static String number[] = {"Month - 1", "Month - 2","Month - 3",
            "Month - 4","Month - 5","Month - 6",
            "Month - 7","Month - 8","Month - 9",
            "Month - 10","Month - 11","Month - 12"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        lview = (ListView) findViewById(R.id.listView2);
        lviewAdapter = new ListViewAdapter(this, month, number);
        System.out.println("adapter => "+lviewAdapter.getCount());
        lview.setAdapter(lviewAdapter);
        lview.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {
        // TODO Auto-generated method stub
        Toast.makeText(this,"Title => "+month[position]+"=> n Description"+number[position], Toast.LENGTH_SHORT).show();

        Intent i=new Intent(getApplicationContext(),MainActivity.class);
        i.putExtra("id",month[position]+" "+number[position]);
        startActivity(i);


    }
}