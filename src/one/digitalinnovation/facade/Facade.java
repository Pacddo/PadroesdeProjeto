package one.digitalinnovation.facade;

import Subsistema1.Crmservice;
import Subsistema2.Cepapi;

public class Facade {
    public void migrarCliente(String nome, String cep) {
        String cidade = Cepapi.getInstacia().recuperarCidade(cep);


        Crmservice.gravarCliente(nome,cep,cidade);

    }
}
