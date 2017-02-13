package com.example.lglmoura.exlistview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = (ListView) findViewById(R.id.lvEquipes);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,
                R.array.equipes, android.R.layout.simple_list_item_1);

        lista.setAdapter(adapter);
    }
}
