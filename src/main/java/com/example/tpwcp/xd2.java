package com.example.tpwcp;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class xd2 extends AppCompatActivity {

    private TextView data1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        data1 = (TextView)findViewById(R.id.textView);
    }

    public void setTextds(String x){
        data1 = (TextView)findViewById(R.id.textView);
        data1.setText(x);
    }
}
