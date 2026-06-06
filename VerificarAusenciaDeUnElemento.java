import java.util.List;

public class VerificarAusenciaDeUnElemento {

    public static void main(String[] args) {
        List<String> usuarios = List.of("juan", "maria", "admin", "pedro", "soporte");
        boolean ningunRoot = usuarios.stream().noneMatch(u -> u.equals("root"));
        System.out.println("¿Ninguno es \"root\"? " + ningunRoot);
    }

}
