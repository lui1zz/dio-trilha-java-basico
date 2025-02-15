import java.util.concurrent.ThreadLocalRandom;;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada>0) {
            double valorDoce = valorAleatorio();
            if(valorDoce>mesada)
            valorDoce = mesada;

            System.out.println("Comprei um doce de R$ " + valorDoce);
            mesada= mesada - valorDoce;
        }
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}
