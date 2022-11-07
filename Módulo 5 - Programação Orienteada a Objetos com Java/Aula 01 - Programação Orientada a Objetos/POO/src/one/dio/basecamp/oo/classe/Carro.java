package one.dio.basecamp.oo.classe;

 class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    //--------------------------------------------------------------
    //constructor
    Carro(){

    }

    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }
    //--------------------------------------------------------------
    //get e set
    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque(){
        return capacidadeTanque;
    }
    //---------------------------------------------------------------
    //método encher tanque
    double EncherTanque (double precoGasolina){
        return precoGasolina*capacidadeTanque;
    }


}
