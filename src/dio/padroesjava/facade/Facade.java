package dio.padroesjava.facade;

import subsistema.facade.CrmService;
import substistema.cep.facade.CepApi;

//Contexto: Imagine que se tem uma base de cliente e foi solicitado fazer a migração deles para uma nova base ou complementar sua base atual.
//Na sua base de clientes só tem as informações de nome e cep. Então você tem a ideia de consumir uma API de Cep para que a partir dela que vc já tem....
//...a facade consuma esta API e consolide as informações de cep com mais informações que possam te ajudar a entrar em contato
//com este cliente ou tomar novas decisões de negócio a respeito.
public class Facade {
//método para iniciar a migração de clientes.
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep); //consumo da API de cep.
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado); //gravação no subsistema de CRM.
    }

}
