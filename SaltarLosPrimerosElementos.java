import java.util.List;

public class SaltarLosPrimerosElementos {

    public static void main(String[] args) {
        List<String> peliculas = List.of("Avatar", "Titanic", "Interstellar", "Matrix", "Gladiador");
        List<String> resultado = peliculas.stream().skip(2).toList();
        System.out.println(resultado);
    }

}
