package one.digitalinnovation.gof.singleton;

/*
* Singleton "apressado"
* atrubui a instância logo quando a variável instância for criada
* @author Felipe Zanardo
* */

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {           //deve ser privado para ninguém instanciar externamente
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}
