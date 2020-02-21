package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

                Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                intent.putExtra("DATA", selectedItem);
                startActivity(intent);
            }
        });
    }
}
