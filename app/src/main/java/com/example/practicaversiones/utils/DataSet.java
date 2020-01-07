package com.example.practicaversiones.utils;

import com.example.practicaversiones.R;

import java.util.ArrayList;

public class DataSet {
    ArrayList<Version> lista= new ArrayList<>();

    public static DataSet newInstance(){
        DataSet dataSet=new DataSet();

        return dataSet;
    }

    public ArrayList listadoDataSet(){
        lista.add(new Version("android 1","primer android","191","1.0",R.drawable.android8));


        return lista;
    }
}
