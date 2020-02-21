package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;
import java.util.Objects;

public class InfoActivity extends AppCompatActivity {

    TextView txtList;
    private Information info = new Information();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Details");

        String data = getIntent().getStringExtra("DATA");

        txtList = findViewById(R.id.txt_list);

        List<String> list = null;
        if (data != null) {
            list = info.getInformations(data);
        }
        StringBuilder listFormatted = new StringBuilder();
        if (list != null) {
            for (String names : list) {
                listFormatted.append(names).append('\n');
            }
        }
        txtList.setVisibility(View.VISIBLE);
        txtList.setText(listFormatted);
    }
}
