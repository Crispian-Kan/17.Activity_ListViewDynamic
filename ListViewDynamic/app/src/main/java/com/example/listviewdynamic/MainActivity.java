package com.example.listviewdynamic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private String[] cities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cities = getResources().getStringArray(R.array.cities);
        ArrayAdapter<String> dynamic = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, cities);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(dynamic);
        listView.setOnItemClickListener(this);

    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        TextView set_text = (TextView)findViewById(R.id.set_msg);
        set_text.setText("你選擇了: " + cities[i]);
    }

}