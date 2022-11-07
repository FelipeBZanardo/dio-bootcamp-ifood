package one.digitalinnovation.gof.singleton;

/*
* Singleton "holder"
* encapsula a instância em uma classe interna
* @see <a href="https://stackoverflow.com/a/24018148">Ref</a>
* @author Felipe Zanardo
* */

public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {           //deve ser privado para ninguém instanciar externamente
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}
