package com.example.daftarkartun;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvKartun;
    private ArrayList<Kartun> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvKartun = findViewById(R.id.rv_kartun);
        rvKartun.setHasFixedSize(true);

        list.addAll(KartunData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvKartun.setLayoutManager(new LinearLayoutManager(this));
        ListKartunAdapter listKartunAdapter = new ListKartunAdapter(list);
        rvKartun.setAdapter(listKartunAdapter);
    }
}