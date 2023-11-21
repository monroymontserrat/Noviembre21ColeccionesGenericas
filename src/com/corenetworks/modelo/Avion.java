package com.corenetworks.modelo;

import java.util.ArrayList;
import java.util.List;

public class Avion {
    private List <Asiento> claseEjecutiva;
    private List <Asiento> claseTurista;

    public int asignarAsientoEjecutivo(Pasajero p, Ubicacion u) {
     //Recorrer lista claseEjecutiva
    //Dentro del bucle verificar uno libre con la misma ubicacion
    for (Asiento elemento : claseEjecutiva){
        if(elemento.getPasajero()==null && elemento.getUbicacion()==u){
            elemento.setPasajero(p);
            return elemento.getNumero();
        }
    }
    return 0;
}

    public int asignarAsientoTurista (Pasajero p, Ubicacion u) {
        //Recorrer lista claseTurista
        //Dentro del bucle verificar uno libre con la misma ubicacion
        for (Asiento elemento : claseTurista){
            if(elemento.getPasajero()==null && elemento.getUbicacion()==u){
                elemento.setPasajero(p);
                return elemento.getNumero();
            }
        }
        return 0;
    }


    @Override
    public String toString() {
        return "Avion{" +
                "claseEjecutiva=" + claseEjecutiva +
                ", claseTurista=" + claseTurista +
                '}';
    }

    public <ubicacion> void Avion() {
        //Programar los 8 asientos ejecutivos y los 42 turista
        int numAsiento = 1;

        claseEjecutiva = new ArrayList<>();
        claseTurista = new ArrayList<>();

        for (int i = 0; i < 8 / 2; i++) {
            for (Ubicacion elemento :
                    Ubicacion.values()) {
                if (elemento.ordinal() % 2 == 0) {
                    claseEjecutiva.add(new Asiento(ClasePasaje.EJECUTIVA, numAsiento, elemento));
                    numAsiento++;
                }
            }
        }
        for (int i = 0; i < 42 / 3; i++) {
            for (Ubicacion elemento :
                    Ubicacion.values()) {
                claseTurista.add(new Asiento(ClasePasaje.TURISTA, numAsiento, elemento));
                numAsiento++;

            }
        }
    }


    public List<Asiento> getClaseEjecutiva() {
        return claseEjecutiva;
    }

    public List<Asiento> getClaseTurista() {
        return claseTurista;
    }
}

