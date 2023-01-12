package dio.padroesjava.singleton;

public class TestSingleton {
    public static void main(String[] args) {

        //<--Testes relacionados ao Padrão Criacional Singleton-->
        //Permite a criação de uma unica instãncia de uma classe e fornece um modo para recuperá-la.

        SingletonLazy lazy = SingletonLazy.getInstancia(); //Singleton Lazy.
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia(); //Singleton Eager.
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia(); //Singleton Lazy Holder.
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
    }


}
