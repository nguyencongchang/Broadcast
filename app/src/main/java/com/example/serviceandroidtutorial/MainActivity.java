package com.example.serviceandroidtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edtData;
    private Button btnStart,btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtData = (EditText)findViewById(R.id.EDTTHONGBAO);
        btnStart = (Button)findViewById(R.id.BTNSTART);
        btnStop = (Button)findViewById(R.id.BTNSTOP);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickStart();
            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clipStop();
            }
        });
    }
    private void clipStop() {
        Intent intent = new Intent(this, MyService.class);
        stopService(intent);
    }

    private void clickStart() {
        Song song = new Song("BigCityBoiz","ChangNguyen",R.drawable.bigcityboiz,R.raw.saicachyeu);
        Intent intent = new Intent(this,MyService.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("ob_Song",song);
        intent.putExtras(bundle);

        startService(intent);
    }
}