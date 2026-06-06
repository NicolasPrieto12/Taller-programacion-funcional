import java.util.List;


public class FiltrarPorLetraInicial {

    List <String> nombres = List.of("Ana", "Carlos", "Andres", "Pedro", "Alejandra", "Juan", "Amanda");

    public List<String> filtrarPorLetraInicial(){
        return nombres.stream().filter(n -> n.startsWith("A")).toList();
    }

    public static void main(String[] args) {
        
        FiltrarPorLetraInicial ejercicio = new FiltrarPorLetraInicial();
        ejercicio.filtrarPorLetraInicial();
        
        System.out.println(ejercicio.filtrarPorLetraInicial());   
    }

}