import java.util.List;

public class LimitarCantidadDeResultados {

    public static void main(String[] args) {
        List<Integer> puntajes = List.of(980, 950, 920, 900, 870, 840, 810, 790, 760, 740,
                                         720, 700, 680, 660, 640, 620, 600, 580, 560, 540);
        List<Integer> top5 = puntajes.stream().limit(5).toList();
        System.out.println("Top 5 puntajes:");
        System.out.println(top5);
    }

}
