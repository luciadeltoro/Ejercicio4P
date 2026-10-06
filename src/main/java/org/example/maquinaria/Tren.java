package org.example.maquinaria;

import java.util.ArrayList;
import java.util.List;

import org.example.personal.Maquinista;

public class Tren {
    private static final int MAX_VAGONES = 5;

    private Locomotora locomotora;
    private Maquinista maquinista;
    private final List<Vagon> vagones = new ArrayList<>();

    public Tren(Locomotora locomotora, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.maquinista = maquinista;
    }

    void agregarVagon(Vagon vagon) {
        if (vagones.size() >= MAX_VAGONES) {
            throw new IllegalStateException("Un tren no puede tener más de 5 vagones.");
        }
        vagones.add(vagon);
    }

    public void agregarVagon(double capacidadMaxima, double capacidadActual, String tipoMercancia) {
        agregarVagon(new Vagon(capacidadMaxima, capacidadActual, tipoMercancia));
    }

    public Locomotora getLocomotora() {
        return locomotora;
    }

    public void setLocomotora(Locomotora locomotora) {
        this.locomotora = locomotora;
    }

    public Maquinista getMaquinista() {
        return maquinista;
    }

    public void setMaquinista(Maquinista maquinista) {
        this.maquinista = maquinista;
    }

    public int getNumeroVagones() {
        return vagones.size();
    }
}
