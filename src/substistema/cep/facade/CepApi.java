package substistema.cep.facade;

import dio.padroesjava.singleton.SingletonEager;

public class CepApi {
    // API a ser consumida pela Facade e que será utilizada as informações dentro do sistema CRM.
    private static CepApi instancia = new CepApi();

    public CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Arraraquara";
    }

    public String recuperarEstado(String cep) {
        return "SP";
    }
}
