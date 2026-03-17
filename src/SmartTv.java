public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    public void ligada(){
        ligada = true;
    }

    public void desligada(){
        boolean desligada = false;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentandoCanal(){
        canal++;
    }

    public void diminuindoCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume em : " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume em : " + volume);
    }
}
