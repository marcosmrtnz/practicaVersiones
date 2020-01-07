package com.example.practicaversiones.utils;

import android.widget.ImageView;

public class Version {
    String nombre, descripcion, fecha, comp;
    int cabecera;

    public Version(String nombre, String descripcion, String fecha, String comp, int cabecera) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.comp = comp;
        this.cabecera = cabecera;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCabecera() {
        return cabecera;
    }
}
