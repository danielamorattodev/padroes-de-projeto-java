package dio.padroesjava.singleton;

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager(); //instancia antes.

    public SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia(){ //assim o retorno já está pronto.
       return instancia;
    }

}
