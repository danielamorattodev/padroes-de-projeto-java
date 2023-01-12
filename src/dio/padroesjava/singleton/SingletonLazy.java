package dio.padroesjava.singleton;

public class SingletonLazy { //tem uma instância dele mesmo.
    private static SingletonLazy instancia;

    public SingletonLazy() { //singleton precisa de um construtor defaul
        super();
    }

    public static SingletonLazy getInstancia(){ //instancia depois, somente quando precisar retornar ela mesma.
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
