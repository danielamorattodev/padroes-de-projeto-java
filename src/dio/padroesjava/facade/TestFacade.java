package dio.padroesjava.facade;

public class TestFacade {
    public static void main(String[] args) {

        //<--Testes relacionados ao Padrão Estrutural Facade -->.
        //Provê uma interface que reduz a complexidade nas integrações com subsistemas.
        //No caso, a ideia era gravar um cliente no subsistema CRM que consome uma API de cep (outro subsistema) para preenchimento automático.


        Facade facade = new Facade();
        facade.migrarCliente("Daniela", "13473370");

    }
}
