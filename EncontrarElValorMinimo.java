import java.util.List;

public class EncontrarElValorMinimo {

    public static void main(String[] args) {
        List<Integer> precios = List.of(12000, 5000, 18000, 7500, 3000);
        int minimo = precios.stream().min(Integer::compareTo).get();
        System.out.println("Precio mínimo: " + minimo);
    }

}
