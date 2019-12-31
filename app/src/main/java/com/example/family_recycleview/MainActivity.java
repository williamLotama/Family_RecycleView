package com.example.family_recycleview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> keluargaArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);

        adapter = new KeluargaAdapter(keluargaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }

    private void addData() {
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga("Kakek Dan Nenek William", "Kakek Dan Nenek", R.drawable.kakeknenek));
        keluargaArrayList.add(new Keluarga("Niko Demus", "Ayah", R.drawable.papah));
        keluargaArrayList.add(new Keluarga("Marliani Siahaan", "Ibu", R.drawable.mamah));
        keluargaArrayList.add(new Keluarga("Alfred Wema Lotama", "Anak 1", R.drawable.alfred));
        keluargaArrayList.add(new Keluarga("William Kurniawan Lotama", "Anak 2", R.drawable.willi));
        keluargaArrayList.add(new Keluarga("Marchello Gabriel", "Anak 3", R.drawable.adek));

    }
}
