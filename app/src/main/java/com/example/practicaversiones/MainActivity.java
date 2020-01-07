package com.example.practicaversiones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.practicaversiones.adaptadores.AdaptadorLista;
import com.example.practicaversiones.utils.DataSet;
import com.example.practicaversiones.utils.Version;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
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
        adaptadorLista= new AdaptadorLista(arrayVersiones,MainActivity.this);

    }

    private void acciones(){

    }

}
