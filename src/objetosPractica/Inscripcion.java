package objetosPractica;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Inscripcion {
    Categoria circuito;
    List<Participante> participantes = new LinkedList<>();
    Map<Integer, Participante> inscripciones = new HashMap<>();
    double monto;

    public Inscripcion(Categoria categoria) {
        this.circuito = categoria;
    }


    public boolean inscribirse(Participante p){
        if (inscripciones.containsKey(p.getNumeroDeParticipante())) {
            return false;
        }

        if (this.circuito.getNombre().equals("Circuito avanzado") && p.getEdad() < 18) {
            System.out.println("Error: Los menores de 18 años no pueden inscribirse en el Circuito Avanzado.");
            return false;
        }

        this.participantes.add(p);
        inscripciones.put(p.getNumeroDeParticipante(), p);
        System.out.println("¡Inscripción exitosa! " + p.getNombre() + " ha sido inscrito en " + this.circuito.getNombre());
        return true;
    }

    public void eliminarParticipante(Participante p) {
        if (inscripciones.containsKey(p.getNumeroDeParticipante())) {
            this.participantes.remove(p);
            inscripciones.remove(p.getNumeroDeParticipante());
            System.out.println("El participante " + p.getNombre() + " ha sido eliminado de la inscripción.");
        } else {
            System.out.println("El participante no estaba inscrito.");
        }

}
    public double calcularMonto(Participante p) {
        if (this.circuito.getNombre().equals("Circuito chico")) {
            if (p.getEdad() >= 18) {
                return this.monto = 1500;
            } else {
                return this.monto = 1300;
            }

        } else if (this.circuito.getNombre().equals("Circuito medio")) {
            if (p.getEdad() >= 18) {
                return this.monto = 2300;
            } else {
                return this.monto = 2000;
            }
        } else {
            if (this.circuito.getNombre().equals("Circuito avanzado") && p.getEdad() >= 18) {
                return this.monto = 2800;
            } else {
                return this.monto = 0;
            }

        }
    }
}

