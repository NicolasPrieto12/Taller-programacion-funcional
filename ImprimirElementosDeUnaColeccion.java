import java.util.List;

public class ImprimirElementosDeUnaColeccion {

    public static void main(String[] args) {
        List<String> productos = List.of("Laptop", "Mouse", "Teclado", "Monitor", "Impresora");
        productos.forEach(p -> System.out.println("Producto disponible: " + p));
    }

}
