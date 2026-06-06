import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EliminarDuplicadosConCollector {

    public static void main(String[] args) {
        List<String> correos = List.of("a@correo.com", "b@correo.com", "a@correo.com", "c@correo.com", "b@correo.com");
        Set<String> unicos = correos.stream().collect(Collectors.toSet());
        System.out.println("Set con " + unicos.size() + " elementos únicos:");
        unicos.forEach(System.out::println);
    }

}
