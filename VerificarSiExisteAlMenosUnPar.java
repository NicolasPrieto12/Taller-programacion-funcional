import java.util.List;

public class VerificarSiExisteAlMenosUnPar {

    public static void main(String[] args) {
        List<Integer> numeros = List.of(7, 11, 13, 20, 25);
        boolean hayPar = numeros.stream().anyMatch(n -> n % 2 == 0);
        System.out.println("¿Hay algún par? " + hayPar);
    }

}
