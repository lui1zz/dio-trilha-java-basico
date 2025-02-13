public class Operadores {
    
    public static void main(String[] args) {
        String nomeCompleto = "Luiz " + "Otávio";
        String nomeCerto = "Luiz " + "Otávio";
        System.out.println(nomeCompleto == nomeCerto);
        System.out.println(nomeCompleto);
        String concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);


        int numero = 5;
        System.out.println(- numero);
        System.out.println(numero);

        int numero2 = 5;

        String resultado = "";
        if (numero == numero2)
            resultado = "Iguais";
        else
            resultado = "Diferentes";

        System.out.println(resultado);

        while (numero2 <=9) {
            System.out.println(numero2);
            numero2 = numero2+2;
        }

        resultado = numero==numero2 ? "Iguais" : "Diferentes"; // igual o de cima só que mais enxuto
        System.out.println(resultado);

      
    }

}
