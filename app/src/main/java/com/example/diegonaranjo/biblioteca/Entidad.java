package com.example.diegonaranjo.biblioteca;

import java.io.Serializable;

public class Entidad implements Serializable {

    private int imagen;
    private String nombre;
    private String autor;
    private String editorial;
    private String paginas;
    private String disponibilidad;
    private String tiempo;


    public Entidad(int imagen, String nombre, String autor, String editorial, String paginas, String disponibilidad, String tiempo) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.paginas = paginas;
        this.disponibilidad = disponibilidad;
        this.tiempo = tiempo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
}
