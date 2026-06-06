import java.util.List;

public class VerificarCondicionEnTodosLosElementos {

    public static void main(String[] args) {
        List<Double> notas = List.of(4.0, 3.5, 4.2, 5.0, 3.8);
        boolean todasAprobadas = notas.stream().allMatch(n -> n >= 3.0);
        System.out.println("¿Todas >= 3.0? " + todasAprobadas);
    }

}
