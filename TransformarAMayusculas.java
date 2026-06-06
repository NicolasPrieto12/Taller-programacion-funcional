import java.util.List;

public class TransformarAMayusculas {

    public static void main(String[] args) {
        List<String> ciudades = List.of("Bogotá", "Medellín", "Cali", "Barranquilla");
        List<String> resultado = ciudades.stream().map(String::toUpperCase).toList();
        System.out.println(resultado);
    }

}
