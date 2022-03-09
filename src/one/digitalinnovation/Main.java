package one.digitalinnovation;

import one.digitalinnovation.facade.Facade;
import one.digitalinnovation.singletone.Singletone;
import one.digitalinnovation.singletone.Singletoneager;
import one.digitalinnovation.singletone.SingletonelazyHolder;
import one.digitalinnovation.strategy.ComportamentoAgressivo;
import one.digitalinnovation.strategy.ComportamentoDefensiovo;
import one.digitalinnovation.strategy.ComportamentoNormal;
import one.digitalinnovation.strategy.Robo;

public class Main {
    public static void main(String[] args) {

        //Singletone

        Singletone lazy = Singletone.getInstacia();
        System.out.println(lazy);
        lazy = Singletone.getInstacia();
        System.out.println(lazy);

        Singletoneager ager = Singletoneager.getInstacia();
        System.out.println(ager);
        ager = Singletoneager.getInstacia();
        System.out.println(ager);

        SingletonelazyHolder holder = SingletonelazyHolder.getInstacia();
        System.out.println(holder);
        holder = SingletonelazyHolder.getInstacia();
        System.out.println(holder);

        //Strategy

        ComportamentoNormal normal = new ComportamentoNormal();
        ComportamentoDefensiovo defensiovo = new ComportamentoDefensiovo();
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();

        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Douglas", "0000000");

    }
}
