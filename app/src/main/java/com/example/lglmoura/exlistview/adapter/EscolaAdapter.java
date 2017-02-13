package com.example.lglmoura.exlistview.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lglmoura.exlistview.R;
import com.example.lglmoura.exlistview.model.Escola;

import java.util.ArrayList;

/**
 * Created by lglmoura on 13/02/17.
 */

public class EscolaAdapter extends ArrayAdapter<Escola> {
    
    private final Context context;
    private final ArrayList<Escola> elementos;

    public EscolaAdapter(Context context, ArrayList<Escola> elementos) {
        super(context, R.layout.linha, elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.linha, parent, false);
        TextView nomeEscola = (TextView) rowView.findViewById(R.id.nome);
        TextView endereco = (TextView) rowView.findViewById(R.id.endereco);
        ImageView imagem = (ImageView) rowView.findViewById(R.id.imagem);
        nomeEscola.setText(elementos.get(position).getNome());
        endereco.setText(elementos.get(position).getEndereco());
        imagem.setImageResource(elementos.get(position).getImagem());
        return rowView;
    }
}
