/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Fernandodaniel
 */
public class Blimp {
    private Integer id;
    private String titulo;
    private String sinopsis;

    public Blimp() {
    }

    public Blimp(Integer id, String titulo, String sinopsis) {
        this.id = id;
        this.titulo = titulo;
        this.sinopsis = sinopsis;
    }
    
    @Override
    public String toString() {
        return "Pelicula{" + "id=" + id + ", titulo=" + titulo + ", sinopsis=" + sinopsis + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}
