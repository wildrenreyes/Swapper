package com.example.tpwcp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button clicked, clicked2;
    private EditText data1;
    private EditText data2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clicked = (Button) findViewById(R.id.swap);
        clicked2 = (Button) findViewById(R.id.check);
        data1 = (EditText)findViewById(R.id.editTextText);
        data2 = (EditText)findViewById(R.id.editTextText2);
        clicked.setOnClickListener(MainActivity.this);
        clicked2.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View x){
        switch(x.getId()){
            case R.id.swap:
                String xdata1 = data1.getText().toString();
                String xdata2 = data2.getText().toString();
                data1.setText(xdata2);
                data2.setText(xdata1);
                break;
            case R.id.check:
                xd2 xd2 = new xd2();
                String xdatan1 = data1.getText().toString();
                String xdatan2 = data2.getText().toString();
                if(xdatan1.equals(xdatan2)){
                    xd2.SetText("SAME");
                }else {
                    xd2.SetText("NOT THE SAME");
                }
                break;
        }
    }
}