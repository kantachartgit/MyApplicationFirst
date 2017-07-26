package com.iamdeveloper.myapplicationfirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView text;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text = (TextView) findViewById(R.id.tv1);
        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
            data = bundle.getString("data");
            text.setText(data);

        }
    }
}
