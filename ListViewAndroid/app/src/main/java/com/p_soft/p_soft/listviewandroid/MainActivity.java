package com.p_soft.p_soft.listviewandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String s;

    TextView txtview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent in = getIntent();
        s = in.getStringExtra("id");

        txtview=(TextView)findViewById(R.id.txtmsg);
        txtview.setText(""+s);





    }

}
