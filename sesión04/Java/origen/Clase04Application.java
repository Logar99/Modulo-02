package com.example.clase04;

import java.beans.JavaBean;

@JavaBean
public class Empleado implements Serializable{


    private int id;
    private String nombre;
    private int salario;

    // Constructor sin argumentos
    public Empleado () {}

    // Constructor del JavaBean
    public Empleado (String nombre, int salario) {
        this.nombre= nombre;
        this.salario= salario;
    }

    //Getters y Setters
    public int getId() {
        return id;
    }
    public void setId( int id ) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre( String nombre) {
        this.nombre= nombre;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario( int salario) {
        this.salario= salario;
    }
}
