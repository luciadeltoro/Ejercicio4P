package org.example;

import org.example.maquinaria.InyectableMecanico;
import org.example.maquinaria.Locomotora;
import org.example.maquinaria.Tren;
import org.example.personal.EspecialidadMecanico;
import org.example.personal.Maquinista;
import org.example.personal.Mecanico;

public class Main {
    public static void main(String[] args) {
        Mecanico mecanico = new Mecanico(
                "Lucía del Toro",
                "628240918",
                EspecialidadMecanico.FRENOS
        );
        Maquinista maquinista = new Maquinista(
                "Miguel Morales Carmona",
                "12345678A",
                2000.0,
                "Principal"
        );

        Locomotora locomotora = new Locomotora("ABC-123", 1500, 2020);
        ((InyectableMecanico) locomotora).setMecanico(mecanico);

        Tren tren = new Tren(locomotora, maquinista);
        tren.agregarVagon(10000, 7500, "Mercancía general");
        tren.agregarVagon(8000, 4000, "Material industrial");

        System.out.println("Tren preparado correctamente.");
        System.out.println("Locomotora: " + tren.getLocomotora().getMatricula());
        System.out.println("Maquinista: " + tren.getMaquinista().getNombreCompleto());
        System.out.println("Mecánico responsable: "
                + tren.getLocomotora().getMecanico().getNombreCompleto());
        System.out.println("Número de vagones: " + tren.getNumeroVagones());
    }
}