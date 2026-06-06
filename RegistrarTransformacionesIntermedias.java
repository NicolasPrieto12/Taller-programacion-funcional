import java.util.List;

public class RegistrarTransformacionesIntermedias {

    public static void main(String[] args) {
        List<String> empleados = List.of("Laura", "Pedro", "Carlos", "Ana");
        List<String> resultado = empleados.stream()
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Transformado: " + e))
                .toList();
        System.out.println("\nLista:");
        System.out.println(resultado);
    }

}
