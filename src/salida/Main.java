package salida;

import objetosPractica.Categoria;
import objetosPractica.Inscripcion;
import objetosPractica.Participante;

public class Main {
    public static void main(String[]args){
    Categoria circuitoChico = new Categoria (1, "Circuito chico", "2km por selva y arroyos");
    Categoria circuitoMedio = new Categoria(2, "Circuito medio", "5km por selva, arroyos y barro");
    Categoria circuitoAvanzado = new Categoria(3, "Circuito avanzado", "10km por selva, arroyo, barro y escalada de piedra");

    Participante p1 = new Participante(1, 17, 7381273, "Ornella", "Alonso", "28193321", "3894853", "0+");
    Participante p2 = new Participante(2, 25, 7381273, "Maria", "Gutierrez", "28193321", "3894853", "0+");
    Participante p3 = new Participante(3, 28, 7381273, "Lucia", "Moreno", "28193321", "3894853", "0+");
    Participante p4 = new Participante(4, 16, 7381273, "Eleonora", "Suarez", "28193321", "3894853", "0+");

    Inscripcion i = new Inscripcion(circuitoChico);
    i.inscribirse(p1);
    Double montoPersona = i.calcularMonto(p1);
    System.out.println("El monto a pagar de " + p1.getNombre() + " es de " + montoPersona);

    Inscripcion i2 = new Inscripcion(circuitoMedio);
    i2.inscribirse(p2);
    Double montoPersona2 = i2.calcularMonto(p2);
    System.out.println("El monto a pagar de " + p2.getNombre() + " es de " + montoPersona2);


        Inscripcion i3 = new Inscripcion(circuitoAvanzado);
    i3.inscribirse(p3);
    Double montoPersona3 = i3.calcularMonto(p3);
    System.out.println("El monto a pagar de " + p3.getNombre() + " es de " + montoPersona3);

        i3.inscribirse(p4);

    }
}
