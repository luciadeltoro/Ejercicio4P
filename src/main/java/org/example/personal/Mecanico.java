package org.example.personal;

public class Mecanico {
    private String nombreCompleto;
    private String telefono;
    private EspecialidadMecanico especialidad;

    public Mecanico(String nombreCompleto, String telefono, EspecialidadMecanico especialidad) {
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public EspecialidadMecanico getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(EspecialidadMecanico especialidad) {
        this.especialidad = especialidad;
    }
}
