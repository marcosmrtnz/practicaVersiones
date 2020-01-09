package com.example.practicaversiones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.practicaversiones.adaptadores.AdaptadorLista;
import com.example.practicaversiones.utils.DataSet;
import com.example.practicaversiones.utils.Version;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  implements AdapterView.OnItemClickListener {
    ListView listaVersiones;
    AdaptadorLista adaptadorLista;
    ArrayList<Version> arrayVersiones;
    DataSet dataSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
        rellenarLista();
    }

    private void rellenarLista() {
        listaVersiones.setAdapter(adaptadorLista);
        arrayVersiones=dataSet.newInstance().listadoDataSet();
        adaptadorLista.notifyDataSetChanged();
    }

    private void instancias(){
        listaVersiones=findViewById(R.id.listaVersiones);
        dataSet= new DataSet();
        arrayVersiones= new ArrayList<>();
        adaptadorLista= new AdaptadorLista(arrayVersiones,getApplicationContext());

    }

    private void acciones(){
        listaVersiones.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Version vers= (Version) listaVersiones.getAdapter().getItem(position);
        Toast.makeText(getApplicationContext(), vers.getNombre(), Toast.LENGTH_SHORT).show();
    }
}
