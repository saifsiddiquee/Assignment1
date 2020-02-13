package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerName;
    Button btnInfo;
    TextView txtList;
    String selectedItem;
    private Information info = new Information();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerName = findViewById(R.id.spinner_blood_group);
        btnInfo = findViewById(R.id.btn_info);
//        recyclerView = findViewById(R.id.recycler_view);
        txtList = findViewById(R.id.txt_list);

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedItem = String.valueOf(spinnerName.getSelectedItem());
                List<String> list = info.getInformations(selectedItem);
                StringBuilder listFormatted = new StringBuilder();
                for (String names : list) {
                    listFormatted.append(names).append('\n');
                }
                txtList.setVisibility(View.VISIBLE);
                txtList.setText(listFormatted);
            }
        });
    }
}
