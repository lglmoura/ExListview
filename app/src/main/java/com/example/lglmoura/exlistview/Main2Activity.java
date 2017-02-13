package com.example.lglmoura.exlistview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String parametro = (String) intent.getSerializableExtra("nome");
        TextView nome = (TextView) findViewById(R.id.tvNome);
        nome.setText(parametro);
    }
}
