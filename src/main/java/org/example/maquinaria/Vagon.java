package org.example.maquinaria;

class Vagon {
    private final double capacidadMaxima;
    private double capacidadActual;
    private String tipoMercancia;

    Vagon(double capacidadMaxima, double capacidadActual, String tipoMercancia) {
        if (capacidadMaxima < 0 || capacidadActual < 0 || capacidadActual > capacidadMaxima) {
            throw new IllegalArgumentException("La carga debe estar entre 0 y la capacidad máxima.");
        }
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
        this.tipoMercancia = tipoMercancia;
    }

    double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    double getCapacidadActual() {
        return capacidadActual;
    }

    void setCapacidadActual(double capacidadActual) {
        if (capacidadActual < 0 || capacidadActual > capacidadMaxima) {
            throw new IllegalArgumentException("La carga debe estar entre 0 y la capacidad máxima.");
        }
        this.capacidadActual = capacidadActual;
    }

    String getTipoMercancia() {
        return tipoMercancia;
    }

    void setTipoMercancia(String tipoMercancia) {
        this.tipoMercancia = tipoMercancia;
    }
}
