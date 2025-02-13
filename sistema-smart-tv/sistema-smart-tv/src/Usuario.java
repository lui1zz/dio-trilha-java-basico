public class Usuario {

    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.diminuirVolume();

        System.out.println("SmartTV ligada? " + smartTV.ligada);
        System.out.println("Canal Atual? " + smartTV.canal);
        System.out.println("Volume Atual? " + smartTV.volume);


        smartTV.aumentarVolume();
        smartTV.mudarCanal(13);
     System.out.println("Canal Atual? " + smartTV.canal);
        smartTV.ligar();
        System.out.println("Novo status : SmartTV ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo status : SmartTV ligada? " + smartTV.ligada);
    }

}
