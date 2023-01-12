package dio.padroesjava.strategy;

public class Robo { // O robo é o contexto representativo da Strategy

    private Comportamento comportamento; //atribuição do comportamento (interface).

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover(){
        comportamento.mover();
    }
}
