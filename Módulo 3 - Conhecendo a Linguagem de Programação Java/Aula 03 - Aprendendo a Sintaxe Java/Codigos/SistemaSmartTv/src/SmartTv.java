public class SmartTv {
    //atributos:
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //métodos:
    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void mudarCanal(int numeroCanal){
        canal = numeroCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }
}
