package one.digitalinnovation.gof.singleton;

/*
* Singleton "preguiçoso"
* não disponibiliza a instância para o usuário
* em um primeiro momento
* @author Felipe Zanardo
* */

public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {           //deve ser privado para ninguém instanciar externamente
        super();
    }

    public static SingletonLazy getInstancia(){
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
