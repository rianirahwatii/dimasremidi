package com.example.myapplicationprojectdimasalfianto;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Data_mahasiswa> list;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        tambah_data();
        listView=findViewById(R.id.listview);
        Adapter adapter =new Adapter(getApplicationContext(),list);
        listView.setAdapter(adapter);
    }

    void tambah_data()
    {
        list=new ArrayList<>();
        list.add(new Data_mahasiswa("NUR INDAH OKTAFIA","STE202202775"));
        list.add(new Data_mahasiswa("FEMAS AGISTA HERDIANSAH","STE202202820"));
        list.add(new Data_mahasiswa("NADILA ZAHRA","STE202202811"));
        list.add(new Data_mahasiswa("SRI SUPRIANI","STE202202815"));
        list.add(new Data_mahasiswa("TRI ERINA YULIANTI","STE202202817"));
        list.add(new Data_mahasiswa("[DIMAS ALFIANTO]","[STE202202820]"));
        list.add(new Data_mahasiswa("NUR SUTANTI","STE202202777"));
        list.add(new Data_mahasiswa("YASMIN MAHARANI","STE202202827"));
        list.add(new Data_mahasiswa("RIANI RAHWATI","STE202202778"));
        list.add(new Data_mahasiswa("BAGUS YANUAR FITRIADI","STE202202870"));
        list.add(new Data_mahasiswa("ANISA DWI SAPUTRI","STE202202875"));




    }


}