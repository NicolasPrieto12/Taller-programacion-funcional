import java.util.Comparator;
import java.util.List;

public class OrdenarUnaColeccion {

    public static void main(String[] args) {
        List<Integer> edades = List.of(25, 18, 32, 21, 19, 28);

        List<Integer> ascendente = edades.stream().sorted().toList();
        List<Integer> descendente = edades.stream().sorted(Comparator.reverseOrder()).toList();

        System.out.println("Ascendente:");
        System.out.println(ascendente);
        System.out.println("\nDescendente:");
        System.out.println(descendente);
    }

}
