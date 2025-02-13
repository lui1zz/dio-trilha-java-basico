public class SmartTV {

        boolean ligada=false;
        int canal = 1;
        int volume = 20;

        public void mudarCanal(int novoCanal){
            canal = novoCanal;
        }
        

        public void aumentarCanal(){
            canal++;
            System.out.println("Canal mudado para: "+canal);
        }

         public void diminuirCanal(){
            canal--;
            System.out.println("Canal mudado para: "+canal);   
            }

        public void aumentarVolume(){
            volume++;
            System.out.println("Volume aumentado para: "+volume);
        }
            
        public void diminuirVolume(){
            volume--;
            System.out.println("Volume diminuido para: "+volume);
        }



        public void ligar() {
            ligada = true;
        }

        public void desligar() {
            ligada = false;
        }
}
