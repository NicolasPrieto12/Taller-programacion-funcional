import java.util.List;

public class EncontrarElValorMaximo {

    public static void main(String[] args) {
        List<Integer> salarios = List.of(1800000, 2500000, 3200000, 2100000, 4000000);
        int maximo = salarios.stream().max(Integer::compareTo).get();
        System.out.println("Salario máximo: " + maximo);
    }

}
