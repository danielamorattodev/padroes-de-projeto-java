package dio.padroesjava.strategy;

public class TestStrategy {
    public static void main(String[] args) {


        //<--Testes relacionados ao Padrão Comportamental Strategy-->
        //Simplifica a variação de algoritmos para a resolução de um mesmo problema.

        //instancia de cada comportamento possível do robo.
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        //criando o robo e atribuindo um comportamento.
        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();


        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();



    }
}
