package com.corenetworks.modelo;

import java.util.Objects;

public class Asiento {
    private ClasePasaje clase;
    private Integer numero;
    private Ubicacion ubicacion ;
    private Pasajero pasajero;

    public Asiento(ClasePasaje clasePasaje, int numAsiento, Ubicacion elemento) {
    }


    @Override
    public String toString() {
        return "Asiento{" +
                "clase=" + clase +
                ", numero=" + numero +
                ", ubicacion=" + ubicacion +
                ", pasajero=" + pasajero +
                '}';
    }


    public Asiento() {
    }

    public Asiento(ClasePasaje clase, Integer numero, Ubicacion ubicacion, Pasajero pasajero) {
        this.clase = clase;
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.pasajero = pasajero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asiento asiento = (Asiento) o;
        return clase == asiento.clase && Objects.equals(numero, asiento.numero) && ubicacion == asiento.ubicacion && Objects.equals(pasajero, asiento.pasajero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clase, numero, ubicacion, pasajero);
    }

    public ClasePasaje getClase() {
        return clase;
    }

    public void setClase(ClasePasaje clase) {
        this.clase = clase;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }
}
