package org.example;

public class equipo implements liga {
    private String nombre;
    private String titulares;
    private int puntos;
    private int partidosJugados;

    public String getNombre() {
        return nombre;
    }

    public String getJugadores() {
        return titulares;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setJugadores(String jugadores) {
        this.titulares = jugadores;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public equipo() {
    }


}
