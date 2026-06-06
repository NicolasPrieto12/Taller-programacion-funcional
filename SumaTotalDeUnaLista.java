import java.util.List;

public class SumaTotalDeUnaLista {

    public static void main(String[] args) {
        List<Integer> numeros = List.of(12, 8, 5, 10, 15);
        int suma = numeros.stream().reduce(0, Integer::sum);
        System.out.println("suma = " + suma);
    }

}
