package dio.padroesjava.singleton;

public class SingletonLazyHolder { //encapsula a instancia em uma classe interna.

    private static class InstanceHolder { //detentora da instancia
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    public SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia; //neste caso a instancia somente é acessada pelo Holder e instanciada somente quando for solicitada.
    }

}


