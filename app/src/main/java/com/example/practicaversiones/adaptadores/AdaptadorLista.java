package com.example.practicaversiones.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.practicaversiones.R;
import com.example.practicaversiones.utils.DataSet;
import com.example.practicaversiones.utils.Version;

import java.util.ArrayList;

public class AdaptadorLista extends BaseAdapter {
    ArrayList lista;
    Context context;

    public AdaptadorLista(ArrayList lista, Context context) {
        this.lista = lista;
        this.context = context;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        HolderAdicional holder=null;

        if (convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.layout_lista,parent,false);
            holder=new HolderAdicional(convertView);
            convertView.setTag(holder);
        } else{
            holder= (HolderAdicional) convertView.getTag();

            Version vers= (Version) lista.get(position);
            holder.getNombre().setText(vers.getNombre());
            holder.getLogo().setImageResource(vers.getCabecera());
        }

        return convertView;
    }

    class HolderAdicional{
        TextView nombre;
        ImageView logo;

        public HolderAdicional(View view){
            nombre=view.findViewById(R.id.txtVersion);
            logo=view.findViewById(R.id.imgVersion);
        }

        public TextView getNombre() {
            return nombre;
        }

        public ImageView getLogo() {
            return logo;
        }

    }
}
